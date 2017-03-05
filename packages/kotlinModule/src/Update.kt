/**
 * Created by ryota on 2017/03/05.
 */
fun appUpdate(msg: Msg, model: Model): Model {
    return when (msg) {
        is Msg.Init -> model
        is Msg.Update -> model.copy(num = msg.num)
        is Msg.AppChildMsg -> model.copy(childModel = child.update(model.childModel, msg.childMsg))
        else -> model
    }
}

val update: (msg: Msg, model: Model) -> Model = { msg, model -> appUpdate(msg, model) }
