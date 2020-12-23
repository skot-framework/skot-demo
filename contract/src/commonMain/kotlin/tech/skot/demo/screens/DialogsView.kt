package tech.skot.demo.screens

import tech.skot.core.components.ScreenView
import tech.skot.core.components.presented.AlertView
import tech.skot.core.components.presented.BottomSheetView
import tech.skot.core.components.presented.SnackBarView

interface DialogsView : ScreenView {
    val alert: AlertView
    val snackBar: SnackBarView
    val bottomSheet: BottomSheetView

    val onTapAlert: () -> Unit
    val onTapAlertCustomButton:() -> Unit
    val onTapAlertTwoButtons:()->Unit
    val onTapSnack: () -> Unit
    val onTapShowBottomSheet: () -> Unit
}