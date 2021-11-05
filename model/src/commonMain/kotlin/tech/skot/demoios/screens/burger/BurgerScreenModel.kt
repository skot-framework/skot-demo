package tech.skot.demoios.screens.burger

import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.CoroutineScope
import tech.skot.demoios.model.Burger
import tech.skot.demoios.states.rootState
import tech.skot.model.SKData

class BurgerScreenModel(
  override val coroutineContext: CoroutineContext
) : BurgerScreenMC, CoroutineScope {
  override val burgers: SKData<List<Burger>> = rootState.catalogBM.catalog
}
