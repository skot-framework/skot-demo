package tech.skot.demoios.screens

import tech.skot.core.components.SKRootStack
import tech.skot.core.components.inputs.SKButton
import tech.skot.demoios.di.viewInjector
import tech.skot.demoios.screens.burger.BurgerScreen

class OnTop : OnTopGen() {
    override val btnClose: SKButton = SKButton(label = "Close me!") {
        finish()
    }

    override val btnBurger: SKButton = SKButton(label = "to Burger") {
        SKRootStack.content = BurgerScreen()
    }

    override val view: OnTopVC = viewInjector.onTop(
        this, btnClose = btnClose.view,
        btnBurger = btnBurger.view
    )
}
