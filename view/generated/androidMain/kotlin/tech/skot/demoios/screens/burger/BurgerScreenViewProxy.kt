package tech.skot.demoios.screens.burger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.Boolean
import kotlin.Int
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKListViewProxy
import tech.skot.core.components.SKLoaderViewProxy
import tech.skot.core.components.SKScreenViewProxy
import tech.skot.core.components.SKVisiblityListener
import tech.skot.core.components.inputs.SKButtonViewProxy
import tech.skot.demoios.view.R
import tech.skot.demoios.view.databinding.BurgerScreenBinding

class BurgerScreenViewProxy(
  override val visibilityListener: SKVisiblityListener,
  override val burgerList: SKListViewProxy,
  override val loader: SKLoaderViewProxy,
  override val toBasket: SKButtonViewProxy
) : SKScreenViewProxy<BurgerScreenBinding>(), BurgerScreenVC {
  override val layoutId: Int = R.layout.burger_screen

  override fun saveState() {
    burgerList.saveState()
    loader.saveState()
    toBasket.saveState()
  }

  override fun getActivityClass() = tech.skot.demoios.android.BaseActivity::class.java
  override fun bindingOf(view: View): BurgerScreenBinding = BurgerScreenBinding.bind(view)

  override fun inflate(
    layoutInflater: LayoutInflater,
    parent: ViewGroup?,
    attachToParent: Boolean
  ): BurgerScreenBinding = BurgerScreenBinding.inflate(layoutInflater, parent, attachToParent)
  override fun bindTo(
    activity: SKActivity,
    fragment: Fragment?,
    binding: BurgerScreenBinding
  ): BurgerScreenView = BurgerScreenView(this, activity, fragment, binding).apply {
    burgerList._bindTo(activity, fragment, binding.burgerList).also { subViews.add(it) }
    loader._bindTo(activity, fragment, binding.loader.root).also { subViews.add(it) }
    toBasket._bindTo(activity, fragment, binding.toBasket).also { subViews.add(it) }
  }
}

interface BurgerScreenRAI
