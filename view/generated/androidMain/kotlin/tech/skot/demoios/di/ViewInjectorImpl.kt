package tech.skot.demoios.di

import tech.skot.core.components.SKVisiblityListener
import tech.skot.demoios.screens.SplashVC
import tech.skot.demoios.screens.SplashViewProxy
import kotlin.String

class ViewInjectorImpl : ViewInjector {
    override fun splash(visibilityListener: SKVisiblityListener, messageInitial: String): SplashVC =
        SplashViewProxy(visibilityListener, messageInitial)
}
