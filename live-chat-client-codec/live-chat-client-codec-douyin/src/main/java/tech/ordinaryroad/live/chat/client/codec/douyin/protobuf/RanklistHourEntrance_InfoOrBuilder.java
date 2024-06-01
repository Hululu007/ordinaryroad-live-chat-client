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

public interface RanklistHourEntrance_InfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RanklistHourEntrance_Info)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * "details" 字段是一个重复字段，使用 RanklistHourEntrance.Detail 消息类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Detail details = 1;</code>
   */
  java.util.List<tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_Detail> 
      getDetailsList();
  /**
   * <pre>
   * "details" 字段是一个重复字段，使用 RanklistHourEntrance.Detail 消息类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Detail details = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_Detail getDetails(int index);
  /**
   * <pre>
   * "details" 字段是一个重复字段，使用 RanklistHourEntrance.Detail 消息类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Detail details = 1;</code>
   */
  int getDetailsCount();
  /**
   * <pre>
   * "details" 字段是一个重复字段，使用 RanklistHourEntrance.Detail 消息类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Detail details = 1;</code>
   */
  java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_DetailOrBuilder> 
      getDetailsOrBuilderList();
  /**
   * <pre>
   * "details" 字段是一个重复字段，使用 RanklistHourEntrance.Detail 消息类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Detail details = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_DetailOrBuilder getDetailsOrBuilder(
      int index);
}
