package tech.skot.demoios.screens.burger

import tech.skot.core.SKLog
import tech.skot.core.components.SKList
import tech.skot.core.components.SKLoader
import tech.skot.core.components.inputs.SKButton
import tech.skot.demoios.di.viewInjector
import tech.skot.demoios.screens.burger.burger_screen.CatalogItem

class BurgerScreen : BurgerScreenGen() {
    override val burgerList: SKList = SKList()

    override val loader = SKLoader()

    override val toBasket: SKButton = SKButton(label = "Open Basket")

    override val view: BurgerScreenVC = viewInjector.burgerScreen(
        this,
        burgerList = burgerList.view,
        toBasket = toBasket.view,
        loader = loader.view
    )

    init {
        model.burgers.onData {
            burgerList.items = it.map {
                CatalogItem(it, {})
            }
        }
    }

}
