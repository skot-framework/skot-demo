package tech.skot.demo.screens

import tech.skot.demo.viewInjector

class OneButton : OneButtonGen() {
  override val view: OneButtonView = viewInjector.oneButton(
    onTapButton = { onTop = WithBackScreen() },
    onTapDemoBaseActions = { onTop = DemoBaseActions() }
  )



}
