// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package scalapb.perf.protos

sealed abstract class Color(val value: _root_.scala.Int) extends _root_.scalapb.GeneratedEnum {
  type EnumType = Color
  def isUnknown: _root_.scala.Boolean                         = false
  def isRed: _root_.scala.Boolean                             = false
  def isGreen: _root_.scala.Boolean                           = false
  def isBlue: _root_.scala.Boolean                            = false
  def companion: _root_.scalapb.GeneratedEnumCompanion[Color] = scalapb.perf.protos.Color
  final def asRecognized: _root_.scala.Option[scalapb.perf.protos.Color.Recognized] = if (
    isUnrecognized
  ) _root_.scala.None
  else _root_.scala.Some(this.asInstanceOf[scalapb.perf.protos.Color.Recognized])
}

object Color extends _root_.scalapb.GeneratedEnumCompanion[Color] {
  sealed trait Recognized extends Color
  implicit def enumCompanion: _root_.scalapb.GeneratedEnumCompanion[Color] = this

  @SerialVersionUID(0L)
  case object UNKNOWN extends Color(0) with Color.Recognized {
    val index                                    = 0
    val name                                     = "UNKNOWN"
    override def isUnknown: _root_.scala.Boolean = true
  }

  @SerialVersionUID(0L)
  case object RED extends Color(1) with Color.Recognized {
    val index                                = 1
    val name                                 = "RED"
    override def isRed: _root_.scala.Boolean = true
  }

  @SerialVersionUID(0L)
  case object GREEN extends Color(2) with Color.Recognized {
    val index                                  = 2
    val name                                   = "GREEN"
    override def isGreen: _root_.scala.Boolean = true
  }

  @SerialVersionUID(0L)
  case object BLUE extends Color(3) with Color.Recognized {
    val index                                 = 3
    val name                                  = "BLUE"
    override def isBlue: _root_.scala.Boolean = true
  }

  @SerialVersionUID(0L)
  final case class Unrecognized(unrecognizedValue: _root_.scala.Int)
      extends Color(unrecognizedValue)
      with _root_.scalapb.UnrecognizedEnum
  lazy val values = scala.collection.immutable.Seq(UNKNOWN, RED, GREEN, BLUE)
  def fromValue(__value: _root_.scala.Int): Color = __value match {
    case 0       => UNKNOWN
    case 1       => RED
    case 2       => GREEN
    case 3       => BLUE
    case __other => Unrecognized(__other)
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.EnumDescriptor =
    ProtosProto.javaDescriptor.getEnumTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.EnumDescriptor =
    ProtosProto.scalaDescriptor.enums(0)
}
