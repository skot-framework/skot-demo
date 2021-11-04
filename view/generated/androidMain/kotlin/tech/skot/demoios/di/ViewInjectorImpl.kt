package tech.skot.demoios.di

import tech.skot.core.components.SKVisiblityListener
import tech.skot.core.components.inputs.SKButtonVC
import tech.skot.core.components.inputs.SKButtonViewProxy
import tech.skot.demoios.screens.OnTopVC
import tech.skot.demoios.screens.OnTopViewProxy
import tech.skot.demoios.screens.SplashVC
import tech.skot.demoios.screens.SplashViewProxy
import kotlin.Function0
import kotlin.String
import kotlin.Unit

class ViewInjectorImpl : ViewInjector {
    override fun splash(
        visibilityListener: SKVisiblityListener,
        onTapOpenOnTopScreen: Function0<Unit>,
        messageInitial: String
    ): SplashVC = SplashViewProxy(visibilityListener, onTapOpenOnTopScreen, messageInitial)
    override fun onTop(visibilityListener: SKVisiblityListener, btnClose: SKButtonVC): OnTopVC =
        OnTopViewProxy(visibilityListener, btnClose as SKButtonViewProxy)
}
