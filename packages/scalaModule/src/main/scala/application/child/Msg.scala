package application.child

/**
  * Created by ryota on 2017/03/05.
  */
sealed trait Msg


object Init extends Msg
case class SetInteger(int: Int) extends Msg
