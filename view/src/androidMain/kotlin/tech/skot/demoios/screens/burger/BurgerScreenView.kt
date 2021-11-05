package tech.skot.demoios.screens.burger

import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKScreenView
import tech.skot.demoios.view.databinding.BurgerScreenBinding

class BurgerScreenView(
  override val proxy: BurgerScreenViewProxy,
  activity: SKActivity,
  fragment: Fragment?,
  binding: BurgerScreenBinding
) : SKScreenView<BurgerScreenBinding>(proxy, activity, fragment, binding), BurgerScreenRAI
