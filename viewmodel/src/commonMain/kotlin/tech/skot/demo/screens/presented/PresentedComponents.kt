package tech.skot.demo.screens.presented

import tech.skot.core.components.presented.Alert
import tech.skot.core.components.presented.AlertVC
import tech.skot.core.components.presented.BottomSheet
import tech.skot.core.components.presented.SnackBar
import tech.skot.demo.di.strings
import tech.skot.demo.di.viewInjector

class PresentedComponents : PresentedComponentsGen() {
    private val alert: Alert = Alert()

    private val bottomSheet: BottomSheet = BottomSheet()

    private val snackBar: SnackBar = SnackBar()

    override val view: PresentedComponentsVC = viewInjector.presentedComponents(alert =
    alert.view, bottomSheet = bottomSheet.view, snackBar = snackBar.view, onTapAlert = {
        onTapAlert()
    }, onTapBottomSheet = { onTapBottomSheet() }, onTapSnackSimple = {
        onTapSnackSimple()
    }, onTapSnackWithAction = { onTapSnackWithAction() })

    private fun onTapAlert() {
        alert.show(
                title = "Title",
                message = "message",
                mainButton = AlertVC.Button("mainButton") {
                    snackBar.show("mainButton tapped")
                },
                secondaryButton = AlertVC.Button("secondaryButton") {
                    snackBar.show("secondaryButton tapped")
                })
    }

    private fun onTapBottomSheet() {
        bottomSheet.show(BottomPageExample())
    }

    private fun onTapSnackSimple() {
        snackBar.show(strings.presented_components_simple_snack_message)
    }

    private fun onTapSnackWithAction() {
        snackBar.show(
                message = strings.presented_components_snack_with_action_message,
                action = SnackBar.Action(
                        label = strings.presented_components_snack_with_action_button_label
                ) {
                    alert.show(title = "snack action tapped", message = null)
                }
        )
    }
}
