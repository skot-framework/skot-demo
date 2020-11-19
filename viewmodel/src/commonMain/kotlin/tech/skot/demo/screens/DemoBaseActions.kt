package tech.skot.demo.screens

import tech.skot.demo.base.BaseActions
import tech.skot.demo.viewInjector

class DemoBaseActions : DemoBaseActionsGen() {

  private val onBack = { finish() }

  override val view: DemoBaseActionsView = viewInjector.demoBaseActions(
    onTapBack = onBack,
    onTapAlert = { onTapAlert() },
    onTapConfirm = { onTapConfirm() },
    onTapSnack = { onTapSnack() },
    onTapShortSnack = { onTapShortSnack() },
    onTapOpenExternalNavigator = { onTapOpenExternalNavigator() }
  )

  private fun onTapAlert() {
    view.displayAlert(
      title = "Titre de l'alerte",
      message = "Message de l'alerte",
      onOk = {
        view.toast("Vous avez clické sur \"ok\"")
      }
    )
  }

  private fun onTapConfirm() {
    view.confirm(
      title = "Titre de la confirmation",
      message = "Message de la confirmation",
      okLabel = "Ok Label",
      koLabel = "Ko Label",
      onOk = {
        view.toast("Vous avez clické sur \"ok\"")
      }

    )
  }

  private fun onTapSnack() {
    view.snack("un snack avec un message qui s'affiche longtemps", long = true, action = BaseActions.SnackAction("une action", {
      view.toast("vous avez tapé sur l'acion de snack")
    }))
  }

  private fun onTapShortSnack() {
    view.snack("un autre snack qui s'affiche moins longtemps", long = false, action = null)
  }

  private fun onTapOpenExternalNavigator() {
    view.openExternalNavigator("https://github.com/MathieuScotet/skot")
  }

  init {
      view.onBack = onBack
  }

}
