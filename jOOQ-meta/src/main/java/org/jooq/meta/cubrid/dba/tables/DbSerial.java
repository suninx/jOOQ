/**
 * This class is generated by jOOQ
 */
package org.jooq.meta.cubrid.dba.tables;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DbSerial extends org.jooq.impl.TableImpl<org.jooq.Record> {

	private static final long serialVersionUID = -1258358481;

	/**
	 * The singleton instance of <code>db_serial</code>
	 */
	public static final org.jooq.meta.cubrid.dba.tables.DbSerial DB_SERIAL = new org.jooq.meta.cubrid.dba.tables.DbSerial();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.Record> getRecordType() {
		return org.jooq.Record.class;
	}

	/**
	 * The column <code>db_serial.name</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(1073741823).nullable(false), this, "");

	/**
	 * The column <code>db_serial.owner</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Object> OWNER = createField("owner", org.jooq.impl.SQLDataType.OTHER, this, "");

	/**
	 * The column <code>db_serial.current_val</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigInteger> CURRENT_VAL = createField("current_val", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false), this, "");

	/**
	 * The column <code>db_serial.increment_val</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigInteger> INCREMENT_VAL = createField("increment_val", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false), this, "");

	/**
	 * The column <code>db_serial.max_val</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigInteger> MAX_VAL = createField("max_val", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false), this, "");

	/**
	 * The column <code>db_serial.min_val</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.math.BigInteger> MIN_VAL = createField("min_val", org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(38).nullable(false), this, "");

	/**
	 * The column <code>db_serial.cyclic</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CYCLIC = createField("cyclic", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>db_serial.started</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> STARTED = createField("started", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * The column <code>db_serial.class_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> CLASS_NAME = createField("class_name", org.jooq.impl.SQLDataType.VARCHAR.length(1073741823), this, "");

	/**
	 * The column <code>db_serial.att_name</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.String> ATT_NAME = createField("att_name", org.jooq.impl.SQLDataType.VARCHAR.length(1073741823), this, "");

	/**
	 * The column <code>db_serial.cached_num</code>.
	 */
	public final org.jooq.TableField<org.jooq.Record, java.lang.Integer> CACHED_NUM = createField("cached_num", org.jooq.impl.SQLDataType.INTEGER, this, "");

	/**
	 * Create a <code>db_serial</code> table reference
	 */
	public DbSerial() {
		this("db_serial", null);
	}

	/**
	 * Create an aliased <code>db_serial</code> table reference
	 */
	public DbSerial(java.lang.String alias) {
		this(alias, org.jooq.meta.cubrid.dba.tables.DbSerial.DB_SERIAL);
	}

	private DbSerial(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased) {
		this(alias, aliased, null);
	}

	private DbSerial(java.lang.String alias, org.jooq.Table<org.jooq.Record> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.jooq.meta.cubrid.dba.DefaultSchema.DEFAULT_SCHEMA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.jooq.Record> getPrimaryKey() {
		return org.jooq.meta.cubrid.dba.Keys.DB_SERIAL__PK_DB_SERIAL_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.jooq.Record>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.Record>>asList(org.jooq.meta.cubrid.dba.Keys.DB_SERIAL__PK_DB_SERIAL_NAME);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.meta.cubrid.dba.tables.DbSerial as(java.lang.String alias) {
		return new org.jooq.meta.cubrid.dba.tables.DbSerial(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.jooq.meta.cubrid.dba.tables.DbSerial rename(java.lang.String name) {
		return new org.jooq.meta.cubrid.dba.tables.DbSerial(name, null);
	}
}
