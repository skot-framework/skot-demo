package tech.skot.demo.screens

import tech.skot.core.components.AlertView
import tech.skot.core.components.ScreenView
import tech.skot.core.components.SnackBarView

interface DialogsView : ScreenView {
    val alert: AlertView
    val snackBar: SnackBarView

    val onTapAlert: () -> Unit
    val onTapSnack: () -> Unit
}