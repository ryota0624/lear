package child

/**
 * Created by ryota on 2017/03/05.
 */


sealed class Msg {
    object Init: Msg()
    class Update(val str: String) : Msg()
}

