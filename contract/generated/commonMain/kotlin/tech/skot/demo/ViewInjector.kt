package tech.skot.demo

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.demo.screens.OneButtonView
import tech.skot.demo.screens.SplashView
import tech.skot.demo.screens.WithBackScreenView

interface ViewInjector {
  fun splash(message: String): SplashView

  fun oneButton(onTapButton: Function0<Unit>): OneButtonView

  fun withBackScreen(onTapBack: Function0<Unit>, onTapOpen: Function0<Unit>): WithBackScreenView
}
