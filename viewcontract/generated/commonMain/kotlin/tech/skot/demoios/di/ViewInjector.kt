package tech.skot.demoios.di

import tech.skot.core.components.SKVisiblityListener
import tech.skot.core.components.inputs.SKButtonVC
import tech.skot.demoios.screens.OnTopVC
import tech.skot.demoios.screens.SplashVC
import kotlin.Function0
import kotlin.String
import kotlin.Unit

interface ViewInjector {
    fun splash(
        visibilityListener: SKVisiblityListener,
        onTapOpenOnTopScreen: Function0<Unit>,
        messageInitial: String
    ): SplashVC

    fun onTop(visibilityListener: SKVisiblityListener, btnClose: SKButtonVC): OnTopVC
}
