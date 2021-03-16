package tech.skot.demo.screens.presented

import tech.skot.core.components.SKUses
import tech.skot.core.components.ScreenVC
import tech.skot.core.components.presented.AlertVC
import tech.skot.core.components.presented.BottomSheetVC
import tech.skot.core.components.presented.SnackBarVC

@SKUses([BottomPageExampleVC::class])
interface PresentedComponentsVC : ScreenVC {
    val onTapAlert: () -> Unit
    val onTapSnackSimple: () -> Unit
    val onTapSnackWithAction: () -> Unit
    val onTapBottomSheet: () -> Unit

    val alert: AlertVC
    val snackBar: SnackBarVC
    val bottomSheet: BottomSheetVC
}