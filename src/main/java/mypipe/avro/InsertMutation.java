/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package mypipe.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class InsertMutation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4044745806096524978L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"InsertMutation\",\"namespace\":\"mypipe.avro\",\"fields\":[{\"name\":\"database\",\"type\":\"string\"},{\"name\":\"table\",\"type\":\"string\"},{\"name\":\"tableId\",\"type\":\"long\"},{\"name\":\"txid\",\"type\":[\"null\",{\"type\":\"fixed\",\"name\":\"Guid\",\"size\":16}],\"default\":\"null\"},{\"name\":\"timestamp\",\"type\":\"long\"},{\"name\":\"integers\",\"type\":{\"type\":\"map\",\"values\":\"int\"}},{\"name\":\"strings\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"longs\",\"type\":{\"type\":\"map\",\"values\":\"long\"}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<InsertMutation> ENCODER =
      new BinaryMessageEncoder<InsertMutation>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<InsertMutation> DECODER =
      new BinaryMessageDecoder<InsertMutation>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<InsertMutation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<InsertMutation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<InsertMutation>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this InsertMutation to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a InsertMutation from a ByteBuffer. */
  public static InsertMutation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence database;
  @Deprecated public java.lang.CharSequence table;
  @Deprecated public long tableId;
  @Deprecated public mypipe.avro.Guid txid;
  @Deprecated public long timestamp;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Integer> integers;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> strings;
  @Deprecated public java.util.Map<java.lang.CharSequence,java.lang.Long> longs;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public InsertMutation() {}

  /**
   * All-args constructor.
   * @param database The new value for database
   * @param table The new value for table
   * @param tableId The new value for tableId
   * @param txid The new value for txid
   * @param timestamp The new value for timestamp
   * @param integers The new value for integers
   * @param strings The new value for strings
   * @param longs The new value for longs
   */
  public InsertMutation(java.lang.CharSequence database, java.lang.CharSequence table, java.lang.Long tableId, mypipe.avro.Guid txid, java.lang.Long timestamp, java.util.Map<java.lang.CharSequence,java.lang.Integer> integers, java.util.Map<java.lang.CharSequence,java.lang.CharSequence> strings, java.util.Map<java.lang.CharSequence,java.lang.Long> longs) {
    this.database = database;
    this.table = table;
    this.tableId = tableId;
    this.txid = txid;
    this.timestamp = timestamp;
    this.integers = integers;
    this.strings = strings;
    this.longs = longs;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return database;
    case 1: return table;
    case 2: return tableId;
    case 3: return txid;
    case 4: return timestamp;
    case 5: return integers;
    case 6: return strings;
    case 7: return longs;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: database = (java.lang.CharSequence)value$; break;
    case 1: table = (java.lang.CharSequence)value$; break;
    case 2: tableId = (java.lang.Long)value$; break;
    case 3: txid = (mypipe.avro.Guid)value$; break;
    case 4: timestamp = (java.lang.Long)value$; break;
    case 5: integers = (java.util.Map<java.lang.CharSequence,java.lang.Integer>)value$; break;
    case 6: strings = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 7: longs = (java.util.Map<java.lang.CharSequence,java.lang.Long>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'database' field.
   * @return The value of the 'database' field.
   */
  public java.lang.CharSequence getDatabase() {
    return database;
  }

  /**
   * Sets the value of the 'database' field.
   * @param value the value to set.
   */
  public void setDatabase(java.lang.CharSequence value) {
    this.database = value;
  }

  /**
   * Gets the value of the 'table' field.
   * @return The value of the 'table' field.
   */
  public java.lang.CharSequence getTable() {
    return table;
  }

  /**
   * Sets the value of the 'table' field.
   * @param value the value to set.
   */
  public void setTable(java.lang.CharSequence value) {
    this.table = value;
  }

  /**
   * Gets the value of the 'tableId' field.
   * @return The value of the 'tableId' field.
   */
  public java.lang.Long getTableId() {
    return tableId;
  }

  /**
   * Sets the value of the 'tableId' field.
   * @param value the value to set.
   */
  public void setTableId(java.lang.Long value) {
    this.tableId = value;
  }

  /**
   * Gets the value of the 'txid' field.
   * @return The value of the 'txid' field.
   */
  public mypipe.avro.Guid getTxid() {
    return txid;
  }

  /**
   * Sets the value of the 'txid' field.
   * @param value the value to set.
   */
  public void setTxid(mypipe.avro.Guid value) {
    this.txid = value;
  }

  /**
   * Gets the value of the 'timestamp' field.
   * @return The value of the 'timestamp' field.
   */
  public java.lang.Long getTimestamp() {
    return timestamp;
  }

  /**
   * Sets the value of the 'timestamp' field.
   * @param value the value to set.
   */
  public void setTimestamp(java.lang.Long value) {
    this.timestamp = value;
  }

  /**
   * Gets the value of the 'integers' field.
   * @return The value of the 'integers' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Integer> getIntegers() {
    return integers;
  }

  /**
   * Sets the value of the 'integers' field.
   * @param value the value to set.
   */
  public void setIntegers(java.util.Map<java.lang.CharSequence,java.lang.Integer> value) {
    this.integers = value;
  }

  /**
   * Gets the value of the 'strings' field.
   * @return The value of the 'strings' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getStrings() {
    return strings;
  }

  /**
   * Sets the value of the 'strings' field.
   * @param value the value to set.
   */
  public void setStrings(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.strings = value;
  }

  /**
   * Gets the value of the 'longs' field.
   * @return The value of the 'longs' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.Long> getLongs() {
    return longs;
  }

  /**
   * Sets the value of the 'longs' field.
   * @param value the value to set.
   */
  public void setLongs(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
    this.longs = value;
  }

  /**
   * Creates a new InsertMutation RecordBuilder.
   * @return A new InsertMutation RecordBuilder
   */
  public static mypipe.avro.InsertMutation.Builder newBuilder() {
    return new mypipe.avro.InsertMutation.Builder();
  }

  /**
   * Creates a new InsertMutation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new InsertMutation RecordBuilder
   */
  public static mypipe.avro.InsertMutation.Builder newBuilder(mypipe.avro.InsertMutation.Builder other) {
    return new mypipe.avro.InsertMutation.Builder(other);
  }

  /**
   * Creates a new InsertMutation RecordBuilder by copying an existing InsertMutation instance.
   * @param other The existing instance to copy.
   * @return A new InsertMutation RecordBuilder
   */
  public static mypipe.avro.InsertMutation.Builder newBuilder(mypipe.avro.InsertMutation other) {
    return new mypipe.avro.InsertMutation.Builder(other);
  }

  /**
   * RecordBuilder for InsertMutation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<InsertMutation>
    implements org.apache.avro.data.RecordBuilder<InsertMutation> {

    private java.lang.CharSequence database;
    private java.lang.CharSequence table;
    private long tableId;
    private mypipe.avro.Guid txid;
    private long timestamp;
    private java.util.Map<java.lang.CharSequence,java.lang.Integer> integers;
    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> strings;
    private java.util.Map<java.lang.CharSequence,java.lang.Long> longs;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(mypipe.avro.InsertMutation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.database)) {
        this.database = data().deepCopy(fields()[0].schema(), other.database);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.table)) {
        this.table = data().deepCopy(fields()[1].schema(), other.table);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tableId)) {
        this.tableId = data().deepCopy(fields()[2].schema(), other.tableId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.txid)) {
        this.txid = data().deepCopy(fields()[3].schema(), other.txid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.integers)) {
        this.integers = data().deepCopy(fields()[5].schema(), other.integers);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.strings)) {
        this.strings = data().deepCopy(fields()[6].schema(), other.strings);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.longs)) {
        this.longs = data().deepCopy(fields()[7].schema(), other.longs);
        fieldSetFlags()[7] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing InsertMutation instance
     * @param other The existing instance to copy.
     */
    private Builder(mypipe.avro.InsertMutation other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.database)) {
        this.database = data().deepCopy(fields()[0].schema(), other.database);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.table)) {
        this.table = data().deepCopy(fields()[1].schema(), other.table);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.tableId)) {
        this.tableId = data().deepCopy(fields()[2].schema(), other.tableId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.txid)) {
        this.txid = data().deepCopy(fields()[3].schema(), other.txid);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.timestamp)) {
        this.timestamp = data().deepCopy(fields()[4].schema(), other.timestamp);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.integers)) {
        this.integers = data().deepCopy(fields()[5].schema(), other.integers);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.strings)) {
        this.strings = data().deepCopy(fields()[6].schema(), other.strings);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.longs)) {
        this.longs = data().deepCopy(fields()[7].schema(), other.longs);
        fieldSetFlags()[7] = true;
      }
    }

    /**
      * Gets the value of the 'database' field.
      * @return The value.
      */
    public java.lang.CharSequence getDatabase() {
      return database;
    }

    /**
      * Sets the value of the 'database' field.
      * @param value The value of 'database'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setDatabase(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.database = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'database' field has been set.
      * @return True if the 'database' field has been set, false otherwise.
      */
    public boolean hasDatabase() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'database' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearDatabase() {
      database = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'table' field.
      * @return The value.
      */
    public java.lang.CharSequence getTable() {
      return table;
    }

    /**
      * Sets the value of the 'table' field.
      * @param value The value of 'table'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setTable(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.table = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'table' field has been set.
      * @return True if the 'table' field has been set, false otherwise.
      */
    public boolean hasTable() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'table' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearTable() {
      table = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'tableId' field.
      * @return The value.
      */
    public java.lang.Long getTableId() {
      return tableId;
    }

    /**
      * Sets the value of the 'tableId' field.
      * @param value The value of 'tableId'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setTableId(long value) {
      validate(fields()[2], value);
      this.tableId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'tableId' field has been set.
      * @return True if the 'tableId' field has been set, false otherwise.
      */
    public boolean hasTableId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'tableId' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearTableId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'txid' field.
      * @return The value.
      */
    public mypipe.avro.Guid getTxid() {
      return txid;
    }

    /**
      * Sets the value of the 'txid' field.
      * @param value The value of 'txid'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setTxid(mypipe.avro.Guid value) {
      validate(fields()[3], value);
      this.txid = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'txid' field has been set.
      * @return True if the 'txid' field has been set, false otherwise.
      */
    public boolean hasTxid() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'txid' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearTxid() {
      txid = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'timestamp' field.
      * @return The value.
      */
    public java.lang.Long getTimestamp() {
      return timestamp;
    }

    /**
      * Sets the value of the 'timestamp' field.
      * @param value The value of 'timestamp'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setTimestamp(long value) {
      validate(fields()[4], value);
      this.timestamp = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'timestamp' field has been set.
      * @return True if the 'timestamp' field has been set, false otherwise.
      */
    public boolean hasTimestamp() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'timestamp' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearTimestamp() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'integers' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Integer> getIntegers() {
      return integers;
    }

    /**
      * Sets the value of the 'integers' field.
      * @param value The value of 'integers'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setIntegers(java.util.Map<java.lang.CharSequence,java.lang.Integer> value) {
      validate(fields()[5], value);
      this.integers = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'integers' field has been set.
      * @return True if the 'integers' field has been set, false otherwise.
      */
    public boolean hasIntegers() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'integers' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearIntegers() {
      integers = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'strings' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getStrings() {
      return strings;
    }

    /**
      * Sets the value of the 'strings' field.
      * @param value The value of 'strings'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setStrings(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[6], value);
      this.strings = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'strings' field has been set.
      * @return True if the 'strings' field has been set, false otherwise.
      */
    public boolean hasStrings() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'strings' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearStrings() {
      strings = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'longs' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.Long> getLongs() {
      return longs;
    }

    /**
      * Sets the value of the 'longs' field.
      * @param value The value of 'longs'.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder setLongs(java.util.Map<java.lang.CharSequence,java.lang.Long> value) {
      validate(fields()[7], value);
      this.longs = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'longs' field has been set.
      * @return True if the 'longs' field has been set, false otherwise.
      */
    public boolean hasLongs() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'longs' field.
      * @return This builder.
      */
    public mypipe.avro.InsertMutation.Builder clearLongs() {
      longs = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public InsertMutation build() {
      try {
        InsertMutation record = new InsertMutation();
        record.database = fieldSetFlags()[0] ? this.database : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.table = fieldSetFlags()[1] ? this.table : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.tableId = fieldSetFlags()[2] ? this.tableId : (java.lang.Long) defaultValue(fields()[2]);
        record.txid = fieldSetFlags()[3] ? this.txid : (mypipe.avro.Guid) defaultValue(fields()[3]);
        record.timestamp = fieldSetFlags()[4] ? this.timestamp : (java.lang.Long) defaultValue(fields()[4]);
        record.integers = fieldSetFlags()[5] ? this.integers : (java.util.Map<java.lang.CharSequence,java.lang.Integer>) defaultValue(fields()[5]);
        record.strings = fieldSetFlags()[6] ? this.strings : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[6]);
        record.longs = fieldSetFlags()[7] ? this.longs : (java.util.Map<java.lang.CharSequence,java.lang.Long>) defaultValue(fields()[7]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<InsertMutation>
    WRITER$ = (org.apache.avro.io.DatumWriter<InsertMutation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<InsertMutation>
    READER$ = (org.apache.avro.io.DatumReader<InsertMutation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
