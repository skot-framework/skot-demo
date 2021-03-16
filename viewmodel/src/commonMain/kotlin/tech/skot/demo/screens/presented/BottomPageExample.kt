package tech.skot.demo.screens.presented

import tech.skot.demo.components.SimpleCompteur
import tech.skot.demo.di.viewInjector

class BottomPageExample : BottomPageExampleGen() {
  private val counter: SimpleCompteur = SimpleCompteur()

  override val view: BottomPageExampleVC = viewInjector.bottomPageExample(counter = counter.view)
}
