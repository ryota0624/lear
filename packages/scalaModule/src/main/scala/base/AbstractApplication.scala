package base

/**
  * Created by ryota on 2017/03/05.
  */
abstract class AbstractApplication[Msg, Model](var model: Model, val update: (Msg, Model) => Model) {
  type Handler = (Model) => Unit
  var subscribers: List[Handler] = List.empty
  def dispatch(msg: Msg): Unit = {
    model = update(msg, model)
    subscribers.foreach { fn => fn(model) }
  }

  def addChangeListener(handler: Handler): () => Unit = {
    subscribers = subscribers ++ List(handler)
    val lastIndex = subscribers.length - 1
    () => {
      subscribers = subscribers.zipWithIndex
        .filter { case (_, index) => index != lastIndex }
        .map {case (h, _) => h}
    }
  }

  def getState: Model = model
}
