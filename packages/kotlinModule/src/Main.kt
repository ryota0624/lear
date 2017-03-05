/**
 * Created by ryota on 2017/03/05.
 */
@JsName("main")
fun main(args: Array<String>) {
    println(initialModel.toString())
    val initialState = initialModel
    val app = Application<Msg, Model>(initialState , update = update)
    println(app.getState().toString())
    app.dispatch(Msg.AppChildMsg(child.Msg.Update("10000")))
    println(app.getState().toString())
}