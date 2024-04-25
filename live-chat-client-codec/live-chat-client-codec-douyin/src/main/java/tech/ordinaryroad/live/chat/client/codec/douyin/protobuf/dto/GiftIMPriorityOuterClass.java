/*
 * MIT License
 *
 * Copyright (c) 2023 OrdinaryRoad
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GiftIMPriority.proto

package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto;

public final class GiftIMPriorityOuterClass {
  private GiftIMPriorityOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GiftIMPriorityOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GiftIMPriority)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint64 queue_sizes_list = 1;</code>
     * @return A list containing the queueSizesList.
     */
    java.util.List<Long> getQueueSizesListList();
    /**
     * <code>repeated uint64 queue_sizes_list = 1;</code>
     * @return The count of queueSizesList.
     */
    int getQueueSizesListCount();
    /**
     * <code>repeated uint64 queue_sizes_list = 1;</code>
     * @param index The index of the element to return.
     * @return The queueSizesList at the given index.
     */
    long getQueueSizesList(int index);

    /**
     * <code>uint64 self_queue_priority = 2;</code>
     * @return The selfQueuePriority.
     */
    long getSelfQueuePriority();

    /**
     * <code>uint64 priority = 3;</code>
     * @return The priority.
     */
    long getPriority();
  }
  /**
   * Protobuf type {@code GiftIMPriority}
   */
  public static final class GiftIMPriority extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GiftIMPriority)
      GiftIMPriorityOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GiftIMPriority.newBuilder() to construct.
    private GiftIMPriority(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GiftIMPriority() {
      queueSizesList_ = emptyLongList();
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new GiftIMPriority();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GiftIMPriorityOuterClass.internal_static_GiftIMPriority_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GiftIMPriorityOuterClass.internal_static_GiftIMPriority_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GiftIMPriority.class, Builder.class);
    }

    public static final int QUEUE_SIZES_LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList queueSizesList_;
    /**
     * <code>repeated uint64 queue_sizes_list = 1;</code>
     * @return A list containing the queueSizesList.
     */
    @Override
    public java.util.List<Long>
        getQueueSizesListList() {
      return queueSizesList_;
    }
    /**
     * <code>repeated uint64 queue_sizes_list = 1;</code>
     * @return The count of queueSizesList.
     */
    public int getQueueSizesListCount() {
      return queueSizesList_.size();
    }
    /**
     * <code>repeated uint64 queue_sizes_list = 1;</code>
     * @param index The index of the element to return.
     * @return The queueSizesList at the given index.
     */
    public long getQueueSizesList(int index) {
      return queueSizesList_.getLong(index);
    }
    private int queueSizesListMemoizedSerializedSize = -1;

    public static final int SELF_QUEUE_PRIORITY_FIELD_NUMBER = 2;
    private long selfQueuePriority_ = 0L;
    /**
     * <code>uint64 self_queue_priority = 2;</code>
     * @return The selfQueuePriority.
     */
    @Override
    public long getSelfQueuePriority() {
      return selfQueuePriority_;
    }

    public static final int PRIORITY_FIELD_NUMBER = 3;
    private long priority_ = 0L;
    /**
     * <code>uint64 priority = 3;</code>
     * @return The priority.
     */
    @Override
    public long getPriority() {
      return priority_;
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
      getSerializedSize();
      if (getQueueSizesListList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(queueSizesListMemoizedSerializedSize);
      }
      for (int i = 0; i < queueSizesList_.size(); i++) {
        output.writeUInt64NoTag(queueSizesList_.getLong(i));
      }
      if (selfQueuePriority_ != 0L) {
        output.writeUInt64(2, selfQueuePriority_);
      }
      if (priority_ != 0L) {
        output.writeUInt64(3, priority_);
      }
      getUnknownFields().writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < queueSizesList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(queueSizesList_.getLong(i));
        }
        size += dataSize;
        if (!getQueueSizesListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        queueSizesListMemoizedSerializedSize = dataSize;
      }
      if (selfQueuePriority_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, selfQueuePriority_);
      }
      if (priority_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, priority_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof GiftIMPriority)) {
        return super.equals(obj);
      }
      GiftIMPriority other = (GiftIMPriority) obj;

      if (!getQueueSizesListList()
          .equals(other.getQueueSizesListList())) return false;
      if (getSelfQueuePriority()
          != other.getSelfQueuePriority()) return false;
      if (getPriority()
          != other.getPriority()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getQueueSizesListCount() > 0) {
        hash = (37 * hash) + QUEUE_SIZES_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getQueueSizesListList().hashCode();
      }
      hash = (37 * hash) + SELF_QUEUE_PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getSelfQueuePriority());
      hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPriority());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GiftIMPriority parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GiftIMPriority parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GiftIMPriority parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GiftIMPriority parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GiftIMPriority parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GiftIMPriority parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GiftIMPriority parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GiftIMPriority parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GiftIMPriority parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GiftIMPriority parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GiftIMPriority parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GiftIMPriority parseFrom(
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
    public static Builder newBuilder(GiftIMPriority prototype) {
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
     * Protobuf type {@code GiftIMPriority}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GiftIMPriority)
        GiftIMPriorityOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GiftIMPriorityOuterClass.internal_static_GiftIMPriority_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GiftIMPriorityOuterClass.internal_static_GiftIMPriority_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GiftIMPriority.class, Builder.class);
      }

      // Construct using tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.dto.GiftIMPriorityOuterClass.GiftIMPriority.newBuilder()
      private Builder() {

      }

      private Builder(
          BuilderParent parent) {
        super(parent);

      }
      @Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        queueSizesList_ = emptyLongList();
        selfQueuePriority_ = 0L;
        priority_ = 0L;
        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GiftIMPriorityOuterClass.internal_static_GiftIMPriority_descriptor;
      }

      @Override
      public GiftIMPriority getDefaultInstanceForType() {
        return GiftIMPriority.getDefaultInstance();
      }

      @Override
      public GiftIMPriority build() {
        GiftIMPriority result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public GiftIMPriority buildPartial() {
        GiftIMPriority result = new GiftIMPriority(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(GiftIMPriority result) {
        if (((bitField0_ & 0x00000001) != 0)) {
          queueSizesList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.queueSizesList_ = queueSizesList_;
      }

      private void buildPartial0(GiftIMPriority result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.selfQueuePriority_ = selfQueuePriority_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.priority_ = priority_;
        }
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
        if (other instanceof GiftIMPriority) {
          return mergeFrom((GiftIMPriority)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GiftIMPriority other) {
        if (other == GiftIMPriority.getDefaultInstance()) return this;
        if (!other.queueSizesList_.isEmpty()) {
          if (queueSizesList_.isEmpty()) {
            queueSizesList_ = other.queueSizesList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureQueueSizesListIsMutable();
            queueSizesList_.addAll(other.queueSizesList_);
          }
          onChanged();
        }
        if (other.getSelfQueuePriority() != 0L) {
          setSelfQueuePriority(other.getSelfQueuePriority());
        }
        if (other.getPriority() != 0L) {
          setPriority(other.getPriority());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                long v = input.readUInt64();
                ensureQueueSizesListIsMutable();
                queueSizesList_.addLong(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureQueueSizesListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  queueSizesList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 10
              case 16: {
                selfQueuePriority_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                priority_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.LongList queueSizesList_ = emptyLongList();
      private void ensureQueueSizesListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          queueSizesList_ = mutableCopy(queueSizesList_);
          bitField0_ |= 0x00000001;
        }
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @return A list containing the queueSizesList.
       */
      public java.util.List<Long>
          getQueueSizesListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(queueSizesList_) : queueSizesList_;
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @return The count of queueSizesList.
       */
      public int getQueueSizesListCount() {
        return queueSizesList_.size();
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @param index The index of the element to return.
       * @return The queueSizesList at the given index.
       */
      public long getQueueSizesList(int index) {
        return queueSizesList_.getLong(index);
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @param index The index to set the value at.
       * @param value The queueSizesList to set.
       * @return This builder for chaining.
       */
      public Builder setQueueSizesList(
          int index, long value) {
        
        ensureQueueSizesListIsMutable();
        queueSizesList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @param value The queueSizesList to add.
       * @return This builder for chaining.
       */
      public Builder addQueueSizesList(long value) {
        
        ensureQueueSizesListIsMutable();
        queueSizesList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @param values The queueSizesList to add.
       * @return This builder for chaining.
       */
      public Builder addAllQueueSizesList(
          Iterable<? extends Long> values) {
        ensureQueueSizesListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, queueSizesList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 queue_sizes_list = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueueSizesList() {
        queueSizesList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private long selfQueuePriority_ ;
      /**
       * <code>uint64 self_queue_priority = 2;</code>
       * @return The selfQueuePriority.
       */
      @Override
      public long getSelfQueuePriority() {
        return selfQueuePriority_;
      }
      /**
       * <code>uint64 self_queue_priority = 2;</code>
       * @param value The selfQueuePriority to set.
       * @return This builder for chaining.
       */
      public Builder setSelfQueuePriority(long value) {
        
        selfQueuePriority_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 self_queue_priority = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearSelfQueuePriority() {
        bitField0_ = (bitField0_ & ~0x00000002);
        selfQueuePriority_ = 0L;
        onChanged();
        return this;
      }

      private long priority_ ;
      /**
       * <code>uint64 priority = 3;</code>
       * @return The priority.
       */
      @Override
      public long getPriority() {
        return priority_;
      }
      /**
       * <code>uint64 priority = 3;</code>
       * @param value The priority to set.
       * @return This builder for chaining.
       */
      public Builder setPriority(long value) {
        
        priority_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 priority = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearPriority() {
        bitField0_ = (bitField0_ & ~0x00000004);
        priority_ = 0L;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:GiftIMPriority)
    }

    // @@protoc_insertion_point(class_scope:GiftIMPriority)
    private static final GiftIMPriority DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GiftIMPriority();
    }

    public static GiftIMPriority getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GiftIMPriority>
        PARSER = new com.google.protobuf.AbstractParser<GiftIMPriority>() {
      @Override
      public GiftIMPriority parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<GiftIMPriority> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<GiftIMPriority> getParserForType() {
      return PARSER;
    }

    @Override
    public GiftIMPriority getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GiftIMPriority_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GiftIMPriority_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\024GiftIMPriority.proto\"Y\n\016GiftIMPriority" +
      "\022\030\n\020queue_sizes_list\030\001 \003(\004\022\033\n\023self_queue" +
      "_priority\030\002 \001(\004\022\020\n\010priority\030\003 \001(\004B>\n<tec" +
      "h.ordinaryroad.live.chat.client.codec.do" +
      "uyin.protobuf.dtob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GiftIMPriority_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GiftIMPriority_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GiftIMPriority_descriptor,
        new String[] { "QueueSizesList", "SelfQueuePriority", "Priority", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}