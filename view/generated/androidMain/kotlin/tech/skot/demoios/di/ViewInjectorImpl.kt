package tech.skot.demoios.di

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.SKListVC
import tech.skot.core.components.SKListViewProxy
import tech.skot.core.components.SKLoaderVC
import tech.skot.core.components.SKLoaderViewProxy
import tech.skot.core.components.SKVisiblityListener
import tech.skot.core.components.inputs.SKButtonVC
import tech.skot.core.components.inputs.SKButtonViewProxy
import tech.skot.demoios.screens.OnTopVC
import tech.skot.demoios.screens.OnTopViewProxy
import tech.skot.demoios.screens.SplashVC
import tech.skot.demoios.screens.SplashViewProxy
import tech.skot.demoios.screens.burger.BurgerScreenVC
import tech.skot.demoios.screens.burger.BurgerScreenViewProxy
import tech.skot.demoios.screens.burger.burger_screen.CatalogItemVC
import tech.skot.demoios.screens.burger.burger_screen.CatalogItemViewProxy

class ViewInjectorImpl : ViewInjector {
  override fun splash(
    visibilityListener: SKVisiblityListener,
    onTapOpenOnTopScreen: Function0<Unit>,
    messageInitial: String
  ): SplashVC = SplashViewProxy(visibilityListener, onTapOpenOnTopScreen,messageInitial)
  override fun onTop(
    visibilityListener: SKVisiblityListener,
    btnBurger: SKButtonVC,
    btnClose: SKButtonVC
  ): OnTopVC = OnTopViewProxy(visibilityListener, btnBurger as SKButtonViewProxy,btnClose as
      SKButtonViewProxy)
  override fun burgerScreen(
    visibilityListener: SKVisiblityListener,
    burgerList: SKListVC,
    loader: SKLoaderVC,
    toBasket: SKButtonVC
  ): BurgerScreenVC = BurgerScreenViewProxy(visibilityListener, burgerList as SKListViewProxy,loader
      as SKLoaderViewProxy,toBasket as SKButtonViewProxy)
  override fun catalogItem(
    imageUrl: String,
    label: String,
    onClickAdd: Function0<Unit>,
    price: String
  ): CatalogItemVC = CatalogItemViewProxy( imageUrl,label,onClickAdd,price)}
