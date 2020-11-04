// //### Generated by SKot do not modify
package tech.skot.demo.base

import kotlin.Boolean
import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.view.Action

sealed class BaseActionsAction : Action() {
  object CloseKeyboard : BaseActionsAction()

  class Confirm(
    val title: String?,
    val message: String?,
    val okLabel: String?,
    val koLabel: String?,
    val onOk: Function0<Unit>
  ) : BaseActionsAction()

  class DisplayAlert(
    val title: String?,
    val message: String?,
    val onOk: Function0<Unit>?
  ) : BaseActionsAction()

  class OpenExternalNavigator(
    val url: String
  ) : BaseActionsAction()

  class Snack(
    val message: String,
    val long: Boolean,
    val action: BaseActions.SnackAction?
  ) : BaseActionsAction()

  class Toast(
    val message: String,
    val top: Boolean,
    val long: Boolean
  ) : BaseActionsAction()
}

fun BaseActions.treatAction(action: BaseActionsAction) {
  when (action) {
    BaseActionsAction.CloseKeyboard -> closeKeyboard()
    is BaseActionsAction.Confirm -> confirm(action.title, action.message, action.okLabel,
        action.koLabel, action.onOk)
    is BaseActionsAction.DisplayAlert -> displayAlert(action.title, action.message, action.onOk)
    is BaseActionsAction.OpenExternalNavigator -> openExternalNavigator(action.url)
    is BaseActionsAction.Snack -> snack(action.message, action.long, action.action)
    is BaseActionsAction.Toast -> toast(action.message, action.top, action.long)
  }
}
