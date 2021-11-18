package tech.skot.demoios.di

import kotlin.coroutines.CoroutineContext
import tech.skot.demoios.screens.burger.BurgerScreenMC

interface ModelInjector {
  fun burgerScreen(coroutineContext: CoroutineContext): BurgerScreenMC
}
