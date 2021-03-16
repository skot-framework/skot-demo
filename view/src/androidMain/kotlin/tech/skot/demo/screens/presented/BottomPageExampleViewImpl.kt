package tech.skot.demo.screens.presented

import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewImpl
import tech.skot.demo.view.databinding.BottomPageExampleBinding

class BottomPageExampleViewImpl(
  activity: SKActivity,
  fragment: Fragment?,
  binding: BottomPageExampleBinding
) : ScreenViewImpl<BottomPageExampleBinding>(activity, fragment, binding), BottomPageExampleRAI
