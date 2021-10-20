package tech.skot.demoios

import tech.skot.core.SKFeatureInitializer
import tech.skot.core.SKUri
import kotlin.Unit

class DemoiosInitializer(
    initialize: suspend () -> Unit,
    onDeepLink: (uri: SKUri) -> Unit,
    start: suspend () -> Unit
) : SKFeatureInitializer(initialize, onDeepLink, start)
