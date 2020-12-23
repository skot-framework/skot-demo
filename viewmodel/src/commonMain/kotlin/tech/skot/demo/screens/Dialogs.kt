package tech.skot.demo.screens

import tech.skot.core.components.Screen
import tech.skot.core.components.presented.Alert
import tech.skot.core.components.presented.AlertView
import tech.skot.core.components.presented.BottomSheet
import tech.skot.core.components.presented.SnackBar
import tech.skot.core.di.rootStack
import tech.skot.demo.di.viewInjector

class Dialogs : Screen<DialogsView>() {

    private val alert = Alert()
    private val snackBar = SnackBar()
    private val bottomSheet = BottomSheet()

    override val view = viewInjector.dialogs(
        alert = alert.view,
        snackBar = snackBar.view,
        bottomSheet = bottomSheet.view,
        onTapSnack = {
            snackBar.show(
                "un test de snack",
                SnackBar.Action("action", { alert.show("de Snack", "pas de message ;)") })
            )
        },
        onTapAlert = {
            alert.show("Test d'alerte", "alerte par défaut, sans bouton spécifé")
        },
        onTapAlertCustomButton = {
            alert.show(
                "Test d'alerte",
                "alerte avec bouton personnalisé avec une action",
                AlertView.Button("Bouton personnalisé !", {
                    snackBar.show("Action personnalisée aussi !")
                })
            )
        },
        onTapAlertTwoButtons = {
            alert.show(
                "Test d'alerte", "alerte avec 2 boutons !",
                AlertView.Button("Bouton 1", {
                    snackBar.show("Action 1")
                }),
                AlertView.Button("Bouton 2", {
                    snackBar.show("Action 2")
                })
            )
        },

        onTapShowBottomSheet = {
            bottomSheet.show(BottomSheetExample())
        },
        onTapShowGlobalBottomSheet = {
            rootStack.bottomSheet.show(BottomSheetExample())
        }
        )


    init {
        view.onBackPressed = {
            logD("Back from : \"Dialogs\"")
        }
    }
}