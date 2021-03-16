package tech.skot.demo.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.Boolean
import kotlin.Function0
import kotlin.Int
import kotlin.Unit
import tech.skot.core.components.LoaderViewProxy
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewProxy
import tech.skot.demo.view.R
import tech.skot.demo.view.databinding.MainBinding

class MainViewProxy(
  override val loader: LoaderViewProxy,
  override val onTapLoader: Function0<Unit>,
  override val onTapNavigation: Function0<Unit>,
  override val onTapPresented: Function0<Unit>,
  override val onTapTabsLibrary: Function0<Unit>
) : ScreenViewProxy<MainBinding>(), MainVC {
  override val layoutId: Int = R.layout.main

  override fun saveState() {
    loader.saveState()
  }

  override fun getActivityClass() = tech.skot.demo.android.BaseActivity::class.java
  override fun bindingOf(view: View): MainBinding = MainBinding.bind(view)

  override fun inflate(
    layoutInflater: LayoutInflater,
    parent: ViewGroup?,
    attachToParent: Boolean
  ): MainBinding = MainBinding.inflate(layoutInflater, parent, attachToParent)
  override fun bindTo(
    activity: SKActivity,
    fragment: Fragment?,
    binding: MainBinding,
    collectingObservers: Boolean
  ): MainViewImpl = MainViewImpl(activity, fragment, binding).apply {
    collectObservers = collectingObservers
    loader.bindTo(activity, fragment, binding.loader.root)
    onOnTapLoader(onTapLoader)
    onOnTapNavigation(onTapNavigation)
    onOnTapPresented(onTapPresented)
    onOnTapTabsLibrary(onTapTabsLibrary)
  }
}

interface MainRAI {
  fun onOnTapLoader(onTapLoader: Function0<Unit>)

  fun onOnTapNavigation(onTapNavigation: Function0<Unit>)

  fun onOnTapPresented(onTapPresented: Function0<Unit>)

  fun onOnTapTabsLibrary(onTapTabsLibrary: Function0<Unit>)
}
