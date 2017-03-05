package usecases

import application.{Application, Model, Msg, SetText}

import scala.scalajs.js.annotation.JSExport

/**
  * Created by ryota on 2017/03/05.
  */
class AppUsecase(application: Application) extends AbstractUsecase(app = application) {
  @JSExport
  def updateText(text: String): Unit = {
    app.dispatch(SetText(text))
  }

  @JSExport
  def updateTextWithAt(text: String): Unit = {
    app.dispatch(SetText(text ++ "@"))
  }
}
