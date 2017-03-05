/**
 * Created by ryota on 2017/03/05.
 */


data class Model(val num: Int, val childModel: child.Model)

val initialModel = Model(num = 0, childModel = child.InitialModel.model)