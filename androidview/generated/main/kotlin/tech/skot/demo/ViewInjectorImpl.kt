package tech.skot.demo

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.demo.screens.OneButtonViewImpl
import tech.skot.demo.screens.SplashViewImpl
import tech.skot.demo.screens.WithBackScreenViewImpl

class ViewInjectorImpl : ViewInjector {
  override fun splash(message: String) = SplashViewImpl(message)

  override fun oneButton(onTapButton: Function0<Unit>) = OneButtonViewImpl(onTapButton)

  override fun withBackScreen(onTapBack: Function0<Unit>, onTapOpen: Function0<Unit>) =
      WithBackScreenViewImpl(onTapBack, onTapOpen)
}
