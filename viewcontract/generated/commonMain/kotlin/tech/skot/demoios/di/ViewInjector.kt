package tech.skot.demoios.di

import tech.skot.core.components.SKListVC
import tech.skot.core.components.SKLoaderVC
import tech.skot.core.components.SKVisiblityListener
import tech.skot.core.components.inputs.SKButtonVC
import tech.skot.demoios.screens.OnTopVC
import tech.skot.demoios.screens.SplashVC
import tech.skot.demoios.screens.burger.BurgerScreenVC
import tech.skot.demoios.screens.burger.burger_screen.CatalogItemVC
import kotlin.Function0
import kotlin.String
import kotlin.Unit

interface ViewInjector {
    fun splash(
        visibilityListener: SKVisiblityListener,
        onTapOpenOnTopScreen: Function0<Unit>,
        messageInitial: String
    ): SplashVC

    fun onTop(
        visibilityListener: SKVisiblityListener,
        btnBurger: SKButtonVC,
        btnClose: SKButtonVC
    ): OnTopVC

    fun burgerScreen(
        visibilityListener: SKVisiblityListener,
        burgerList: SKListVC,
        loader: SKLoaderVC,
        toBasket: SKButtonVC
    ): BurgerScreenVC

    fun catalogItem(
        imageUrl: String,
        label: String,
        onClickAdd: Function0<Unit>,
        price: String
    ): CatalogItemVC
}
