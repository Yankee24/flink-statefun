// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commands.proto

package org.apache.flink.statefun.e2e.smoke.generated;

public interface SourceCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.apache.flink.statefun.e2e.smoke.SourceCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 target = 1;</code>
   */
  int getTarget();

  /**
   * <code>.org.apache.flink.statefun.e2e.smoke.Commands commands = 2;</code>
   */
  boolean hasCommands();
  /**
   * <code>.org.apache.flink.statefun.e2e.smoke.Commands commands = 2;</code>
   */
  Commands getCommands();
  /**
   * <code>.org.apache.flink.statefun.e2e.smoke.Commands commands = 2;</code>
   */
  CommandsOrBuilder getCommandsOrBuilder();
}