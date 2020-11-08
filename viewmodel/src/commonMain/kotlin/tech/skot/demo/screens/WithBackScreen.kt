package tech.skot.demo.screens

import tech.skot.demo.viewInjector

class WithBackScreen : WithBackScreenGen() {
  private val onBack = { finish() }

  override val view: WithBackScreenView = viewInjector.withBackScreen(
    onTapBack = onBack,
    onTapOpen = {
      onTop = WithBackScreen()
    }
  )

  init {
    view.onBack = onBack
  }
}
