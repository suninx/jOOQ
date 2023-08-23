/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.r2dbc.db.tables.records;


import org.jooq.Record1;
import org.jooq.example.r2dbc.db.tables.Book;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookRecord extends UpdatableRecordImpl<BookRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>R2DBC_EXAMPLE.BOOK.ID</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>R2DBC_EXAMPLE.BOOK.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>R2DBC_EXAMPLE.BOOK.AUTHOR_ID</code>.
     */
    public void setAuthorId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>R2DBC_EXAMPLE.BOOK.AUTHOR_ID</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>R2DBC_EXAMPLE.BOOK.TITLE</code>.
     */
    public void setTitle(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>R2DBC_EXAMPLE.BOOK.TITLE</code>.
     */
    public String getTitle() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BookRecord
     */
    public BookRecord() {
        super(Book.BOOK);
    }

    /**
     * Create a detached, initialised BookRecord
     */
    public BookRecord(Integer id, Integer authorId, String title) {
        super(Book.BOOK);

        setId(id);
        setAuthorId(authorId);
        setTitle(title);
        resetChangedOnNotNull();
    }
}
