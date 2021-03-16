package tech.skot.demo.screens.presented

import androidx.fragment.app.Fragment
import kotlin.Function0
import kotlin.Unit
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewImpl
import tech.skot.demo.view.databinding.PresentedComponentsBinding
import tech.skot.view.extensions.setOnClick

class PresentedComponentsViewImpl(
  activity: SKActivity,
  fragment: Fragment?,
  binding: PresentedComponentsBinding
) : ScreenViewImpl<PresentedComponentsBinding>(activity, fragment, binding), PresentedComponentsRAI
    {
  override fun onOnTapAlert(onTapAlert: Function0<Unit>) {
    binding.btnAlert.setOnClick(onTapAlert)
  }

  override fun onOnTapBottomSheet(onTapBottomSheet: Function0<Unit>) {
    binding.btnBottomSheet.setOnClick(onTapBottomSheet)
  }

  override fun onOnTapSnackSimple(onTapSnackSimple: Function0<Unit>) {
    binding.btnSimpleSnack.setOnClick(onTapSnackSimple)
  }

  override fun onOnTapSnackWithAction(onTapSnackWithAction: Function0<Unit>) {
    binding.btnSnackWithAction.setOnClick(onTapSnackWithAction)
  }
}
