package tech.skot.demo.screens

import androidx.fragment.app.Fragment
import kotlin.Function0
import kotlin.Unit
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewImpl
import tech.skot.demo.view.databinding.MainBinding
import tech.skot.view.extensions.setOnClick

class MainViewImpl(
  activity: SKActivity,
  fragment: Fragment?,
  binding: MainBinding
) : ScreenViewImpl<MainBinding>(activity, fragment, binding), MainRAI {
  override fun onOnTapLoader(onTapLoader: Function0<Unit>) {
    binding.btnLoader.setOnClick(onTapLoader)
  }

  override fun onOnTapNavigation(onTapNavigation: Function0<Unit>) {
    binding.btnNavigation.setOnClick(onTapNavigation)
  }

  override fun onOnTapPresented(onTapPresented: Function0<Unit>) {
    binding.btnPresented.setOnClick(onTapPresented)
  }

  override fun onOnTapTabsLibrary(onTapTabsLibrary: Function0<Unit>) {
    binding.btnTabsLibrary.setOnClick(onTapTabsLibrary)
  }

  override fun windowInsetPaddingTop() = true
}
