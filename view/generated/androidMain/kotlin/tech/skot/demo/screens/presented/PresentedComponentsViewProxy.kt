package tech.skot.demo.screens.presented

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.Boolean
import kotlin.Function0
import kotlin.Int
import kotlin.Unit
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewProxy
import tech.skot.core.components.presented.AlertViewProxy
import tech.skot.core.components.presented.BottomSheetViewProxy
import tech.skot.core.components.presented.SnackBarViewProxy
import tech.skot.demo.view.R
import tech.skot.demo.view.databinding.PresentedComponentsBinding

class PresentedComponentsViewProxy(
  override val alert: AlertViewProxy,
  override val bottomSheet: BottomSheetViewProxy,
  override val snackBar: SnackBarViewProxy,
  override val onTapAlert: Function0<Unit>,
  override val onTapBottomSheet: Function0<Unit>,
  override val onTapSnackSimple: Function0<Unit>,
  override val onTapSnackWithAction: Function0<Unit>
) : ScreenViewProxy<PresentedComponentsBinding>(), PresentedComponentsVC {
  override val layoutId: Int = R.layout.presented_components

  override fun saveState() {
    alert.saveState()
    bottomSheet.saveState()
    snackBar.saveState()
  }

  override fun getActivityClass() = tech.skot.demo.android.BaseActivity::class.java
  override fun bindingOf(view: View): PresentedComponentsBinding =
      PresentedComponentsBinding.bind(view)

  override fun inflate(
    layoutInflater: LayoutInflater,
    parent: ViewGroup?,
    attachToParent: Boolean
  ): PresentedComponentsBinding = PresentedComponentsBinding.inflate(layoutInflater, parent,
      attachToParent)
  override fun bindTo(
    activity: SKActivity,
    fragment: Fragment?,
    binding: PresentedComponentsBinding,
    collectingObservers: Boolean
  ): PresentedComponentsViewImpl = PresentedComponentsViewImpl(activity, fragment, binding).apply {
    collectObservers = collectingObservers
    alert.bindTo(activity, fragment, Unit)
    bottomSheet.bindTo(activity, fragment, Unit)
    snackBar.bindTo(activity, fragment, binding.root)
    onOnTapAlert(onTapAlert)
    onOnTapBottomSheet(onTapBottomSheet)
    onOnTapSnackSimple(onTapSnackSimple)
    onOnTapSnackWithAction(onTapSnackWithAction)
  }
}

interface PresentedComponentsRAI {
  fun onOnTapAlert(onTapAlert: Function0<Unit>)

  fun onOnTapBottomSheet(onTapBottomSheet: Function0<Unit>)

  fun onOnTapSnackSimple(onTapSnackSimple: Function0<Unit>)

  fun onOnTapSnackWithAction(onTapSnackWithAction: Function0<Unit>)
}
