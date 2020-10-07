package tech.skot.demo

import kotlin.String
import tech.skot.demo.screens.SplashViewImpl

class ViewInjectorImpl : ViewInjector {
  override fun splash(message: String, title: String) = SplashViewImpl(message, title)
}
