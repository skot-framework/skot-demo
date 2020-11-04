package tech.skot.demo.screens

import tech.skot.demo.viewInjector
import kotlinx.coroutines.delay

class Splash : SplashGen() {
  override val view: SplashView = viewInjector.splash(
    message = "coucou",
    title = "Titre"
  )

  init {
    launchNoCrash {
      var compteur = 0
      while(true) {
        delay(1000)
        compteur++
        view.message = "${compteur}s"
      }
    }

  }
}
