// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package com.google.protobuf.struct

/** `NullValue` is a singleton enumeration to represent the null value for the
  * `Value` type union.
  *
  *  The JSON representation for `NullValue` is JSON `null`.
  */
sealed trait NullValue extends _root_.scalapb.GeneratedEnum {
  type EnumType = NullValue
  def isNullValue: _root_.scala.Boolean = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[NullValue] = com.google.protobuf.struct.NullValue
}

object NullValue extends _root_.scalapb.GeneratedEnumCompanion[NullValue] {
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[NullValue] = this
  /** Null value.
    */
  @SerialVersionUID(0L)
  case object NULL_VALUE extends NullValue {
    val value = 0
    val index = 0
    val name = "NULL_VALUE"
    override def isNullValue: _root_.scala.Boolean = true
  }
  
  @SerialVersionUID(0L)
  final case class Unrecognized(value: _root_.scala.Int) extends NullValue with _root_.scalapb.UnrecognizedEnum
  
  lazy val values = scala.collection.Seq(NULL_VALUE)
  def fromValue(value: _root_.scala.Int): NullValue = value match {
    case 0 => NULL_VALUE
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor = StructProto.javaDescriptor.getEnumTypes.get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor = StructProto.scalaDescriptor.enums(0)
  def fromJavaValue(pbJavaSource: com.google.protobuf.NullValue): NullValue = fromValue(pbJavaSource.getNumber)
  def toJavaValue(pbScalaSource: NullValue): com.google.protobuf.NullValue = {
    _root_.scala.Predef.require(!pbScalaSource.isUnrecognized, "Unrecognized enum values can not be converted to Java")
    com.google.protobuf.NullValue.forNumber(pbScalaSource.value)
  }
}