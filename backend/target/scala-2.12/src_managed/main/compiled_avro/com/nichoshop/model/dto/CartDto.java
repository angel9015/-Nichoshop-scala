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
public class CartDto extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2930537283621534392L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CartDto\",\"namespace\":\"com.nichoshop.model.dto\",\"fields\":[{\"name\":\"items\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CartItemDto\",\"fields\":[{\"name\":\"product\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"ProductDto\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"categoryId\",\"type\":\"int\"},{\"name\":\"sellerId\",\"type\":\"int\"},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"created\",\"type\":\"long\"},{\"name\":\"variants\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ProductVariantDto\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"int\"],\"default\":null},{\"name\":\"title\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"description\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"}},{\"name\":\"created\",\"type\":\"long\"},{\"name\":\"price\",\"type\":{\"type\":\"record\",\"name\":\"RichMoneyDto\",\"fields\":[{\"name\":\"currencyId\",\"type\":\"int\"},{\"name\":\"amount\",\"type\":\"int\"}]}},{\"name\":\"amount\",\"type\":\"int\"},{\"name\":\"condition\",\"type\":{\"type\":\"enum\",\"name\":\"ProductCondition\",\"symbols\":[\"NEW\",\"USED\"]},\"default\":\"NEW\"},{\"name\":\"offerScopes\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OfferScopeDto\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"start\",\"type\":\"long\"},{\"name\":\"end\",\"type\":[\"null\",\"long\"],\"default\":null},{\"name\":\"offers\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"OfferDto\",\"fields\":[{\"name\":\"id\",\"type\":\"int\"},{\"name\":\"userId\",\"type\":\"int\"},{\"name\":\"created\",\"type\":\"long\"},{\"name\":\"pricePerItem\",\"type\":\"RichMoneyDto\"},{\"name\":\"qty\",\"type\":\"int\"},{\"name\":\"accepted\",\"type\":\"boolean\",\"default\":false},{\"name\":\"rejected\",\"type\":\"boolean\",\"default\":false},{\"name\":\"message\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"default\":null}]}}],\"default\":null}]}}],\"default\":null}]}}}]}],\"default\":null},{\"name\":\"qty\",\"type\":\"int\",\"default\":1}]}}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CartDto> ENCODER =
      new BinaryMessageEncoder<CartDto>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CartDto> DECODER =
      new BinaryMessageDecoder<CartDto>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CartDto> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CartDto> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CartDto> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CartDto>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CartDto to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CartDto from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CartDto instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CartDto fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.List<com.nichoshop.model.dto.CartItemDto> items;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CartDto() {}

  /**
   * All-args constructor.
   * @param items The new value for items
   */
  public CartDto(java.util.List<com.nichoshop.model.dto.CartItemDto> items) {
    this.items = items;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return items;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: items = (java.util.List<com.nichoshop.model.dto.CartItemDto>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'items' field.
   * @return The value of the 'items' field.
   */
  public java.util.List<com.nichoshop.model.dto.CartItemDto> getItems() {
    return items;
  }



  /**
   * Creates a new CartDto RecordBuilder.
   * @return A new CartDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CartDto.Builder newBuilder() {
    return new com.nichoshop.model.dto.CartDto.Builder();
  }

  /**
   * Creates a new CartDto RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CartDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CartDto.Builder newBuilder(com.nichoshop.model.dto.CartDto.Builder other) {
    if (other == null) {
      return new com.nichoshop.model.dto.CartDto.Builder();
    } else {
      return new com.nichoshop.model.dto.CartDto.Builder(other);
    }
  }

  /**
   * Creates a new CartDto RecordBuilder by copying an existing CartDto instance.
   * @param other The existing instance to copy.
   * @return A new CartDto RecordBuilder
   */
  public static com.nichoshop.model.dto.CartDto.Builder newBuilder(com.nichoshop.model.dto.CartDto other) {
    if (other == null) {
      return new com.nichoshop.model.dto.CartDto.Builder();
    } else {
      return new com.nichoshop.model.dto.CartDto.Builder(other);
    }
  }

  /**
   * RecordBuilder for CartDto instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CartDto>
    implements org.apache.avro.data.RecordBuilder<CartDto> {

    private java.util.List<com.nichoshop.model.dto.CartItemDto> items;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.nichoshop.model.dto.CartDto.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.items)) {
        this.items = data().deepCopy(fields()[0].schema(), other.items);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing CartDto instance
     * @param other The existing instance to copy.
     */
    private Builder(com.nichoshop.model.dto.CartDto other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.items)) {
        this.items = data().deepCopy(fields()[0].schema(), other.items);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'items' field.
      * @return The value.
      */
    public java.util.List<com.nichoshop.model.dto.CartItemDto> getItems() {
      return items;
    }


    /**
      * Sets the value of the 'items' field.
      * @param value The value of 'items'.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CartDto.Builder setItems(java.util.List<com.nichoshop.model.dto.CartItemDto> value) {
      validate(fields()[0], value);
      this.items = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'items' field has been set.
      * @return True if the 'items' field has been set, false otherwise.
      */
    public boolean hasItems() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'items' field.
      * @return This builder.
      */
    public com.nichoshop.model.dto.CartDto.Builder clearItems() {
      items = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CartDto build() {
      try {
        CartDto record = new CartDto();
        record.items = fieldSetFlags()[0] ? this.items : (java.util.List<com.nichoshop.model.dto.CartItemDto>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CartDto>
    WRITER$ = (org.apache.avro.io.DatumWriter<CartDto>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CartDto>
    READER$ = (org.apache.avro.io.DatumReader<CartDto>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    if (this.items == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.items.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (com.nichoshop.model.dto.CartItemDto e0: this.items) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (in.readIndex() != 1) {
        in.readNull();
        this.items = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<com.nichoshop.model.dto.CartItemDto> a0 = this.items;
        if (a0 == null) {
          a0 = new SpecificData.Array<com.nichoshop.model.dto.CartItemDto>((int)size0, SCHEMA$.getField("items").schema().getTypes().get(1));
          this.items = a0;
        } else a0.clear();
        SpecificData.Array<com.nichoshop.model.dto.CartItemDto> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.nichoshop.model.dto.CartItemDto>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            com.nichoshop.model.dto.CartItemDto e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new com.nichoshop.model.dto.CartItemDto();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (in.readIndex() != 1) {
            in.readNull();
            this.items = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<com.nichoshop.model.dto.CartItemDto> a0 = this.items;
            if (a0 == null) {
              a0 = new SpecificData.Array<com.nichoshop.model.dto.CartItemDto>((int)size0, SCHEMA$.getField("items").schema().getTypes().get(1));
              this.items = a0;
            } else a0.clear();
            SpecificData.Array<com.nichoshop.model.dto.CartItemDto> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<com.nichoshop.model.dto.CartItemDto>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                com.nichoshop.model.dto.CartItemDto e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new com.nichoshop.model.dto.CartItemDto();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










