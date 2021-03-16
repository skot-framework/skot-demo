package tech.skot.demo.screens.presented

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.Boolean
import kotlin.Int
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewProxy
import tech.skot.demo.components.SimpleCompteurViewProxy
import tech.skot.demo.view.R
import tech.skot.demo.view.databinding.BottomPageExampleBinding

class BottomPageExampleViewProxy(
  override val counter: SimpleCompteurViewProxy
) : ScreenViewProxy<BottomPageExampleBinding>(), BottomPageExampleVC {
  override val layoutId: Int = R.layout.bottom_page_example

  override fun saveState() {
    counter.saveState()
  }

  override fun getActivityClass() = tech.skot.demo.android.BaseActivity::class.java
  override fun bindingOf(view: View): BottomPageExampleBinding = BottomPageExampleBinding.bind(view)

  override fun inflate(
    layoutInflater: LayoutInflater,
    parent: ViewGroup?,
    attachToParent: Boolean
  ): BottomPageExampleBinding = BottomPageExampleBinding.inflate(layoutInflater, parent,
      attachToParent)
  override fun bindTo(
    activity: SKActivity,
    fragment: Fragment?,
    binding: BottomPageExampleBinding,
    collectingObservers: Boolean
  ): BottomPageExampleViewImpl = BottomPageExampleViewImpl(activity, fragment, binding).apply {
    collectObservers = collectingObservers
    counter.bindTo(activity, fragment, binding.counter)
    return BottomPageExampleViewImpl(activity, fragment, binding)
  }
}

interface BottomPageExampleRAI
