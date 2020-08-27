/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.Names.N_SELECT;
import static org.jooq.impl.Tools.selectQueryImpl;
import static org.jooq.impl.Tools.visitSubquery;
import static org.jooq.impl.Tools.DataKey.DATA_SELECT_ALIASES;

import org.jooq.Clause;
import org.jooq.Context;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Select;
import org.jooq.Table;
import org.jooq.TableOptions;

/**
 * A {@link Select} query that re-aliases its projection, or produces a derived
 * table if re-aliasing is not possible (e.g. in the presence of
 * <code>ORDER BY</code>).
 *
 * @author Lukas Eder
 */
final class AliasedSelect<R extends Record> extends AbstractTable<R> {

    private static final long serialVersionUID = 6763689261249123076L;

    private final Select<R>   query;
    private final Name[]      aliases;

    AliasedSelect(Select<R> query) {
        this(query, Tools.fieldNames(query.getSelect().size()));
    }

    AliasedSelect(Select<R> query, Name... aliases) {
        super(TableOptions.expression(), N_SELECT);

        this.query = query;
        this.aliases = aliases;
    }

    final Select<R> query() {
        return query;
    }

    @Override
    public final Table<R> as(Name alias) {
        SelectQueryImpl<R> q = selectQueryImpl(query);

        if (q != null && (!q.getOrderBy().isEmpty() || Tools.hasEmbeddedFields(q.getSelect())))
            return query.asTable(alias, aliases);
        else
            return new TableAlias<>(this, alias, true);
    }

    @Override
    public final Table<R> as(Name alias, Name... fieldAliases) {
        return new TableAlias<>(this, alias, fieldAliases, true);
    }

    @Override
    final Fields<R> fields0() {
        return new Fields<>(query.asTable(DSL.name("t"), aliases).fields());
    }

    @Override
    public final Class<? extends R> getRecordType() {
        return query.getRecordType();
    }

    @Override
    public final void accept(Context<?> ctx) {
        Object previous = ctx.data(DATA_SELECT_ALIASES);

        ctx.data(DATA_SELECT_ALIASES, aliases);
        visitSubquery(ctx, query);
        ctx.data(DATA_SELECT_ALIASES, previous);
    }

    @Override // Avoid AbstractTable implementation
    public final Clause[] clauses(Context<?> ctx) {
        return null;
    }
}
