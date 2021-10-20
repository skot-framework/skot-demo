package tech.skot.demoios.di

import tech.skot.core.components.SKVisiblityListener
import tech.skot.demoios.screens.SplashVC
import kotlin.String

interface ViewInjector {
    fun splash(visibilityListener: SKVisiblityListener, messageInitial: String): SplashVC
}
