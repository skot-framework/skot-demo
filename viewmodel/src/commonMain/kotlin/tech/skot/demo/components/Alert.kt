package tech.skot.demo.components

import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class Alert :Component<AlertView>(){

    override val view = viewInjector.alert()

    fun show(title:String?, message:String?) {
        view.state = AlertView.Shown(
            title = title,
            message = message,
            buttons = listOf(
                AlertView.Button(label = "Ok", action = { dismiss() })
            ),
            onDismissRequest = { dismiss() }
        )
    }

    fun dismiss() {
        view.state = null
    }
}