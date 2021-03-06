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
public class AddressDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1424850488036810259L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AddressDto\",\"namespace\":\"com.nichoshop.model.dto\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"userId\",\"type\":\"int\"},{\"name\":\"addressLine1\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"addressLine2\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"city\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"state\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null},{\"name\":\"zip\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"country\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"phones\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"string\",\"avro.java.string\":\"String\"}}],\"default\":null},{\"name\":\"addressIsVerified\",\"type\":\"boolean\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AddressDto> ENCODER =
      new BinaryMessageEncoder<AddressDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AddressDto> DECODER =
      new BinaryMessageDecoder<AddressDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AddressDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AddressDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AddressDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AddressDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AddressDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AddressDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AddressDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AddressDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int id;
   private int userId;
   private java.lang.String addressLine1;
   private java.lang.String addressLine2;
   private java.lang.String city;
   private java.lang.String state;
   private java.lang.String zip;
   private java.lang.String country;
   private java.util.List<java.lang.String> phones;
   private boolean addressIsVerified;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AddressDto() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param userId The new value for userId
   * @param addressLine1 The new value for addressLine1
   * @param addressLine2 The new value for addressLine2
   * @param city The new value for city
   * @param state The new value for state
   * @param zip The new value for zip
   * @param country The new value for country
   * @param phones The new value for phones
   * @param addressIsVerified The new value for addressIsVerified
   */
  public AddressDto(java.lang.Integer id, java.lang.Integer userId, java.lang.String addressLine1, java.lang.String addressLine2, java.lang.String city, java.lang.String state, java.lang.String zip, java.lang.String country, java.util.List<java.lang.String> phones, java.lang.Boolean addressIsVerified) {
    this.id = id;
    this.userId = userId;
    this.addressLine1 = addressLine1;
    this.addressLine2 = addressLine2;
    this.city = city;
    this.state = state;
    this.zip = zip;
    this.country = country;
    this.phones = phones;
    this.addressIsVerified = addressIsVerified;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return userId;
    case 2: return addressLine1;
    case 3: return addressLine2;
    case 4: return city;
    case 5: return state;
    case 6: return zip;
    case 7: return country;
    case 8: return phones;
    case 9: return addressIsVerified;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.Integer)value$; break;
    case 1: userId = (java.lang.Integer)value$; break;
    case 2: addressLine1 = value$ != null ? value$.toString() : null; break;
    case 3: addressLine2 = value$ != null ? value$.toString() : null; break;
    case 4: city = value$ != null ? value$.toString() : null; break;
    case 5: state = value$ != null ? value$.toString() : null; break;
    case 6: zip = value$ != null ? value$.toString() : null; break;
    case 7: country = value$ != null ? value$.toString() : null; break;
    case 8: phones = (java.util.List<java.lang.String>)value$; break;
    case 9: addressIsVerified = (java.lang.Boolean)value$; break;
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
   * Gets the value of the 'userId' field.
   * @return The value of the 'userId' field.
   */
  public int getUserId() {
    return userId;
  }



  /**
   * Gets the value of the 'addressLine1' field.
   * @return The value of the 'addressLine1' field.
   */
  public java.lang.String getAddressLine1() {
    return addressLine1;
  }



  /**
   * Gets the value of the 'addressLine2' field.
   * @return The value of the 'addressLine2' field.
   */
  public java.lang.String getAddressLine2() {
    return addressLine2;
  }



  /**
   * Gets the value of the 'city' field.
   * @return The value of the 'city' field.
   */
  public java.lang.String getCity() {
    return city;
  }



  /**
   * Gets the value of the 'state' field.
   * @return The value of the 'state' field.
   */
  public java.lang.String getState() {
    return state;
  }



  /**
   * Gets the value of the 'zip' field.
   * @return The value of the 'zip' field.
   */
  public java.lang.String getZip() {
    return zip;
  }



  /**
   * Gets the value of the 'country' field.
   * @return The value of the 'country' field.
   */
  public java.lang.String getCountry() {
    return country;
  }



  /**
   * Gets the value of the 'phones' field.
   * @return The value of the 'phones' field.
   */
  public java.util.List<java.lang.String> getPhones() {
    return phones;
  }



  /**
   * Gets the value of the 'addressIsVerified' field.
   * @return The value of the 'addressIsVerified' field.
   */
  public boolean getAddressIsVerified() {
    return addressIsVerified;
  }



  /**
   * Creates a new AddressDto RecordBuilder.
   * @return A new AddressDto RecordBuilder
   */
  public static com.nichoshop.model.dto.AddressDto.Builder newBuilder() {
    return new com.nichoshop.model.dto.AddressDto.Builder();
  }

  /**
   * Creates a new AddressDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AddressDto RecordBuilder
   */
  public static com.nichoshop.model.dto.AddressDto.Builder newBuilder(com.nichoshop.model.dto.AddressDto.Builder other) {
    if (other == null) {
      return new com.nichoshop.model.dto.AddressDto.Builder();
    } else {
      return new com.nichoshop.model.dto.AddressDto.Builder(other);
    }
  }

  /**
   * Creates a new AddressDto RecordBuilder by copying an existing AddressDto instance.
   * @param other The existing instance to copy.
   * @return A new AddressDto RecordBuilder
   */
  public static com.nichoshop.model.dto.AddressDto.Builder newBuilder(com.nichoshop.model.dto.AddressDto other) {
    if (other == null) {
      return new com.nichoshop.model.dto.AddressDto.Builder();
    } else {
      return new com.nichoshop.model.dto.AddressDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for AddressDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AddressDto>
    implements org.apache.avro.data.RecordBuilder<AddressDto> {

    private int id;
    private int userId;
    private java.lang.String addressLine1;
    private java.lang.String addressLine2;
    private java.lang.String city;
    private java.lang.String state;
    private java.lang.String zip;
    private java.lang.String country;
    private java.util.List<java.lang.String> phones;
    private boolean addressIsVerified;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.nichoshop.model.dto.AddressDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.addressLine1)) {
        this.addressLine1 = data().deepCopy(fields()[2].schema(), other.addressLine1);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.addressLine2)) {
        this.addressLine2 = data().deepCopy(fields()[3].schema(), other.addressLine2);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.city)) {
        this.city = data().deepCopy(fields()[4].schema(), other.city);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.state)) {
        this.state = data().deepCopy(fields()[5].schema(), other.state);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (isValidValue(fields()[6], other.zip)) {
        this.zip = data().deepCopy(fields()[6].schema(), other.zip);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (isValidValue(fields()[7], other.country)) {
        this.country = data().deepCopy(fields()[7].schema(), other.country);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.phones)) {
        this.phones = data().deepCopy(fields()[8].schema(), other.phones);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.addressIsVerified)) {
        this.addressIsVerified = data().deepCopy(fields()[9].schema(), other.addressIsVerified);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
    }

    /**
     * Creates a Builder by copying an existing AddressDto instance
     * @param other The existing instance to copy.
     */
    private Builder(com.nichoshop.model.dto.AddressDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.userId)) {
        this.userId = data().deepCopy(fields()[1].schema(), other.userId);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.addressLine1)) {
        this.addressLine1 = data().deepCopy(fields()[2].schema(), other.addressLine1);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.addressLine2)) {
        this.addressLine2 = data().deepCopy(fields()[3].schema(), other.addressLine2);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.city)) {
        this.city = data().deepCopy(fields()[4].schema(), other.city);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.state)) {
        this.state = data().deepCopy(fields()[5].schema(), other.state);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.zip)) {
        this.zip = data().deepCopy(fields()[6].schema(), other.zip);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.country)) {
        this.country = data().deepCopy(fields()[7].schema(), other.country);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.phones)) {
        this.phones = data().deepCopy(fields()[8].schema(), other.phones);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.addressIsVerified)) {
        this.addressIsVerified = data().deepCopy(fields()[9].schema(), other.addressIsVerified);
        fieldSetFlags()[9] = true;
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
    public com.nichoshop.model.dto.AddressDto.Builder setId(int value) {
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
    public com.nichoshop.model.dto.AddressDto.Builder clearId() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'userId' field.
      * @return The value.
      */
    public int getUserId() {
      return userId;
    }


    /**
      * Sets the value of the 'userId' field.
      * @param value The value of 'userId'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setUserId(int value) {
      validate(fields()[1], value);
      this.userId = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'userId' field has been set.
      * @return True if the 'userId' field has been set, false otherwise.
      */
    public boolean hasUserId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'userId' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearUserId() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'addressLine1' field.
      * @return The value.
      */
    public java.lang.String getAddressLine1() {
      return addressLine1;
    }


    /**
      * Sets the value of the 'addressLine1' field.
      * @param value The value of 'addressLine1'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setAddressLine1(java.lang.String value) {
      validate(fields()[2], value);
      this.addressLine1 = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'addressLine1' field has been set.
      * @return True if the 'addressLine1' field has been set, false otherwise.
      */
    public boolean hasAddressLine1() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'addressLine1' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearAddressLine1() {
      addressLine1 = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'addressLine2' field.
      * @return The value.
      */
    public java.lang.String getAddressLine2() {
      return addressLine2;
    }


    /**
      * Sets the value of the 'addressLine2' field.
      * @param value The value of 'addressLine2'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setAddressLine2(java.lang.String value) {
      validate(fields()[3], value);
      this.addressLine2 = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'addressLine2' field has been set.
      * @return True if the 'addressLine2' field has been set, false otherwise.
      */
    public boolean hasAddressLine2() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'addressLine2' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearAddressLine2() {
      addressLine2 = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'city' field.
      * @return The value.
      */
    public java.lang.String getCity() {
      return city;
    }


    /**
      * Sets the value of the 'city' field.
      * @param value The value of 'city'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setCity(java.lang.String value) {
      validate(fields()[4], value);
      this.city = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'city' field has been set.
      * @return True if the 'city' field has been set, false otherwise.
      */
    public boolean hasCity() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'city' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearCity() {
      city = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'state' field.
      * @return The value.
      */
    public java.lang.String getState() {
      return state;
    }


    /**
      * Sets the value of the 'state' field.
      * @param value The value of 'state'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setState(java.lang.String value) {
      validate(fields()[5], value);
      this.state = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'state' field has been set.
      * @return True if the 'state' field has been set, false otherwise.
      */
    public boolean hasState() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'state' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearState() {
      state = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'zip' field.
      * @return The value.
      */
    public java.lang.String getZip() {
      return zip;
    }


    /**
      * Sets the value of the 'zip' field.
      * @param value The value of 'zip'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setZip(java.lang.String value) {
      validate(fields()[6], value);
      this.zip = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'zip' field has been set.
      * @return True if the 'zip' field has been set, false otherwise.
      */
    public boolean hasZip() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'zip' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearZip() {
      zip = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'country' field.
      * @return The value.
      */
    public java.lang.String getCountry() {
      return country;
    }


    /**
      * Sets the value of the 'country' field.
      * @param value The value of 'country'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setCountry(java.lang.String value) {
      validate(fields()[7], value);
      this.country = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'country' field has been set.
      * @return True if the 'country' field has been set, false otherwise.
      */
    public boolean hasCountry() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'country' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearCountry() {
      country = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'phones' field.
      * @return The value.
      */
    public java.util.List<java.lang.String> getPhones() {
      return phones;
    }


    /**
      * Sets the value of the 'phones' field.
      * @param value The value of 'phones'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setPhones(java.util.List<java.lang.String> value) {
      validate(fields()[8], value);
      this.phones = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'phones' field has been set.
      * @return True if the 'phones' field has been set, false otherwise.
      */
    public boolean hasPhones() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'phones' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearPhones() {
      phones = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'addressIsVerified' field.
      * @return The value.
      */
    public boolean getAddressIsVerified() {
      return addressIsVerified;
    }


    /**
      * Sets the value of the 'addressIsVerified' field.
      * @param value The value of 'addressIsVerified'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder setAddressIsVerified(boolean value) {
      validate(fields()[9], value);
      this.addressIsVerified = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'addressIsVerified' field has been set.
      * @return True if the 'addressIsVerified' field has been set, false otherwise.
      */
    public boolean hasAddressIsVerified() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'addressIsVerified' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.AddressDto.Builder clearAddressIsVerified() {
      fieldSetFlags()[9] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AddressDto build() {
      try {
        AddressDto record = new AddressDto();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.Integer) defaultValue(fields()[0]);
        record.userId = fieldSetFlags()[1] ? this.userId : (java.lang.Integer) defaultValue(fields()[1]);
        record.addressLine1 = fieldSetFlags()[2] ? this.addressLine1 : (java.lang.String) defaultValue(fields()[2]);
        record.addressLine2 = fieldSetFlags()[3] ? this.addressLine2 : (java.lang.String) defaultValue(fields()[3]);
        record.city = fieldSetFlags()[4] ? this.city : (java.lang.String) defaultValue(fields()[4]);
        record.state = fieldSetFlags()[5] ? this.state : (java.lang.String) defaultValue(fields()[5]);
        record.zip = fieldSetFlags()[6] ? this.zip : (java.lang.String) defaultValue(fields()[6]);
        record.country = fieldSetFlags()[7] ? this.country : (java.lang.String) defaultValue(fields()[7]);
        record.phones = fieldSetFlags()[8] ? this.phones : (java.util.List<java.lang.String>) defaultValue(fields()[8]);
        record.addressIsVerified = fieldSetFlags()[9] ? this.addressIsVerified : (java.lang.Boolean) defaultValue(fields()[9]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AddressDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<AddressDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AddressDto>
    READER$ = (org.apache.avro.io.DatumReader<AddressDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.id);

    out.writeInt(this.userId);

    out.writeString(this.addressLine1);

    if (this.addressLine2 == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.addressLine2);
    }

    out.writeString(this.city);

    if (this.state == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.state);
    }

    out.writeString(this.zip);

    out.writeString(this.country);

    if (this.phones == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.phones.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.lang.String e0: this.phones) {
        actualSize0++;
        out.startItem();
        out.writeString(e0);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    out.writeBoolean(this.addressIsVerified);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.id = in.readInt();

      this.userId = in.readInt();

      this.addressLine1 = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.addressLine2 = null;
      } else {
        this.addressLine2 = in.readString();
      }

      this.city = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.state = null;
      } else {
        this.state = in.readString();
      }

      this.zip = in.readString();

      this.country = in.readString();

      if (in.readIndex() != 1) {
        in.readNull();
        this.phones = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<java.lang.String> a0 = this.phones;
        if (a0 == null) {
          a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("phones").schema().getTypes().get(1));
          this.phones = a0;
        } else a0.clear();
        SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
            e0 = in.readString();
            a0.add(e0);
          }
        }
      }

      this.addressIsVerified = in.readBoolean();

    } else {
      for (int i = 0; i < 10; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.id = in.readInt();
          break;

        case 1:
          this.userId = in.readInt();
          break;

        case 2:
          this.addressLine1 = in.readString();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.addressLine2 = null;
          } else {
            this.addressLine2 = in.readString();
          }
          break;

        case 4:
          this.city = in.readString();
          break;

        case 5:
          if (in.readIndex() != 1) {
            in.readNull();
            this.state = null;
          } else {
            this.state = in.readString();
          }
          break;

        case 6:
          this.zip = in.readString();
          break;

        case 7:
          this.country = in.readString();
          break;

        case 8:
          if (in.readIndex() != 1) {
            in.readNull();
            this.phones = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<java.lang.String> a0 = this.phones;
            if (a0 == null) {
              a0 = new SpecificData.Array<java.lang.String>((int)size0, SCHEMA$.getField("phones").schema().getTypes().get(1));
              this.phones = a0;
            } else a0.clear();
            SpecificData.Array<java.lang.String> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.String>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.String e0 = (ga0 != null ? ga0.peek() : null);
                e0 = in.readString();
                a0.add(e0);
              }
            }
          }
          break;

        case 9:
          this.addressIsVerified = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










