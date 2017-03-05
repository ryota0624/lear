package usecases

import application.{Application, ChildMsg}
import application.child.{Msg, SetInteger}

import scala.scalajs.js.annotation.JSExport

/**
  * Created by ryota on 2017/03/05.
  */
class ChildUsecase(application: Application) extends AbstractUsecase(app = application) {
  def wrapDispatch(msg: Msg): Unit = {
    app.dispatch(ChildMsg(msg))
  }
  @JSExport
  def updateInteger(num: Int): Unit = {
    wrapDispatch(SetInteger(num))
  }

  @JSExport
  def updateCalcInteger(num: Int): Unit = {
    wrapDispatch(SetInteger(num + 1000))
  }
}