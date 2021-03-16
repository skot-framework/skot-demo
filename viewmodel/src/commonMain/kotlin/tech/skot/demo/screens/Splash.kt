package tech.skot.demo.screens

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import tech.skot.core.SKLog
import tech.skot.core.components.RootStack
import tech.skot.demo.di.strings
import tech.skot.demo.di.viewInjector

class Splash : SplashGen() {
  override val view: SplashVC = viewInjector.splash(onTapGo = { onTapGo() },messageInitial = null)

  private fun onTapGo() {
    toMain()
  }

  init {
      launch {
        (0..10).reversed().forEach {
          view.message = strings.splash_message.format(it)
          delay(1000)
        }
        toMain()
      }
  }

  private fun toMain() {
    RootStack.screens = listOf(Main())
  }
}
