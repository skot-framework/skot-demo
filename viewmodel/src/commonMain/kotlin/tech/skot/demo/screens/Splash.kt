package tech.skot.demo.screens

import kotlinx.coroutines.delay
import tech.skot.core.components.Screen
import tech.skot.core.di.rootStack
import tech.skot.demo.di.viewInjector

const val NB_SECONDS_TIMER = 4

class Splash : Screen<SplashView>() {

    override val view = viewInjector.splash("Got it !")


    init {
        logD("---- Splash init")
        launch {
            repeat(NB_SECONDS_TIMER + 1) {
                delay(200)
                view.message = "${(NB_SECONDS_TIMER - it)} secondes"
            }

            rootStack.content = Main()
//            RootStack.content = Main()
        }

    }


}