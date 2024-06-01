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
// source: douyin.proto

// Protobuf Java Version: 3.25.3
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

/**
 * Protobuf type {@code TextPieceUser}
 */
public final class TextPieceUser extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TextPieceUser)
    TextPieceUserOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TextPieceUser.newBuilder() to construct.
  private TextPieceUser(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TextPieceUser() {
    leftAdditionalContent_ = "";
    rightAdditionalContent_ = "";
  }

  @Override
  @SuppressWarnings({"unused"})
  protected Object newInstance(
      UnusedPrivateParameter unused) {
    return new TextPieceUser();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Douyin.internal_static_TextPieceUser_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Douyin.internal_static_TextPieceUser_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            TextPieceUser.class, Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private User user_;
  /**
   * <code>.User user = 1;</code>
   * @return Whether the user field is set.
   */
  @Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.User user = 1;</code>
   * @return The user.
   */
  @Override
  public User getUser() {
    return user_ == null ? User.getDefaultInstance() : user_;
  }
  /**
   * <code>.User user = 1;</code>
   */
  @Override
  public UserOrBuilder getUserOrBuilder() {
    return user_ == null ? User.getDefaultInstance() : user_;
  }

  public static final int WITHCOLON_FIELD_NUMBER = 2;
  private boolean withColon_ = false;
  /**
   * <code>bool withColon = 2;</code>
   * @return The withColon.
   */
  @Override
  public boolean getWithColon() {
    return withColon_;
  }

  public static final int SELF_SHOW_REAL_NAME_FIELD_NUMBER = 3;
  private boolean selfShowRealName_ = false;
  /**
   * <code>bool self_show_real_name = 3;</code>
   * @return The selfShowRealName.
   */
  @Override
  public boolean getSelfShowRealName() {
    return selfShowRealName_;
  }

  public static final int LEFT_SHOW_EXTENSION_FIELD_NUMBER = 4;
  private int leftShowExtension_ = 0;
  /**
   * <code>uint32 left_show_extension = 4;</code>
   * @return The leftShowExtension.
   */
  @Override
  public int getLeftShowExtension() {
    return leftShowExtension_;
  }

  public static final int LEFT_ADDITIONAL_CONTENT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile Object leftAdditionalContent_ = "";
  /**
   * <code>string left_additional_content = 5;</code>
   * @return The leftAdditionalContent.
   */
  @Override
  public String getLeftAdditionalContent() {
    Object ref = leftAdditionalContent_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      leftAdditionalContent_ = s;
      return s;
    }
  }
  /**
   * <code>string left_additional_content = 5;</code>
   * @return The bytes for leftAdditionalContent.
   */
  @Override
  public com.google.protobuf.ByteString
      getLeftAdditionalContentBytes() {
    Object ref = leftAdditionalContent_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      leftAdditionalContent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RIGHT_ADDITIONAL_CONTENT_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile Object rightAdditionalContent_ = "";
  /**
   * <code>string right_additional_content = 6;</code>
   * @return The rightAdditionalContent.
   */
  @Override
  public String getRightAdditionalContent() {
    Object ref = rightAdditionalContent_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      rightAdditionalContent_ = s;
      return s;
    }
  }
  /**
   * <code>string right_additional_content = 6;</code>
   * @return The bytes for rightAdditionalContent.
   */
  @Override
  public com.google.protobuf.ByteString
      getRightAdditionalContentBytes() {
    Object ref = rightAdditionalContent_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      rightAdditionalContent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getUser());
    }
    if (withColon_ != false) {
      output.writeBool(2, withColon_);
    }
    if (selfShowRealName_ != false) {
      output.writeBool(3, selfShowRealName_);
    }
    if (leftShowExtension_ != 0) {
      output.writeUInt32(4, leftShowExtension_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(leftAdditionalContent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, leftAdditionalContent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rightAdditionalContent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, rightAdditionalContent_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    if (withColon_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, withColon_);
    }
    if (selfShowRealName_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, selfShowRealName_);
    }
    if (leftShowExtension_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, leftShowExtension_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(leftAdditionalContent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, leftAdditionalContent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(rightAdditionalContent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, rightAdditionalContent_);
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
    if (!(obj instanceof TextPieceUser)) {
      return super.equals(obj);
    }
    TextPieceUser other = (TextPieceUser) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (getWithColon()
        != other.getWithColon()) return false;
    if (getSelfShowRealName()
        != other.getSelfShowRealName()) return false;
    if (getLeftShowExtension()
        != other.getLeftShowExtension()) return false;
    if (!getLeftAdditionalContent()
        .equals(other.getLeftAdditionalContent())) return false;
    if (!getRightAdditionalContent()
        .equals(other.getRightAdditionalContent())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (37 * hash) + WITHCOLON_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithColon());
    hash = (37 * hash) + SELF_SHOW_REAL_NAME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSelfShowRealName());
    hash = (37 * hash) + LEFT_SHOW_EXTENSION_FIELD_NUMBER;
    hash = (53 * hash) + getLeftShowExtension();
    hash = (37 * hash) + LEFT_ADDITIONAL_CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getLeftAdditionalContent().hashCode();
    hash = (37 * hash) + RIGHT_ADDITIONAL_CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getRightAdditionalContent().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static TextPieceUser parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TextPieceUser parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TextPieceUser parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TextPieceUser parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TextPieceUser parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static TextPieceUser parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static TextPieceUser parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TextPieceUser parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static TextPieceUser parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static TextPieceUser parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static TextPieceUser parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static TextPieceUser parseFrom(
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
  public static Builder newBuilder(TextPieceUser prototype) {
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
   * Protobuf type {@code TextPieceUser}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TextPieceUser)
      TextPieceUserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Douyin.internal_static_TextPieceUser_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Douyin.internal_static_TextPieceUser_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TextPieceUser.class, Builder.class);
    }

    // Construct using tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.TextPieceUser.newBuilder()
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
        getUserFieldBuilder();
      }
    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      withColon_ = false;
      selfShowRealName_ = false;
      leftShowExtension_ = 0;
      leftAdditionalContent_ = "";
      rightAdditionalContent_ = "";
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Douyin.internal_static_TextPieceUser_descriptor;
    }

    @Override
    public TextPieceUser getDefaultInstanceForType() {
      return TextPieceUser.getDefaultInstance();
    }

    @Override
    public TextPieceUser build() {
      TextPieceUser result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public TextPieceUser buildPartial() {
      TextPieceUser result = new TextPieceUser(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(TextPieceUser result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withColon_ = withColon_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.selfShowRealName_ = selfShowRealName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.leftShowExtension_ = leftShowExtension_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.leftAdditionalContent_ = leftAdditionalContent_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.rightAdditionalContent_ = rightAdditionalContent_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof TextPieceUser) {
        return mergeFrom((TextPieceUser)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(TextPieceUser other) {
      if (other == TextPieceUser.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.getWithColon() != false) {
        setWithColon(other.getWithColon());
      }
      if (other.getSelfShowRealName() != false) {
        setSelfShowRealName(other.getSelfShowRealName());
      }
      if (other.getLeftShowExtension() != 0) {
        setLeftShowExtension(other.getLeftShowExtension());
      }
      if (!other.getLeftAdditionalContent().isEmpty()) {
        leftAdditionalContent_ = other.leftAdditionalContent_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (!other.getRightAdditionalContent().isEmpty()) {
        rightAdditionalContent_ = other.rightAdditionalContent_;
        bitField0_ |= 0x00000020;
        onChanged();
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
            case 10: {
              input.readMessage(
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              withColon_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              selfShowRealName_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              leftShowExtension_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              leftAdditionalContent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              rightAdditionalContent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
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

    private User user_;
    private com.google.protobuf.SingleFieldBuilderV3<
        User, User.Builder, UserOrBuilder> userBuilder_;
    /**
     * <code>.User user = 1;</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.User user = 1;</code>
     * @return The user.
     */
    public User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.User user = 1;</code>
     */
    public Builder setUser(User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.User user = 1;</code>
     */
    public Builder setUser(
        User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.User user = 1;</code>
     */
    public Builder mergeUser(User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          user_ != null &&
          user_ != User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.User user = 1;</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.User user = 1;</code>
     */
    public User.Builder getUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.User user = 1;</code>
     */
    public UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.User user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        User, User.Builder, UserOrBuilder>
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            User, User.Builder, UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private boolean withColon_ ;
    /**
     * <code>bool withColon = 2;</code>
     * @return The withColon.
     */
    @Override
    public boolean getWithColon() {
      return withColon_;
    }
    /**
     * <code>bool withColon = 2;</code>
     * @param value The withColon to set.
     * @return This builder for chaining.
     */
    public Builder setWithColon(boolean value) {

      withColon_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool withColon = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearWithColon() {
      bitField0_ = (bitField0_ & ~0x00000002);
      withColon_ = false;
      onChanged();
      return this;
    }

    private boolean selfShowRealName_ ;
    /**
     * <code>bool self_show_real_name = 3;</code>
     * @return The selfShowRealName.
     */
    @Override
    public boolean getSelfShowRealName() {
      return selfShowRealName_;
    }
    /**
     * <code>bool self_show_real_name = 3;</code>
     * @param value The selfShowRealName to set.
     * @return This builder for chaining.
     */
    public Builder setSelfShowRealName(boolean value) {

      selfShowRealName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>bool self_show_real_name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSelfShowRealName() {
      bitField0_ = (bitField0_ & ~0x00000004);
      selfShowRealName_ = false;
      onChanged();
      return this;
    }

    private int leftShowExtension_ ;
    /**
     * <code>uint32 left_show_extension = 4;</code>
     * @return The leftShowExtension.
     */
    @Override
    public int getLeftShowExtension() {
      return leftShowExtension_;
    }
    /**
     * <code>uint32 left_show_extension = 4;</code>
     * @param value The leftShowExtension to set.
     * @return This builder for chaining.
     */
    public Builder setLeftShowExtension(int value) {

      leftShowExtension_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 left_show_extension = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeftShowExtension() {
      bitField0_ = (bitField0_ & ~0x00000008);
      leftShowExtension_ = 0;
      onChanged();
      return this;
    }

    private Object leftAdditionalContent_ = "";
    /**
     * <code>string left_additional_content = 5;</code>
     * @return The leftAdditionalContent.
     */
    public String getLeftAdditionalContent() {
      Object ref = leftAdditionalContent_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        leftAdditionalContent_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string left_additional_content = 5;</code>
     * @return The bytes for leftAdditionalContent.
     */
    public com.google.protobuf.ByteString
        getLeftAdditionalContentBytes() {
      Object ref = leftAdditionalContent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        leftAdditionalContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string left_additional_content = 5;</code>
     * @param value The leftAdditionalContent to set.
     * @return This builder for chaining.
     */
    public Builder setLeftAdditionalContent(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      leftAdditionalContent_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string left_additional_content = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLeftAdditionalContent() {
      leftAdditionalContent_ = getDefaultInstance().getLeftAdditionalContent();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string left_additional_content = 5;</code>
     * @param value The bytes for leftAdditionalContent to set.
     * @return This builder for chaining.
     */
    public Builder setLeftAdditionalContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      leftAdditionalContent_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private Object rightAdditionalContent_ = "";
    /**
     * <code>string right_additional_content = 6;</code>
     * @return The rightAdditionalContent.
     */
    public String getRightAdditionalContent() {
      Object ref = rightAdditionalContent_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        rightAdditionalContent_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string right_additional_content = 6;</code>
     * @return The bytes for rightAdditionalContent.
     */
    public com.google.protobuf.ByteString
        getRightAdditionalContentBytes() {
      Object ref = rightAdditionalContent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        rightAdditionalContent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string right_additional_content = 6;</code>
     * @param value The rightAdditionalContent to set.
     * @return This builder for chaining.
     */
    public Builder setRightAdditionalContent(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      rightAdditionalContent_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>string right_additional_content = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearRightAdditionalContent() {
      rightAdditionalContent_ = getDefaultInstance().getRightAdditionalContent();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>string right_additional_content = 6;</code>
     * @param value The bytes for rightAdditionalContent to set.
     * @return This builder for chaining.
     */
    public Builder setRightAdditionalContentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      rightAdditionalContent_ = value;
      bitField0_ |= 0x00000020;
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


    // @@protoc_insertion_point(builder_scope:TextPieceUser)
  }

  // @@protoc_insertion_point(class_scope:TextPieceUser)
  private static final TextPieceUser DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new TextPieceUser();
  }

  public static TextPieceUser getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TextPieceUser>
      PARSER = new com.google.protobuf.AbstractParser<TextPieceUser>() {
    @Override
    public TextPieceUser parsePartialFrom(
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

  public static com.google.protobuf.Parser<TextPieceUser> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<TextPieceUser> getParserForType() {
    return PARSER;
  }

  @Override
  public TextPieceUser getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

