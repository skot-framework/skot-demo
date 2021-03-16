package tech.skot.demo.screens

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import tech.skot.core.components.Loader
import tech.skot.core.components.RootStack
import tech.skot.demo.di.viewInjector
import tech.skot.demo.screens.presented.PresentedComponents

class Main : MainGen() {
  override val loader: Loader = Loader()

  override val view: MainVC = viewInjector.main(loader = loader.view,onTapLoader = { onTapLoader()
      },onTapNavigation = { onTapNavigation() },onTapPresented = { onTapPresented()
      },onTapTabsLibrary = { onTapTabsLibrary() })

  private fun onTapLoader() {
      launchWithLoadingAndError {
        delay(3000)
      }
  }

  private fun onTapNavigation() {
  }

  private fun onTapPresented() {
      push(PresentedComponents())
  }

  private fun onTapTabsLibrary() {
  }


}
