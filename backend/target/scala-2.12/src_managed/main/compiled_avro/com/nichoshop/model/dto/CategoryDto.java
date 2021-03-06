/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.nichoshop.model.dto;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class CategoryDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -296653715481782364L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CategoryDto\",\"namespace\":\"com.nichoshop.model.dto\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"parentId\",\"type\":\"int\"},{\"name\":\"name\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"conditionType\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CategoryDto> ENCODER =
      new BinaryMessageEncoder<CategoryDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CategoryDto> DECODER =
      new BinaryMessageDecoder<CategoryDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CategoryDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CategoryDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CategoryDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CategoryDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CategoryDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CategoryDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CategoryDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CategoryDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int id;
   private int parentId;
   private java.lang.String name;
   private java.lang.String conditionType;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CategoryDto() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param parentId The new value for parentId
   * @param name The new value for name
   * @param conditionType The new value for conditionType
   */
  public CategoryDto(java.lang.Integer id, java.lang.Integer parentId, java.lang.String name, java.lang.String conditionType) {
    this.id = id;
    this.parentId = parentId;
    this.name = name;
    this.conditionType = conditionType;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return parentId;
    case 2: return name;
    case 3: return conditionType;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: parentId = (java.lang.Integer)value$; break;
    case 2: name = value$ != null ? value$.toString() : null; break;
    case 3: conditionType = value$ != null ? value$.toString() : null; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public int getId() {
    return id;
  }



  /**
   * Gets the value of the 'parentId' field.
   * @return The value of the 'parentId' field.
   */
  public int getParentId() {
    return parentId;
  }



  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.String getName() {
    return name;
  }



  /**
   * Gets the value of the 'conditionType' field.
   * @return The value of the 'conditionType' field.
   */
  public java.lang.String getConditionType() {
    return conditionType;
  }



  /**
   * Creates a new CategoryDto RecordBuilder.
   * @return A new CategoryDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CategoryDto.Builder newBuilder() {
    return new com.nichoshop.model.dto.CategoryDto.Builder();
  }

  /**
   * Creates a new CategoryDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CategoryDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CategoryDto.Builder newBuilder(com.nichoshop.model.dto.CategoryDto.Builder other) {
    if (other == null) {
      return new com.nichoshop.model.dto.CategoryDto.Builder();
    } else {
      return new com.nichoshop.model.dto.CategoryDto.Builder(other);
    }
  }

  /**
   * Creates a new CategoryDto RecordBuilder by copying an existing CategoryDto instance.
   * @param other The existing instance to copy.
   * @return A new CategoryDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CategoryDto.Builder newBuilder(com.nichoshop.model.dto.CategoryDto other) {
    if (other == null) {
      return new com.nichoshop.model.dto.CategoryDto.Builder();
    } else {
      return new com.nichoshop.model.dto.CategoryDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for CategoryDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CategoryDto>
    implements org.apache.avro.data.RecordBuilder<CategoryDto> {

    private int id;
    private int parentId;
    private java.lang.String name;
    private java.lang.String conditionType;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.nichoshop.model.dto.CategoryDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.parentId)) {
        this.parentId = data().deepCopy(fields()[1].schema(), other.parentId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.conditionType)) {
        this.conditionType = data().deepCopy(fields()[3].schema(), other.conditionType);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing CategoryDto instance
     * @param other The existing instance to copy.
     */
    private Builder(com.nichoshop.model.dto.CategoryDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.parentId)) {
        this.parentId = data().deepCopy(fields()[1].schema(), other.parentId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.name)) {
        this.name = data().deepCopy(fields()[2].schema(), other.name);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.conditionType)) {
        this.conditionType = data().deepCopy(fields()[3].schema(), other.conditionType);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public int getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder setId(int value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'parentId' field.
      * @return The value.
      */
    public int getParentId() {
      return parentId;
    }


    /**
      * Sets the value of the 'parentId' field.
      * @param value The value of 'parentId'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder setParentId(int value) {
      validate(fields()[1], value);
      this.parentId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'parentId' field has been set.
      * @return True if the 'parentId' field has been set, false otherwise.
      */
    public boolean hasParentId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'parentId' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder clearParentId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.String getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder setName(java.lang.String value) {
      validate(fields()[2], value);
      this.name = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder clearName() {
      name = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'conditionType' field.
      * @return The value.
      */
    public java.lang.String getConditionType() {
      return conditionType;
    }


    /**
      * Sets the value of the 'conditionType' field.
      * @param value The value of 'conditionType'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder setConditionType(java.lang.String value) {
      validate(fields()[3], value);
      this.conditionType = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'conditionType' field has been set.
      * @return True if the 'conditionType' field has been set, false otherwise.
      */
    public boolean hasConditionType() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'conditionType' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CategoryDto.Builder clearConditionType() {
      conditionType = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CategoryDto build() {
      try {
        CategoryDto record = new CategoryDto();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.parentId = fieldSetFlags()[1] ? this.parentId : (java.lang.Integer) defaultValue(fields()[1]);
        record.name = fieldSetFlags()[2] ? this.name : (java.lang.String) defaultValue(fields()[2]);
        record.conditionType = fieldSetFlags()[3] ? this.conditionType : (java.lang.String) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CategoryDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<CategoryDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CategoryDto>
    READER$ = (org.apache.avro.io.DatumReader<CategoryDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.id);

    out.writeInt(this.parentId);

    out.writeString(this.name);

    if (this.conditionType == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.conditionType);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readInt();

      this.parentId = in.readInt();

      this.name = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.conditionType = null;
      } else {
        this.conditionType = in.readString();
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readInt();
          break;

        case 1:
          this.parentId = in.readInt();
          break;

        case 2:
          this.name = in.readString();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.conditionType = null;
          } else {
            this.conditionType = in.readString();
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










