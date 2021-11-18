package tech.skot.demoios.screens.burger

import tech.skot.core.components.SKComponent
import tech.skot.core.components.SKComponentVC
import tech.skot.core.components.SKScreen
import tech.skot.demoios.di.modelInjector

abstract class BurgerScreenGen : SKScreen<BurgerScreenVC>() {
  val model: BurgerScreenMC = modelInjector.burgerScreen(coroutineContext)

  protected abstract val burgerList: SKComponent<out SKComponentVC>

  protected abstract val toBasket: SKComponent<out SKComponentVC>

  override fun onRemove() {
    burgerList.onRemove()
    loader?.onRemove()
    toBasket.onRemove()
    super.onRemove()
  }
}
