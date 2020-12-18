package tech.skot.demo.screens

import tech.skot.core.components.Screen
import tech.skot.demo.di.viewInjector


class AScreenInAStack(val number: Int) : Screen<AScreenInAStackView>() {

    override val view = viewInjector.aScreenInAStackView("\"Au dessus\" n° $number",
        List(100) {
            AScreenInAStackView.Line(it.toLong())
        })
}