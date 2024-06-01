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

public interface RanklistHourEntrance_PageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:RanklistHourEntrance_Page)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Content of the page
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The content.
   */
  java.lang.String getContent();
  /**
   * <pre>
   * Content of the page
   * </pre>
   *
   * <code>string content = 1;</code>
   * @return The bytes for content.
   */
  com.google.protobuf.ByteString
      getContentBytes();

  /**
   * <pre>
   * Background color of the page
   * </pre>
   *
   * <code>string background_color = 2;</code>
   * @return The backgroundColor.
   */
  java.lang.String getBackgroundColor();
  /**
   * <pre>
   * Background color of the page
   * </pre>
   *
   * <code>string background_color = 2;</code>
   * @return The bytes for backgroundColor.
   */
  com.google.protobuf.ByteString
      getBackgroundColorBytes();

  /**
   * <pre>
   * Number of times the page is shown (or similar)
   * </pre>
   *
   * <code>int64 show_times = 3;</code>
   * @return The showTimes.
   */
  long getShowTimes();

  /**
   * <pre>
   * Type of the content
   * </pre>
   *
   * <code>int32 content_type = 4;</code>
   * @return The contentType.
   */
  int getContentType();
}
