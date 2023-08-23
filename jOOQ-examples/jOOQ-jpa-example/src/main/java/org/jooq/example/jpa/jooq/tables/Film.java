/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables;


import java.time.Year;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.example.jpa.jooq.DefaultSchema;
import org.jooq.example.jpa.jooq.Keys;
import org.jooq.example.jpa.jooq.tables.Actor.ActorPath;
import org.jooq.example.jpa.jooq.tables.FilmActor.FilmActorPath;
import org.jooq.example.jpa.jooq.tables.Language.LanguagePath;
import org.jooq.example.jpa.jooq.tables.records.FilmRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Film extends TableImpl<FilmRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>FILM</code>
     */
    public static final Film FILM = new Film();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmRecord> getRecordType() {
        return FilmRecord.class;
    }

    /**
     * The column <code>FILM.FILMID</code>.
     */
    public final TableField<FilmRecord, Integer> FILMID = createField(DSL.name("FILMID"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>FILM.LENGTH</code>.
     */
    public final TableField<FilmRecord, Integer> LENGTH = createField(DSL.name("LENGTH"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>FILM.RELEASE_YEAR</code>.
     */
    public final TableField<FilmRecord, Year> RELEASE_YEAR = createField(DSL.name("RELEASE_YEAR"), SQLDataType.INTEGER, this, "", new org.jooq.impl.JPAConverter(org.jooq.example.jpa.converters.YearConverter.class));

    /**
     * The column <code>FILM.TITLE</code>.
     */
    public final TableField<FilmRecord, String> TITLE = createField(DSL.name("TITLE"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>FILM.LANGUAGE_LANGUAGEID</code>.
     */
    public final TableField<FilmRecord, Integer> LANGUAGE_LANGUAGEID = createField(DSL.name("LANGUAGE_LANGUAGEID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>FILM.ORIGINALLANGUAGE_LANGUAGEID</code>.
     */
    public final TableField<FilmRecord, Integer> ORIGINALLANGUAGE_LANGUAGEID = createField(DSL.name("ORIGINALLANGUAGE_LANGUAGEID"), SQLDataType.INTEGER, this, "");

    private Film(Name alias, Table<FilmRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Film(Name alias, Table<FilmRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>FILM</code> table reference
     */
    public Film(String alias) {
        this(DSL.name(alias), FILM);
    }

    /**
     * Create an aliased <code>FILM</code> table reference
     */
    public Film(Name alias) {
        this(alias, FILM);
    }

    /**
     * Create a <code>FILM</code> table reference
     */
    public Film() {
        this(DSL.name("FILM"), null);
    }

    public <O extends Record> Film(Table<O> path, ForeignKey<O, FilmRecord> childPath, InverseForeignKey<O, FilmRecord> parentPath) {
        super(path, childPath, parentPath, FILM);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class FilmPath extends Film implements Path<FilmRecord> {
        public <O extends Record> FilmPath(Table<O> path, ForeignKey<O, FilmRecord> childPath, InverseForeignKey<O, FilmRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private FilmPath(Name alias, Table<FilmRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public FilmPath as(String alias) {
            return new FilmPath(DSL.name(alias), this);
        }

        @Override
        public FilmPath as(Name alias) {
            return new FilmPath(alias, this);
        }

        @Override
        public FilmPath as(Table<?> alias) {
            return new FilmPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : DefaultSchema.DEFAULT_SCHEMA;
    }

    @Override
    public UniqueKey<FilmRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_2;
    }

    @Override
    public List<ForeignKey<FilmRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FKD2YJC1RU34H1SMWLA3FX7B6NX, Keys.FKN2UB730RPO5B5E9X6U2LWL9FT);
    }

    private transient LanguagePath _fkd2yjc1ru34h1smwla3fx7b6nx;

    /**
     * Get the implicit join path to the <code>PUBLIC.LANGUAGE</code> table, via
     * the <code>FKD2YJC1RU34H1SMWLA3FX7B6NX</code> key.
     */
    public LanguagePath fkd2yjc1ru34h1smwla3fx7b6nx() {
        if (_fkd2yjc1ru34h1smwla3fx7b6nx == null)
            _fkd2yjc1ru34h1smwla3fx7b6nx = new LanguagePath(this, Keys.FKD2YJC1RU34H1SMWLA3FX7B6NX, null);

        return _fkd2yjc1ru34h1smwla3fx7b6nx;
    }

    private transient LanguagePath _fkn2ub730rpo5b5e9x6u2lwl9ft;

    /**
     * Get the implicit join path to the <code>PUBLIC.LANGUAGE</code> table, via
     * the <code>FKN2UB730RPO5B5E9X6U2LWL9FT</code> key.
     */
    public LanguagePath fkn2ub730rpo5b5e9x6u2lwl9ft() {
        if (_fkn2ub730rpo5b5e9x6u2lwl9ft == null)
            _fkn2ub730rpo5b5e9x6u2lwl9ft = new LanguagePath(this, Keys.FKN2UB730RPO5B5E9X6U2LWL9FT, null);

        return _fkn2ub730rpo5b5e9x6u2lwl9ft;
    }

    private transient FilmActorPath _filmActor;

    /**
     * Get the implicit to-many join path to the <code>PUBLIC.FILM_ACTOR</code>
     * table
     */
    public FilmActorPath filmActor() {
        if (_filmActor == null)
            _filmActor = new FilmActorPath(this, null, Keys.FK3FSUXQ0JJ1XONRE7BHROOPVBX.getInverseKey());

        return _filmActor;
    }

    /**
     * Get the implicit many-to-many join path to the <code>PUBLIC.ACTOR</code>
     * table
     */
    public ActorPath actor() {
        return filmActor().actor();
    }

    @Override
    public Film as(String alias) {
        return new Film(DSL.name(alias), this);
    }

    @Override
    public Film as(Name alias) {
        return new Film(alias, this);
    }

    @Override
    public Film as(Table<?> alias) {
        return new Film(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(String name) {
        return new Film(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Name name) {
        return new Film(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Film rename(Table<?> name) {
        return new Film(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Condition condition) {
        return new Film(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Film where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Film whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
