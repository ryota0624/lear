/**
 * Created by ryota on 2017/03/05.
 */

sealed class Msg {
    object Init: Msg()
    class Update(val num: Int) : Msg()
    class AppChildMsg(val childMsg: child.Msg) : Msg()
}