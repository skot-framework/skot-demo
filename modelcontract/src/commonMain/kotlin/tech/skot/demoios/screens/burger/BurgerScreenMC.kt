package tech.skot.demoios.screens.burger

import tech.skot.demoios.model.Burger
import tech.skot.model.SKData

interface BurgerScreenMC {
    val burgers:SKData<List<Burger>>
}