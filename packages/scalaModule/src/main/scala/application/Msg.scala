package application

sealed trait Msg

case object Init extends Msg
case class SetText(text: String) extends Msg
case class ChildMsg(msg: child.Msg) extends Msg