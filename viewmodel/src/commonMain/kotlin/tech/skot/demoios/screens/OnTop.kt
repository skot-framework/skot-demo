package tech.skot.demoios.screens

import tech.skot.core.components.inputs.SKButton
import tech.skot.demoios.di.viewInjector

class OnTop : OnTopGen() {
  override val btnClose: SKButton = SKButton(label = "Close me!") {
    finish()
  }


  override val view: OnTopVC = viewInjector.onTop(this, btnClose = btnClose.view)
}
