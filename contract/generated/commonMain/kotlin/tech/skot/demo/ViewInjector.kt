package tech.skot.demo

import kotlin.String
import tech.skot.demo.screens.SplashView

interface ViewInjector {
  fun splash(message: String, title: String): SplashView
}
