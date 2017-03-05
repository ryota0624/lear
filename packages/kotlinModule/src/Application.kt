/**
 * Created by ryota on 2017/03/05.
 */
class Application<M, Mod>(var model: Mod, val update: (msg: M, model: Mod) -> Mod) {
    var subscribers: List<(Mod) -> Unit> = emptyList()
    fun dispatch(msg: M) {
        model = update(msg, model)
    }

    fun addChangeListener(handler: (Mod) -> Unit): () -> Unit {
        subscribers = subscribers.plus(handler)
        val index = subscribers.lastIndex
        return {
            subscribers.drop(index)
        }
    }

    fun getState(): Mod {
        return model
    }
}