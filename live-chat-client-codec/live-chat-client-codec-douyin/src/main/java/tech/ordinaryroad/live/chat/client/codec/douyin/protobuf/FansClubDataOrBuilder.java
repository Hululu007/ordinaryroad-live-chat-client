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

public interface FansClubDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FansClubData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string clubName = 1;</code>
   * @return The clubName.
   */
  java.lang.String getClubName();
  /**
   * <code>string clubName = 1;</code>
   * @return The bytes for clubName.
   */
  com.google.protobuf.ByteString
      getClubNameBytes();

  /**
   * <code>int32 level = 2;</code>
   * @return The level.
   */
  int getLevel();

  /**
   * <code>int32 userFansClubStatus = 3;</code>
   * @return The userFansClubStatus.
   */
  int getUserFansClubStatus();

  /**
   * <code>.UserBadge badge = 4;</code>
   * @return Whether the badge field is set.
   */
  boolean hasBadge();
  /**
   * <code>.UserBadge badge = 4;</code>
   * @return The badge.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.UserBadge getBadge();
  /**
   * <code>.UserBadge badge = 4;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.UserBadgeOrBuilder getBadgeOrBuilder();

  /**
   * <code>repeated int64 availableGiftIds = 5;</code>
   * @return A list containing the availableGiftIds.
   */
  java.util.List<java.lang.Long> getAvailableGiftIdsList();
  /**
   * <code>repeated int64 availableGiftIds = 5;</code>
   * @return The count of availableGiftIds.
   */
  int getAvailableGiftIdsCount();
  /**
   * <code>repeated int64 availableGiftIds = 5;</code>
   * @param index The index of the element to return.
   * @return The availableGiftIds at the given index.
   */
  long getAvailableGiftIds(int index);

  /**
   * <code>int64 anchorId = 6;</code>
   * @return The anchorId.
   */
  long getAnchorId();
}
