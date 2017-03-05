package base

/**
  * Created by ryota on 2017/03/05.
  */
abstract class AbstractUpdate[Msg, Model] {
  def apply(msg: Msg, model: Model): Model
}
