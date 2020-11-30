package tech.skot.demo.components

import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class SnackBar : Component<SnackBarView>() {

    override val view = viewInjector.snackBar()

    data class Action(val label: String, val action: () -> Unit)

    fun show(message: String, action: SnackBar.Action? = null) {
        view.state = SnackBarView.Shown(
            message = message,
            action = action?.let {
                SnackBarView.Action(
                    label = it.label,
                    action = it.action
                )
            },
        )
    }
}