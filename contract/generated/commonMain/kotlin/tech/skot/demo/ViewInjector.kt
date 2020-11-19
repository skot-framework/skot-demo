package tech.skot.demo

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.demo.screens.DemoBaseActionsView
import tech.skot.demo.screens.OneButtonView
import tech.skot.demo.screens.SplashView
import tech.skot.demo.screens.WithBackScreenView

interface ViewInjector {
  fun splash(message: String): SplashView

  fun demoBaseActions(
    onTapAlert: Function0<Unit>,
    onTapBack: Function0<Unit>,
    onTapConfirm: Function0<Unit>,
    onTapOpenExternalNavigator: Function0<Unit>,
    onTapShortSnack: Function0<Unit>,
    onTapSnack: Function0<Unit>
  ): DemoBaseActionsView

  fun oneButton(onTapButton: Function0<Unit>, onTapDemoBaseActions: Function0<Unit>): OneButtonView

  fun withBackScreen(onTapBack: Function0<Unit>, onTapOpen: Function0<Unit>): WithBackScreenView
}
