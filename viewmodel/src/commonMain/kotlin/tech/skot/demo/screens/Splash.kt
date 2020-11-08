package tech.skot.demo.screens

import tech.skot.demo.viewInjector
import kotlinx.coroutines.delay
import tech.skot.core.SKLog

class Splash : SplashGen() {
  override val view: SplashView = viewInjector.splash(
    message = "coucou",
    title = "Titre",
    onTapButton = { onTap() },
    onTapButton2 = { onTap2() }
  )

  private fun onTap() {
//    view.message = "Vous avez tapé"
    view.displayAlert(
      title = "Titre alerte",
      message = "Message alerte"
    )
  }


  private fun onTap2() {
//    view.message = "Vous avez tapé"
    view.displayAlert(
      title = "Titre alerte 2"
    )
  }

  init {
    view.message = "coucou toi"
    launchNoCrash {
      var compteur = 0
      while(true) {
        delay(1000)
        compteur++
        SKLog.d("Will change message to $compteur")
        view.message = "${compteur}s"
      }
    }

  }
}
