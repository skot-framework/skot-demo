package tech.skot.demo.screens

import tech.skot.demo.viewInjector
import kotlinx.coroutines.delay
import tech.skot.core.SKLog

class Splash : SplashGen() {
  override val view: SplashView = viewInjector.splash(
    message = "",
  )


  init {
    view.message = "coucou toi"
    launchNoCrash {
      var compteur = 4
      while(compteur > 0) {
        view.message = "${compteur}s"
        delay(1000)
        compteur--
      }
    OneButton().setAsRoot()
    }

  }
}
