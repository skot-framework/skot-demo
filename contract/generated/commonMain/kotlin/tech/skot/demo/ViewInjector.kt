package tech.skot.demo

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.demo.screens.SplashView

interface ViewInjector {
  fun splash(
    message: String,
    onTapButton: Function0<Unit>,
    onTapButton2: Function0<Unit>,
    title: String
  ): SplashView
}
