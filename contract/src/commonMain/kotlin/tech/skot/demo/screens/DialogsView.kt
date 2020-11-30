package tech.skot.demo.screens

import tech.skot.contract.view.ComponentView
import tech.skot.demo.components.AlertView
import tech.skot.demo.components.SnackBarView

interface DialogsView : ComponentView {
    val alert:AlertView
    val snackBar:SnackBarView

    val onTapAlert:()->Unit
    val onTapSnack:()->Unit
}