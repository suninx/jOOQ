/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables.records;


import org.jooq.example.testcontainersflyway.db.tables.CustomerList;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerListRecord extends TableRecordImpl<CustomerListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.customer_list.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.customer_list.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.customer_list.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.customer_list.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.customer_list.address</code>.
     */
    public void setAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.customer_list.address</code>.
     */
    public String getAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.customer_list.zip code</code>.
     */
    public void setZipCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.customer_list.zip code</code>.
     */
    public String getZipCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.customer_list.phone</code>.
     */
    public void setPhone(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.customer_list.phone</code>.
     */
    public String getPhone() {
        return (String) get(4);
    }

    /**
     * Setter for <code>public.customer_list.city</code>.
     */
    public void setCity(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.customer_list.city</code>.
     */
    public String getCity() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.customer_list.country</code>.
     */
    public void setCountry(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.customer_list.country</code>.
     */
    public String getCountry() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.customer_list.notes</code>.
     */
    public void setNotes(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.customer_list.notes</code>.
     */
    public String getNotes() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.customer_list.sid</code>.
     */
    public void setSid(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>public.customer_list.sid</code>.
     */
    public Long getSid() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CustomerListRecord
     */
    public CustomerListRecord() {
        super(CustomerList.CUSTOMER_LIST);
    }

    /**
     * Create a detached, initialised CustomerListRecord
     */
    public CustomerListRecord(Long id, String name, String address, String zipCode, String phone, String city, String country, String notes, Long sid) {
        super(CustomerList.CUSTOMER_LIST);

        setId(id);
        setName(name);
        setAddress(address);
        setZipCode(zipCode);
        setPhone(phone);
        setCity(city);
        setCountry(country);
        setNotes(notes);
        setSid(sid);
        resetChangedOnNotNull();
    }
}
