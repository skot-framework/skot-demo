package tech.skot.demo.components

import androidx.fragment.app.Fragment
import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.ComponentViewImpl
import tech.skot.core.components.SKActivity
import tech.skot.demo.view.databinding.SimpleCompteurBinding
import tech.skot.view.extensions.setOnClick

class SimpleCompteurViewImpl(
  activity: SKActivity,
  fragment: Fragment?,
  binding: SimpleCompteurBinding
) : ComponentViewImpl<SimpleCompteurBinding>(activity, fragment, binding), SimpleCompteurRAI {
  override fun onOnTap(onTap: Function0<Unit>) {
    binding.root.setOnClick(onTap)
  }

  override fun onLabel(label: String) {
    binding.root.text = label
  }
}
