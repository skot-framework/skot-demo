package tech.skot.demo.screens

import tech.skot.demo.components.Alert
import tech.skot.demo.components.SnackBar
import tech.skot.demo.components.SnackBarView
import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class Dialogs : Component<DialogsView>() {

    val alert = Alert()
    val snackBar = SnackBar()

    override val view = viewInjector.dialogs(
        alert = alert.view,
        snackBar = snackBar.view,
        onTapSnack = {
            snackBar.show("un test de snack", SnackBar.Action("action", { alert.show("de Snack", "pas de message ;)") }))
        },
        onTapAlert = {
            alert.show("Test d'alerte", "elle est cancellable")
        })

}