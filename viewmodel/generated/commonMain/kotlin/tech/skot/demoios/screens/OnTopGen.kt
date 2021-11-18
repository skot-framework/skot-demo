package tech.skot.demoios.screens

import tech.skot.core.components.SKComponent
import tech.skot.core.components.SKComponentVC
import tech.skot.core.components.SKScreen
import tech.skot.demoios.di.modelInjector

abstract class OnTopGen : SKScreen<OnTopVC>() {
  protected abstract val btnBurger: SKComponent<out SKComponentVC>

  protected abstract val btnClose: SKComponent<out SKComponentVC>

  override fun onRemove() {
    btnBurger.onRemove()
    btnClose.onRemove()
    super.onRemove()
  }
}
