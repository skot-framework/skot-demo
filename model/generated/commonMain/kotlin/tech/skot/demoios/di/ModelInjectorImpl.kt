package tech.skot.demoios.di

import tech.skot.demoios.screens.burger.BurgerScreenMC
import tech.skot.demoios.screens.burger.BurgerScreenModel
import kotlin.coroutines.CoroutineContext

class ModelInjectorImpl : ModelInjector {
    override fun burgerScreen(coroutineContext: CoroutineContext): BurgerScreenMC =
        BurgerScreenModel(coroutineContext)
}
