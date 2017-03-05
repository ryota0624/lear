package application

import child.{JSModel => JSChildModel, Model => ChildModel}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExport, ScalaJSDefined}

case class Model(text: String, child: ChildModel) {
  @JSExport
  def toJS: JSModel = new JSModel(text = text, child = child.toJS)
}

@ScalaJSDefined
class JSModel(val text: String, val child: JSChildModel) extends js.Object {
  def echo() = text
}
