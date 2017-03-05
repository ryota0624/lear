package application.child
import base.AbstractUpdate

/**
  * Created by ryota on 2017/03/05.
  */

object Update extends AbstractUpdate[Msg, Model]  {
  def apply(msg: Msg, model: Model) = msg match {
    case Init => model
    case SetInteger(num) => model.copy(num = num)
  }
}