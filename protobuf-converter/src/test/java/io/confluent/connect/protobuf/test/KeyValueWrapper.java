// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: keyvaluewrapper.proto

package io.confluent.connect.protobuf.test;

public final class KeyValueWrapper {
  private KeyValueWrapper() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KeyValueWrapperMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KeyValueWrapperMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    int getKey();

    /**
     * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
     * @return Whether the wrappedValue field is set.
     */
    boolean hasWrappedValue();
    /**
     * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
     * @return The wrappedValue.
     */
    com.google.protobuf.StringValue getWrappedValue();
    /**
     * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
     */
    com.google.protobuf.StringValueOrBuilder getWrappedValueOrBuilder();
  }
  /**
   * Protobuf type {@code KeyValueWrapperMessage}
   */
  public static final class KeyValueWrapperMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KeyValueWrapperMessage)
      KeyValueWrapperMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KeyValueWrapperMessage.newBuilder() to construct.
    private KeyValueWrapperMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KeyValueWrapperMessage() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KeyValueWrapperMessage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KeyValueWrapperMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              key_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.StringValue.Builder subBuilder = null;
              if (wrappedValue_ != null) {
                subBuilder = wrappedValue_.toBuilder();
              }
              wrappedValue_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(wrappedValue_);
                wrappedValue_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.connect.protobuf.test.KeyValueWrapper.internal_static_KeyValueWrapperMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.connect.protobuf.test.KeyValueWrapper.internal_static_KeyValueWrapperMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.class, io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private int key_;
    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
    }

    public static final int WRAPPEDVALUE_FIELD_NUMBER = 2;
    private com.google.protobuf.StringValue wrappedValue_;
    /**
     * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
     * @return Whether the wrappedValue field is set.
     */
    @java.lang.Override
    public boolean hasWrappedValue() {
      return wrappedValue_ != null;
    }
    /**
     * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
     * @return The wrappedValue.
     */
    @java.lang.Override
    public com.google.protobuf.StringValue getWrappedValue() {
      return wrappedValue_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : wrappedValue_;
    }
    /**
     * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.StringValueOrBuilder getWrappedValueOrBuilder() {
      return getWrappedValue();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (key_ != 0) {
        output.writeInt32(1, key_);
      }
      if (wrappedValue_ != null) {
        output.writeMessage(2, getWrappedValue());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, key_);
      }
      if (wrappedValue_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getWrappedValue());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage)) {
        return super.equals(obj);
      }
      io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage other = (io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage) obj;

      if (getKey()
          != other.getKey()) return false;
      if (hasWrappedValue() != other.hasWrappedValue()) return false;
      if (hasWrappedValue()) {
        if (!getWrappedValue()
            .equals(other.getWrappedValue())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey();
      if (hasWrappedValue()) {
        hash = (37 * hash) + WRAPPEDVALUE_FIELD_NUMBER;
        hash = (53 * hash) + getWrappedValue().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code KeyValueWrapperMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KeyValueWrapperMessage)
        io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.connect.protobuf.test.KeyValueWrapper.internal_static_KeyValueWrapperMessage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.connect.protobuf.test.KeyValueWrapper.internal_static_KeyValueWrapperMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.class, io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.Builder.class);
      }

      // Construct using io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        key_ = 0;

        if (wrappedValueBuilder_ == null) {
          wrappedValue_ = null;
        } else {
          wrappedValue_ = null;
          wrappedValueBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.connect.protobuf.test.KeyValueWrapper.internal_static_KeyValueWrapperMessage_descriptor;
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage getDefaultInstanceForType() {
        return io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage build() {
        io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage buildPartial() {
        io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage result = new io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage(this);
        result.key_ = key_;
        if (wrappedValueBuilder_ == null) {
          result.wrappedValue_ = wrappedValue_;
        } else {
          result.wrappedValue_ = wrappedValueBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage) {
          return mergeFrom((io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage other) {
        if (other == io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage.getDefaultInstance()) return this;
        if (other.getKey() != 0) {
          setKey(other.getKey());
        }
        if (other.hasWrappedValue()) {
          mergeWrappedValue(other.getWrappedValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int key_ ;
      /**
       * <code>int32 key = 1;</code>
       * @return The key.
       */
      @java.lang.Override
      public int getKey() {
        return key_;
      }
      /**
       * <code>int32 key = 1;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(int value) {
        
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.StringValue wrappedValue_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> wrappedValueBuilder_;
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       * @return Whether the wrappedValue field is set.
       */
      public boolean hasWrappedValue() {
        return wrappedValueBuilder_ != null || wrappedValue_ != null;
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       * @return The wrappedValue.
       */
      public com.google.protobuf.StringValue getWrappedValue() {
        if (wrappedValueBuilder_ == null) {
          return wrappedValue_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : wrappedValue_;
        } else {
          return wrappedValueBuilder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      public Builder setWrappedValue(com.google.protobuf.StringValue value) {
        if (wrappedValueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          wrappedValue_ = value;
          onChanged();
        } else {
          wrappedValueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      public Builder setWrappedValue(
          com.google.protobuf.StringValue.Builder builderForValue) {
        if (wrappedValueBuilder_ == null) {
          wrappedValue_ = builderForValue.build();
          onChanged();
        } else {
          wrappedValueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      public Builder mergeWrappedValue(com.google.protobuf.StringValue value) {
        if (wrappedValueBuilder_ == null) {
          if (wrappedValue_ != null) {
            wrappedValue_ =
              com.google.protobuf.StringValue.newBuilder(wrappedValue_).mergeFrom(value).buildPartial();
          } else {
            wrappedValue_ = value;
          }
          onChanged();
        } else {
          wrappedValueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      public Builder clearWrappedValue() {
        if (wrappedValueBuilder_ == null) {
          wrappedValue_ = null;
          onChanged();
        } else {
          wrappedValue_ = null;
          wrappedValueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      public com.google.protobuf.StringValue.Builder getWrappedValueBuilder() {
        
        onChanged();
        return getWrappedValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      public com.google.protobuf.StringValueOrBuilder getWrappedValueOrBuilder() {
        if (wrappedValueBuilder_ != null) {
          return wrappedValueBuilder_.getMessageOrBuilder();
        } else {
          return wrappedValue_ == null ?
              com.google.protobuf.StringValue.getDefaultInstance() : wrappedValue_;
        }
      }
      /**
       * <code>.google.protobuf.StringValue wrappedValue = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
          getWrappedValueFieldBuilder() {
        if (wrappedValueBuilder_ == null) {
          wrappedValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                  getWrappedValue(),
                  getParentForChildren(),
                  isClean());
          wrappedValue_ = null;
        }
        return wrappedValueBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:KeyValueWrapperMessage)
    }

    // @@protoc_insertion_point(class_scope:KeyValueWrapperMessage)
    private static final io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage();
    }

    public static io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KeyValueWrapperMessage>
        PARSER = new com.google.protobuf.AbstractParser<KeyValueWrapperMessage>() {
      @java.lang.Override
      public KeyValueWrapperMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KeyValueWrapperMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KeyValueWrapperMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KeyValueWrapperMessage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.connect.protobuf.test.KeyValueWrapper.KeyValueWrapperMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KeyValueWrapperMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KeyValueWrapperMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025keyvaluewrapper.proto\032 google/protobuf" +
      "/descriptor.proto\032\036google/protobuf/wrapp" +
      "ers.proto\"Y\n\026KeyValueWrapperMessage\022\013\n\003k" +
      "ey\030\001 \001(\005\0222\n\014wrappedValue\030\002 \001(\0132\034.google." +
      "protobuf.StringValueB5\n\"io.confluent.con" +
      "nect.protobuf.testB\017KeyValueWrapperb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_KeyValueWrapperMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KeyValueWrapperMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KeyValueWrapperMessage_descriptor,
        new java.lang.String[] { "Key", "WrappedValue", });
    com.google.protobuf.DescriptorProtos.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
