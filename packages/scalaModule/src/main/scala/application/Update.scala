package application

import base.AbstractUpdate

object Update extends AbstractUpdate[Msg, Model]  {
  def apply(msg: Msg, model: Model) = msg match {
    case Init => model
    case SetText(text) => model.copy(text = text)
    case ChildMsg(childMsg) => model.copy(child = child.Update.apply(childMsg, model.child))
  }
}