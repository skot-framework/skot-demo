package tech.skot.demoios.screens.burger

import tech.skot.core.components.SKListVC
import tech.skot.core.components.SKLoaderVC
import tech.skot.core.components.SKScreenVC
import tech.skot.core.components.SKUses
import tech.skot.core.components.inputs.SKButtonVC
import tech.skot.demoios.screens.burger.burger_screen.CatalogItemVC

@SKUses([CatalogItemVC::class])
interface BurgerScreenVC: SKScreenVC {
    val loader:SKLoaderVC
    val burgerList:SKListVC
    val toBasket:SKButtonVC
}