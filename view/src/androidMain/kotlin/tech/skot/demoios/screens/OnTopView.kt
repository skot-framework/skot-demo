package tech.skot.demoios.screens

import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKScreenView
import tech.skot.demoios.view.databinding.OnTopBinding
import tech.skot.view.extensions.setOnClick

class OnTopView(
  override val proxy: OnTopViewProxy,
  activity: SKActivity,
  fragment: Fragment?,
  binding: OnTopBinding
) : SKScreenView<OnTopBinding>(proxy, activity, fragment, binding), OnTopRAI
