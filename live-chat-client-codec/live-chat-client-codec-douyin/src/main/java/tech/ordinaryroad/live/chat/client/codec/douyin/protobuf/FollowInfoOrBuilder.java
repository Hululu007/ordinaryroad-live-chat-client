// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: douyin.proto

// Protobuf Java Version: 3.25.5
package tech.ordinaryroad.live.chat.client.codec.douyin.protobuf;

public interface FollowInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:FollowInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 followingCount = 1;</code>
   * @return The followingCount.
   */
  long getFollowingCount();

  /**
   * <code>uint64 followerCount = 2;</code>
   * @return The followerCount.
   */
  long getFollowerCount();

  /**
   * <code>uint64 followStatus = 3;</code>
   * @return The followStatus.
   */
  long getFollowStatus();

  /**
   * <code>uint64 pushStatus = 4;</code>
   * @return The pushStatus.
   */
  long getPushStatus();

  /**
   * <code>string remarkName = 5;</code>
   * @return The remarkName.
   */
  java.lang.String getRemarkName();
  /**
   * <code>string remarkName = 5;</code>
   * @return The bytes for remarkName.
   */
  com.google.protobuf.ByteString
      getRemarkNameBytes();

  /**
   * <code>string followerCountStr = 6;</code>
   * @return The followerCountStr.
   */
  java.lang.String getFollowerCountStr();
  /**
   * <code>string followerCountStr = 6;</code>
   * @return The bytes for followerCountStr.
   */
  com.google.protobuf.ByteString
      getFollowerCountStrBytes();

  /**
   * <code>string followingCountStr = 7;</code>
   * @return The followingCountStr.
   */
  java.lang.String getFollowingCountStr();
  /**
   * <code>string followingCountStr = 7;</code>
   * @return The bytes for followingCountStr.
   */
  com.google.protobuf.ByteString
      getFollowingCountStrBytes();
}