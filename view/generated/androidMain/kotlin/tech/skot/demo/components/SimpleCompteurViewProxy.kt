package tech.skot.demo.components

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.Boolean
import kotlin.Function0
import kotlin.Int
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.ComponentViewProxy
import tech.skot.core.components.SKActivity
import tech.skot.demo.view.R
import tech.skot.demo.view.databinding.SimpleCompteurBinding
import tech.skot.view.live.MutableSKLiveData

class SimpleCompteurViewProxy(
  override val onTap: Function0<Unit>,
  labelInitial: String
) : ComponentViewProxy<SimpleCompteurBinding>(), SimpleCompteurVC {
  private val labelLD: MutableSKLiveData<String> = MutableSKLiveData(labelInitial)

  override var label: String by labelLD

  override val layoutId: Int = R.layout.simple_compteur

  override fun saveState() {
  }

  override fun bindingOf(view: View): SimpleCompteurBinding = SimpleCompteurBinding.bind(view)

  override fun inflate(
    layoutInflater: LayoutInflater,
    parent: ViewGroup?,
    attachToParent: Boolean
  ): SimpleCompteurBinding = SimpleCompteurBinding.inflate(layoutInflater, parent, attachToParent)
  override fun bindTo(
    activity: SKActivity,
    fragment: Fragment?,
    binding: SimpleCompteurBinding,
    collectingObservers: Boolean
  ): SimpleCompteurViewImpl = SimpleCompteurViewImpl(activity, fragment, binding).apply {
    collectObservers = collectingObservers
    onOnTap(onTap)
    labelLD.observe {
      onLabel(it)
    }
  }
}

interface SimpleCompteurRAI {
  fun onOnTap(onTap: Function0<Unit>)

  fun onLabel(label: String)
}
