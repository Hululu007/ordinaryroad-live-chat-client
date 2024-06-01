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

public interface RoomUserSeqMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RoomUserSeqMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Common common = 1;</code>
   * @return Whether the common field is set.
   */
  boolean hasCommon();
  /**
   * <code>.Common common = 1;</code>
   * @return The common.
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.Common getCommon();
  /**
   * <code>.Common common = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.CommonOrBuilder getCommonOrBuilder();

  /**
   * <code>repeated .RoomUserSeqMessageContributor ranksList = 2;</code>
   */
  java.util.List<tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributor> 
      getRanksListList();
  /**
   * <code>repeated .RoomUserSeqMessageContributor ranksList = 2;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributor getRanksList(int index);
  /**
   * <code>repeated .RoomUserSeqMessageContributor ranksList = 2;</code>
   */
  int getRanksListCount();
  /**
   * <code>repeated .RoomUserSeqMessageContributor ranksList = 2;</code>
   */
  java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributorOrBuilder> 
      getRanksListOrBuilderList();
  /**
   * <code>repeated .RoomUserSeqMessageContributor ranksList = 2;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributorOrBuilder getRanksListOrBuilder(
      int index);

  /**
   * <code>int64 total = 3;</code>
   * @return The total.
   */
  long getTotal();

  /**
   * <code>string popStr = 4;</code>
   * @return The popStr.
   */
  java.lang.String getPopStr();
  /**
   * <code>string popStr = 4;</code>
   * @return The bytes for popStr.
   */
  com.google.protobuf.ByteString
      getPopStrBytes();

  /**
   * <code>repeated .RoomUserSeqMessageContributor seatsList = 5;</code>
   */
  java.util.List<tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributor> 
      getSeatsListList();
  /**
   * <code>repeated .RoomUserSeqMessageContributor seatsList = 5;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributor getSeatsList(int index);
  /**
   * <code>repeated .RoomUserSeqMessageContributor seatsList = 5;</code>
   */
  int getSeatsListCount();
  /**
   * <code>repeated .RoomUserSeqMessageContributor seatsList = 5;</code>
   */
  java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributorOrBuilder> 
      getSeatsListOrBuilderList();
  /**
   * <code>repeated .RoomUserSeqMessageContributor seatsList = 5;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RoomUserSeqMessageContributorOrBuilder getSeatsListOrBuilder(
      int index);

  /**
   * <code>int64 popularity = 6;</code>
   * @return The popularity.
   */
  long getPopularity();

  /**
   * <code>int64 totalUser = 7;</code>
   * @return The totalUser.
   */
  long getTotalUser();

  /**
   * <code>string totalUserStr = 8;</code>
   * @return The totalUserStr.
   */
  java.lang.String getTotalUserStr();
  /**
   * <code>string totalUserStr = 8;</code>
   * @return The bytes for totalUserStr.
   */
  com.google.protobuf.ByteString
      getTotalUserStrBytes();

  /**
   * <code>string totalStr = 9;</code>
   * @return The totalStr.
   */
  java.lang.String getTotalStr();
  /**
   * <code>string totalStr = 9;</code>
   * @return The bytes for totalStr.
   */
  com.google.protobuf.ByteString
      getTotalStrBytes();

  /**
   * <code>string onlineUserForAnchor = 10;</code>
   * @return The onlineUserForAnchor.
   */
  java.lang.String getOnlineUserForAnchor();
  /**
   * <code>string onlineUserForAnchor = 10;</code>
   * @return The bytes for onlineUserForAnchor.
   */
  com.google.protobuf.ByteString
      getOnlineUserForAnchorBytes();

  /**
   * <code>string totalPvForAnchor = 11;</code>
   * @return The totalPvForAnchor.
   */
  java.lang.String getTotalPvForAnchor();
  /**
   * <code>string totalPvForAnchor = 11;</code>
   * @return The bytes for totalPvForAnchor.
   */
  com.google.protobuf.ByteString
      getTotalPvForAnchorBytes();

  /**
   * <code>string upRightStatsStr = 12;</code>
   * @return The upRightStatsStr.
   */
  java.lang.String getUpRightStatsStr();
  /**
   * <code>string upRightStatsStr = 12;</code>
   * @return The bytes for upRightStatsStr.
   */
  com.google.protobuf.ByteString
      getUpRightStatsStrBytes();

  /**
   * <code>string upRightStatsStrComplete = 13;</code>
   * @return The upRightStatsStrComplete.
   */
  java.lang.String getUpRightStatsStrComplete();
  /**
   * <code>string upRightStatsStrComplete = 13;</code>
   * @return The bytes for upRightStatsStrComplete.
   */
  com.google.protobuf.ByteString
      getUpRightStatsStrCompleteBytes();
}
