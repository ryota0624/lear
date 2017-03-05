import scala.scalajs.js.JSApp
import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport
/**
  * Created by ryota on 2017/03/05.
  */
@JSExport
object scalaModule {
  def main(): Unit = {
    println("hello")
  }

  @JSExport
  def calc(v: Int): Int = v + 100
}
