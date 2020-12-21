package tech.skot.demo.screens

import kotlinx.coroutines.delay
import tech.skot.core.components.Screen
import tech.skot.demo.di.viewInjector


class AScreenInAStack(val number: Int) : Screen<AScreenInAStackView>() {

    override val view = viewInjector.aScreenInAStackView("\"Au dessus\" n° $number",
        List(3) {
            AScreenInAStackView.Line(it.toLong())
        })

    init {
        launchNoCrash {
            delay(1000)
            view.lines = List(100) {
                AScreenInAStackView.Line(it.toLong())
            }
        }
    }
}