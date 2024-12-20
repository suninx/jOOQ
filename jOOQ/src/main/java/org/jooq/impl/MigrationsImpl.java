/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
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
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
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

import static java.util.Collections.emptyList;
import static org.jooq.Commit.ROOT;

import org.jooq.Commit;
import org.jooq.Commits;
import org.jooq.Configuration;
import org.jooq.ContentType;
import org.jooq.File;
import org.jooq.History;
import org.jooq.Migration;
import org.jooq.Migrations;
import org.jooq.Version;

/**
 * @author Lukas Eder
 */
final class MigrationsImpl extends AbstractScope implements Migrations {

    MigrationsImpl(Configuration configuration) {
        super(configuration);
    }

    @Override
    public final File file(String path, String content, ContentType type) {
        return new FileImpl(path, content, type);
    }

    @Override
    public final History history() {
        return new HistoryImpl(configuration());
    }

    @Override
    public final Version version(String id) {
        return new VersionImpl(configuration(), id);
    }

    @Override
    public final Commits commits() {
        return new CommitsImpl(configuration(), new CommitImpl(configuration(), ROOT, null, null, null, emptyList(), emptyList(), true));
    }

    @Override
    public final Migration migrateTo(Commit to) {
        return new MigrationImpl(configuration(), to);
    }
}
