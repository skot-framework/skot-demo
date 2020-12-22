package tech.skot.demo.screens

import tech.skot.core.components.Screen
import tech.skot.core.components.presented.Alert
import tech.skot.core.components.presented.BottomSheet
import tech.skot.core.components.presented.BottomSheetView
import tech.skot.core.components.presented.SnackBar
import tech.skot.demo.di.viewInjector

class Dialogs : Screen<DialogsView>() {

    val alert = Alert()
    val snackBar = SnackBar()
    val bottomSheet = BottomSheet()

    override val view = viewInjector.dialogs(
        alert = alert.view,
        snackBar = snackBar.view,
        bottomSheet = bottomSheet.view,
        onTapSnack = {
            snackBar.show("un test de snack", SnackBar.Action("action", { alert.show("de Snack", "pas de message ;)") }))
        },
        onTapAlert = {
            alert.show("Test d'alerte", "elle est cancellable")
        },
    onTapShowBottomSheet = {
        bottomSheet.show(BottomSheetExample())
    })


    init {
        view.onBackPressed = {
            logD("Back from : \"Dialogs\"")
        }
    }
}