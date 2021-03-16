package tech.skot.demo.di

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.LoaderVC
import tech.skot.core.components.LoaderViewProxy
import tech.skot.core.components.presented.AlertVC
import tech.skot.core.components.presented.AlertViewProxy
import tech.skot.core.components.presented.BottomSheetVC
import tech.skot.core.components.presented.BottomSheetViewProxy
import tech.skot.core.components.presented.SnackBarVC
import tech.skot.core.components.presented.SnackBarViewProxy
import tech.skot.demo.components.SimpleCompteurVC
import tech.skot.demo.components.SimpleCompteurViewProxy
import tech.skot.demo.screens.MainVC
import tech.skot.demo.screens.MainViewProxy
import tech.skot.demo.screens.SplashVC
import tech.skot.demo.screens.SplashViewProxy
import tech.skot.demo.screens.presented.BottomPageExampleVC
import tech.skot.demo.screens.presented.BottomPageExampleViewProxy
import tech.skot.demo.screens.presented.PresentedComponentsVC
import tech.skot.demo.screens.presented.PresentedComponentsViewProxy

class ViewInjectorImpl : ViewInjector {
  override fun splash(onTapGo: Function0<Unit>, messageInitial: String?): SplashVC =
      SplashViewProxy(onTapGo,messageInitial)
  override fun main(
    loader: LoaderVC,
    onTapLoader: Function0<Unit>,
    onTapNavigation: Function0<Unit>,
    onTapPresented: Function0<Unit>,
    onTapTabsLibrary: Function0<Unit>
  ): MainVC = MainViewProxy(loader as
      LoaderViewProxy,onTapLoader,onTapNavigation,onTapPresented,onTapTabsLibrary)
  override fun presentedComponents(
    alert: AlertVC,
    bottomSheet: BottomSheetVC,
    snackBar: SnackBarVC,
    onTapAlert: Function0<Unit>,
    onTapBottomSheet: Function0<Unit>,
    onTapSnackSimple: Function0<Unit>,
    onTapSnackWithAction: Function0<Unit>
  ): PresentedComponentsVC = PresentedComponentsViewProxy(alert as AlertViewProxy,bottomSheet as
      BottomSheetViewProxy,snackBar as
      SnackBarViewProxy,onTapAlert,onTapBottomSheet,onTapSnackSimple,onTapSnackWithAction)
  override fun bottomPageExample(counter: SimpleCompteurVC): BottomPageExampleVC =
      BottomPageExampleViewProxy(counter as SimpleCompteurViewProxy)
  override fun simpleCompteur(onTap: Function0<Unit>, labelInitial: String): SimpleCompteurVC =
      SimpleCompteurViewProxy(onTap,labelInitial)}
