import application.child.SetInteger
import application._
import usecases.{AppUsecase, ChildUsecase}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

/**
  * Created by ryota on 2017/03/05.
  */
@JSExport
object scalaModule {
  val app = new Application(Model(text = "", child = application.child.Model(0)), Update.apply)

  @JSExport
  def subscribe(fn: js.Function1[js.Object, Unit]): Unit = {
    app.addChangeListener { model => fn(model.toJS)}
  }
  @JSExport
  val appUsecase = new AppUsecase(app)
  @JSExport
  val childUsecase = new ChildUsecase(app)
  @JSExport
  def main(): Unit = {

    app.dispatch(SetText(text = "FIRE"))
    app.dispatch(ChildMsg(SetInteger(1000)))
  }
}
