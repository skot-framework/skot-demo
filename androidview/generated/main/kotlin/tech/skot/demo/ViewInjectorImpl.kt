package tech.skot.demo

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.demo.screens.SplashViewImpl

class ViewInjectorImpl : ViewInjector {
  override fun splash(
    message: String,
    onTapButton: Function0<Unit>,
    title: String
  ) = SplashViewImpl(message, onTapButton, title)
}
