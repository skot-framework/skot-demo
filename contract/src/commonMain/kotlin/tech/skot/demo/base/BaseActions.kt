package tech.skot.demo.base

interface BaseActions {
    fun displayAlert(title: String? = null, message: String? = null, onOk:(()->Unit)? = null)
    fun confirm(title: String? = null, message: String? = null, okLabel:String? = null, koLabel:String? = null, onOk:()->Unit)

    fun toast(message:String, top:Boolean = false, long:Boolean = false)
    fun snack(message:String, long:Boolean = false, action:Pair<String,()->Unit>? = null)

    fun openExternalNavigator(url:String)
    fun closeKeyboard()
}