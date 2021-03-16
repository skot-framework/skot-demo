package tech.skot.demo

import tech.skot.core.components.RootStack
import tech.skot.demo.screens.Splash

fun start() {
  RootStack.screens = listOf(Splash())
}
