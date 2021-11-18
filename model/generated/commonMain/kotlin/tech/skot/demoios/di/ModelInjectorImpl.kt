package tech.skot.demoios.di

import kotlin.coroutines.CoroutineContext
import tech.skot.demoios.screens.burger.BurgerScreenMC
import tech.skot.demoios.screens.burger.BurgerScreenModel

class ModelInjectorImpl : ModelInjector {
  override fun burgerScreen(coroutineContext: CoroutineContext): BurgerScreenMC =
      BurgerScreenModel(coroutineContext)}
