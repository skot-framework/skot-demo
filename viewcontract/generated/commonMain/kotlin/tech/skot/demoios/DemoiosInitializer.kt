package tech.skot.demoios

import kotlin.Unit
import tech.skot.core.SKFeatureInitializer
import tech.skot.core.SKUri

class DemoiosInitializer(
  initialize: suspend () -> Unit,
  onDeepLink: (uri: SKUri) -> Unit,
  start: suspend () -> Unit
) : SKFeatureInitializer(initialize, onDeepLink, start)
