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
 * Protobuf enum {@code CommentTypeTag}
 */
public enum CommentTypeTag
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>COMMENTTYPETAGUNKNOWN = 0;</code>
   */
  COMMENTTYPETAGUNKNOWN(0),
  /**
   * <code>COMMENTTYPETAGSTAR = 1;</code>
   */
  COMMENTTYPETAGSTAR(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>COMMENTTYPETAGUNKNOWN = 0;</code>
   */
  public static final int COMMENTTYPETAGUNKNOWN_VALUE = 0;
  /**
   * <code>COMMENTTYPETAGSTAR = 1;</code>
   */
  public static final int COMMENTTYPETAGSTAR_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @Deprecated
  public static CommentTypeTag valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CommentTypeTag forNumber(int value) {
    switch (value) {
      case 0: return COMMENTTYPETAGUNKNOWN;
      case 1: return COMMENTTYPETAGSTAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommentTypeTag>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CommentTypeTag> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CommentTypeTag>() {
          public CommentTypeTag findValueByNumber(int number) {
            return CommentTypeTag.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return Douyin.getDescriptor().getEnumTypes().get(0);
  }

  private static final CommentTypeTag[] VALUES = values();

  public static CommentTypeTag valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CommentTypeTag(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:CommentTypeTag)
}

