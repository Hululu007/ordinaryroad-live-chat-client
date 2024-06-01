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

public interface RanklistHourEntrance_DetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RanklistHourEntrance_Detail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 假设 pages 是 RanklistHourEntrance_Page 类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Page pages = 1;</code>
   */
  java.util.List<tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_Page> 
      getPagesList();
  /**
   * <pre>
   * 假设 pages 是 RanklistHourEntrance_Page 类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Page pages = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_Page getPages(int index);
  /**
   * <pre>
   * 假设 pages 是 RanklistHourEntrance_Page 类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Page pages = 1;</code>
   */
  int getPagesCount();
  /**
   * <pre>
   * 假设 pages 是 RanklistHourEntrance_Page 类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Page pages = 1;</code>
   */
  java.util.List<? extends tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_PageOrBuilder> 
      getPagesOrBuilderList();
  /**
   * <pre>
   * 假设 pages 是 RanklistHourEntrance_Page 类型
   * </pre>
   *
   * <code>repeated .RanklistHourEntrance_Page pages = 1;</code>
   */
  tech.ordinaryroad.live.chat.client.codec.douyin.protobuf.RanklistHourEntrance_PageOrBuilder getPagesOrBuilder(
      int index);

  /**
   * <pre>
   * 排名列表类型
   * </pre>
   *
   * <code>int32 ranklist_type = 2;</code>
   * @return The ranklistType.
   */
  int getRanklistType();

  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * 标题
   * </pre>
   *
   * <code>string title = 3;</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * 排名列表额外信息
   * </pre>
   *
   * <code>string ranklist_extra = 4;</code>
   * @return The ranklistExtra.
   */
  java.lang.String getRanklistExtra();
  /**
   * <pre>
   * 排名列表额外信息
   * </pre>
   *
   * <code>string ranklist_extra = 4;</code>
   * @return The bytes for ranklistExtra.
   */
  com.google.protobuf.ByteString
      getRanklistExtraBytes();

  /**
   * <pre>
   * 入口额外信息
   * </pre>
   *
   * <code>string entrance_extra = 5;</code>
   * @return The entranceExtra.
   */
  java.lang.String getEntranceExtra();
  /**
   * <pre>
   * 入口额外信息
   * </pre>
   *
   * <code>string entrance_extra = 5;</code>
   * @return The bytes for entranceExtra.
   */
  com.google.protobuf.ByteString
      getEntranceExtraBytes();

  /**
   * <pre>
   * 模式
   * </pre>
   *
   * <code>string schema = 6;</code>
   * @return The schema.
   */
  java.lang.String getSchema();
  /**
   * <pre>
   * 模式
   * </pre>
   *
   * <code>string schema = 6;</code>
   * @return The bytes for schema.
   */
  com.google.protobuf.ByteString
      getSchemaBytes();
}
