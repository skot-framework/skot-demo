package tech.skot.demoios

import kotlin.Any
import tech.skot.core.SKUri
import tech.skot.core.components.SKRootStack
import tech.skot.demoios.screens.Splash

fun start(any: Any) {
  SKRootStack.content = Splash()
}

fun onDeeplink(uri: SKUri) {
}
