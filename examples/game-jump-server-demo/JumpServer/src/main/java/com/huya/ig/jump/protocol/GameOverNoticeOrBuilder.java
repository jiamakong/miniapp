// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: jump.proto

package com.huya.ig.jump.protocol;

public interface GameOverNoticeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:pb.GameOverNotice)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  java.util.List<com.huya.ig.jump.protocol.Player> 
      getRankList();
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  com.huya.ig.jump.protocol.Player getRank(int index);
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  int getRankCount();
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  java.util.List<? extends com.huya.ig.jump.protocol.PlayerOrBuilder> 
      getRankOrBuilderList();
  /**
   * <pre>
   * 玩家排行榜
   * </pre>
   *
   * <code>repeated .pb.Player rank = 1;</code>
   */
  com.huya.ig.jump.protocol.PlayerOrBuilder getRankOrBuilder(
      int index);
}
