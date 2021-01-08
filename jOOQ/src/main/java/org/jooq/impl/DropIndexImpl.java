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

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.impl.*;
import org.jooq.tools.*;

import java.util.*;


/**
 * The <code>DROP INDEX</code> statement.
 */
@SuppressWarnings({ "hiding", "rawtypes", "unused" })
final class DropIndexImpl
extends
    AbstractRowCountQuery
implements
    DropIndexOnStep,
    DropIndexCascadeStep,
    DropIndexFinalStep
{

    private static final long serialVersionUID = 1L;

    private final Index    index;
    private final boolean  dropIndexIfExists;
    private       Table<?> on;
    private       Boolean  cascade;

    DropIndexImpl(
        Configuration configuration,
        Index index,
        boolean dropIndexIfExists
    ) {
        this(
            configuration,
            index,
            dropIndexIfExists,
            null,
            null
        );
    }

    DropIndexImpl(
        Configuration configuration,
        Index index,
        boolean dropIndexIfExists,
        Table<?> on,
        Boolean cascade
    ) {
        super(configuration);

        this.index = index;
        this.dropIndexIfExists = dropIndexIfExists;
        this.on = on;
        this.cascade = cascade;
    }

    final Index    $index()             { return index; }
    final boolean  $dropIndexIfExists() { return dropIndexIfExists; }
    final Table<?> $on()                { return on; }
    final Boolean  $cascade()           { return cascade; }

    // -------------------------------------------------------------------------
    // XXX: DSL API
    // -------------------------------------------------------------------------

    @Override
    public final DropIndexImpl on(String on) {
        return on(DSL.table(DSL.name(on)));
    }

    @Override
    public final DropIndexImpl on(Name on) {
        return on(DSL.table(on));
    }

    @Override
    public final DropIndexImpl on(Table<?> on) {
        this.on = on;
        return this;
    }

    @Override
    public final DropIndexImpl cascade() {
        this.cascade = true;
        return this;
    }

    @Override
    public final DropIndexImpl restrict() {
        this.cascade = false;
        return this;
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    private static final Clause[]        CLAUSES              = { Clause.DROP_INDEX };
    private static final Set<SQLDialect> NO_SUPPORT_IF_EXISTS = SQLDialect.supportedBy(CUBRID, DERBY, FIREBIRD);
    private static final Set<SQLDialect> REQUIRES_ON          = SQLDialect.supportedBy(MARIADB, MYSQL);

    private final boolean supportsIfExists(Context<?> ctx) {
        return !NO_SUPPORT_IF_EXISTS.contains(ctx.dialect());
    }

    @Override
    public final void accept(Context<?> ctx) {
        if (dropIndexIfExists && !supportsIfExists(ctx)) {
            beginTryCatch(ctx, DDLStatementType.DROP_INDEX);
            accept0(ctx);
            endTryCatch(ctx, DDLStatementType.DROP_INDEX);
        }
        else
            accept0(ctx);
    }

    private void accept0(Context<?> ctx) {
        ctx.visit(K_DROP_INDEX).sql(' ');

        if (dropIndexIfExists && supportsIfExists(ctx))
            ctx.visit(K_IF_EXISTS).sql(' ');






        ctx.visit(index);

        if (on != null && REQUIRES_ON.contains(ctx.dialect()))
            ctx.sql(' ').visit(K_ON).sql(' ').visit(on);

        if (cascade != null)
            ctx.sql(' ').visit(cascade ? K_CASCADE : K_RESTRICT);
    }

    @Override
    public final Clause[] clauses(Context<?> ctx) {
        return CLAUSES;
    }


}
