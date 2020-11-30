package tech.skot.demo.screens

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import tech.skot.demo.components.Stack
import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

const val NB_SECONDS_TIMER = 2

class Splash(where:Stack) : Component<SplashView>() {

    override val view = viewInjector.splash("Go !")



    init {
        CoroutineScope(Dispatchers.Default).launch {
            repeat(NB_SECONDS_TIMER+1) {
                delay(1000)
                view.message = "${(NB_SECONDS_TIMER-it)}s"
            }
            where.content = Main()
        }
    }

}