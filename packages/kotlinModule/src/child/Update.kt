package child

/**
 * Created by ryota on 2017/03/05.
 */

fun update(model: child.Model, msg: Msg) : child.Model {
    return when (msg) {
        is child.Msg.Init -> model
        is child.Msg.Update -> model.copy(str = msg.str)
        else -> model
    }
}
