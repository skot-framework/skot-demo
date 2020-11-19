package tech.skot.demo

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.demo.screens.DemoBaseActionsViewImpl
import tech.skot.demo.screens.OneButtonViewImpl
import tech.skot.demo.screens.SplashViewImpl
import tech.skot.demo.screens.WithBackScreenViewImpl

class ViewInjectorImpl : ViewInjector {
  override fun splash(message: String) = SplashViewImpl(message)

  override fun demoBaseActions(
    onTapAlert: Function0<Unit>,
    onTapBack: Function0<Unit>,
    onTapConfirm: Function0<Unit>,
    onTapOpenExternalNavigator: Function0<Unit>,
    onTapShortSnack: Function0<Unit>,
    onTapSnack: Function0<Unit>
  ) = DemoBaseActionsViewImpl(onTapAlert, onTapBack, onTapConfirm, onTapOpenExternalNavigator,
      onTapShortSnack, onTapSnack)

  override fun oneButton(onTapButton: Function0<Unit>, onTapDemoBaseActions: Function0<Unit>) =
      OneButtonViewImpl(onTapButton, onTapDemoBaseActions)

  override fun withBackScreen(onTapBack: Function0<Unit>, onTapOpen: Function0<Unit>) =
      WithBackScreenViewImpl(onTapBack, onTapOpen)
}
