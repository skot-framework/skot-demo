package tech.skot.demoios.screens

import kotlinx.coroutines.delay
//import tech.skot.demoios.di.viewInjector

class Splash : SplashGen() {
    override val view: SplashVC = throw IllegalStateException("test")//viewInjector.splash(this, messageInitial = "??")

    init {
        launchNoCrash {
            (10 downTo 0).forEach {
                view.message = it.toString()
                delay(1000)
            }
        }
    }

}
