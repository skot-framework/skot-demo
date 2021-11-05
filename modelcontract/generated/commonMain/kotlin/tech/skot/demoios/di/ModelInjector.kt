package tech.skot.demoios.di

import tech.skot.demoios.screens.burger.BurgerScreenMC
import kotlin.coroutines.CoroutineContext

interface ModelInjector {
    fun burgerScreen(coroutineContext: CoroutineContext): BurgerScreenMC
}
