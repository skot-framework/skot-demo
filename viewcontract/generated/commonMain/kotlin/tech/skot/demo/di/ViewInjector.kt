package tech.skot.demo.di

import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.LoaderVC
import tech.skot.core.components.presented.AlertVC
import tech.skot.core.components.presented.BottomSheetVC
import tech.skot.core.components.presented.SnackBarVC
import tech.skot.demo.components.SimpleCompteurVC
import tech.skot.demo.screens.MainVC
import tech.skot.demo.screens.SplashVC
import tech.skot.demo.screens.presented.BottomPageExampleVC
import tech.skot.demo.screens.presented.PresentedComponentsVC

interface ViewInjector {
  fun splash(onTapGo: Function0<Unit>, messageInitial: String?): SplashVC

  fun main(
    loader: LoaderVC,
    onTapLoader: Function0<Unit>,
    onTapNavigation: Function0<Unit>,
    onTapPresented: Function0<Unit>,
    onTapTabsLibrary: Function0<Unit>
  ): MainVC

  fun presentedComponents(
    alert: AlertVC,
    bottomSheet: BottomSheetVC,
    snackBar: SnackBarVC,
    onTapAlert: Function0<Unit>,
    onTapBottomSheet: Function0<Unit>,
    onTapSnackSimple: Function0<Unit>,
    onTapSnackWithAction: Function0<Unit>
  ): PresentedComponentsVC

  fun bottomPageExample(counter: SimpleCompteurVC): BottomPageExampleVC

  fun simpleCompteur(onTap: Function0<Unit>, labelInitial: String): SimpleCompteurVC
}
