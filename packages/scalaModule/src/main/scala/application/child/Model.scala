package application.child

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined

/**
  * Created by ryota on 2017/03/05.
  */
case class Model(num: Int) {
  def toJS = new JSModel(num = num)
}

@ScalaJSDefined
class JSModel(val num: Int) extends js.Object