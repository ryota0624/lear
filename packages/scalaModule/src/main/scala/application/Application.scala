package application

import base.AbstractApplication

/**
  * Created by ryota on 2017/03/05.
  */
class Application(model: Model, update: (Msg, Model) => Model)
  extends AbstractApplication[Msg, Model](model = model, update = update) {

}
