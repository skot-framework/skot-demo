package tech.skot.demoios.screens

import kotlinx.coroutines.delay
import tech.skot.core.SKLog
import tech.skot.demoios.di.viewInjector

class Splash : SplashGen() {

    init {
        SKLog.d(" ----- init Splash")

    }

    override val view: SplashVC =
        viewInjector.splash(this, messageInitial = "??", onTapOpenOnTopScreen = {
            push(OnTop())
        })

    init {
        launchNoCrash {
            (10 downTo 0).forEach {
                view.message = "message " + it.toString()
                SKLog.d("---------- message: $it")
                delay(1000)
            }
        }
    }

}
