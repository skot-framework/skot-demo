package tech.skot.demo.screens

import tech.skot.demo.viewInjector

class Splash : SplashGen() {
  override val view: SplashView = viewInjector.splash(
    message = "coucou",
    title = "Titre"
  )
}
