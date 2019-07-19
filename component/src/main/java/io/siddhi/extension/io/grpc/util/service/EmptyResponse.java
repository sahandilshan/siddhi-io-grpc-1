// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: siddhi_MI_connect.proto

package io.siddhi.extension.io.grpc.util.service;

/**
 * Protobuf type {@code invokesequence.EmptyResponse}
 */
public  final class EmptyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:invokesequence.EmptyResponse)
    EmptyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EmptyResponse.newBuilder() to construct.
  private EmptyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EmptyResponse() {
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EmptyResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new NullPointerException();
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
    return io.siddhi.extension.io.grpc.util.service.SiddhiMicroIntegratorProto.internal_static_invokesequence_EmptyResponse_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.siddhi.extension.io.grpc.util.service.SiddhiMicroIntegratorProto.internal_static_invokesequence_EmptyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.siddhi.extension.io.grpc.util.service.EmptyResponse.class, io.siddhi.extension.io.grpc.util.service.EmptyResponse.Builder.class);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.siddhi.extension.io.grpc.util.service.EmptyResponse)) {
      return super.equals(obj);
    }
    io.siddhi.extension.io.grpc.util.service.EmptyResponse other = (io.siddhi.extension.io.grpc.util.service.EmptyResponse) obj;

    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.siddhi.extension.io.grpc.util.service.EmptyResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code invokesequence.EmptyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:invokesequence.EmptyResponse)
      io.siddhi.extension.io.grpc.util.service.EmptyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.siddhi.extension.io.grpc.util.service.SiddhiMicroIntegratorProto.internal_static_invokesequence_EmptyResponse_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.siddhi.extension.io.grpc.util.service.SiddhiMicroIntegratorProto.internal_static_invokesequence_EmptyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.siddhi.extension.io.grpc.util.service.EmptyResponse.class, io.siddhi.extension.io.grpc.util.service.EmptyResponse.Builder.class);
    }

    // Construct using io.siddhi.extension.io.grpc.util.service.EmptyResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.siddhi.extension.io.grpc.util.service.SiddhiMicroIntegratorProto.internal_static_invokesequence_EmptyResponse_descriptor;
    }

    @Override
    public io.siddhi.extension.io.grpc.util.service.EmptyResponse getDefaultInstanceForType() {
      return io.siddhi.extension.io.grpc.util.service.EmptyResponse.getDefaultInstance();
    }

    @Override
    public io.siddhi.extension.io.grpc.util.service.EmptyResponse build() {
      io.siddhi.extension.io.grpc.util.service.EmptyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public io.siddhi.extension.io.grpc.util.service.EmptyResponse buildPartial() {
      io.siddhi.extension.io.grpc.util.service.EmptyResponse result = new io.siddhi.extension.io.grpc.util.service.EmptyResponse(this);
      onBuilt();
      return result;
    }

    @Override
    public Builder clone() {
      return super.clone();
    }
    @Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.setField(field, value);
    }
    @Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return super.addRepeatedField(field, value);
    }
    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.siddhi.extension.io.grpc.util.service.EmptyResponse) {
        return mergeFrom((io.siddhi.extension.io.grpc.util.service.EmptyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.siddhi.extension.io.grpc.util.service.EmptyResponse other) {
      if (other == io.siddhi.extension.io.grpc.util.service.EmptyResponse.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.siddhi.extension.io.grpc.util.service.EmptyResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.siddhi.extension.io.grpc.util.service.EmptyResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:invokesequence.EmptyResponse)
  }

  // @@protoc_insertion_point(class_scope:invokesequence.EmptyResponse)
  private static final io.siddhi.extension.io.grpc.util.service.EmptyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.siddhi.extension.io.grpc.util.service.EmptyResponse();
  }

  public static io.siddhi.extension.io.grpc.util.service.EmptyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmptyResponse>
      PARSER = new com.google.protobuf.AbstractParser<EmptyResponse>() {
    @Override
    public EmptyResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EmptyResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EmptyResponse> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<EmptyResponse> getParserForType() {
    return PARSER;
  }

  @Override
  public io.siddhi.extension.io.grpc.util.service.EmptyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
