package tech.skot.demo.screens

import android.view.LayoutInflater
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.core.components.presented.AlertViewProxy
import tech.skot.core.components.presented.BottomSheetViewProxy
import tech.skot.core.components.presented.SnackBarViewProxy
import tech.skot.demo.androidviewlegacy.databinding.DialogsBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy


class DialogsViewProxy(
    override val alert: AlertViewProxy,
    override val snackBar: SnackBarViewProxy,
    override val bottomSheet: BottomSheetViewProxy,
    override val onTapAlert: () -> Unit,
    override val onTapAlertCustomButton: () -> Unit,
    override val onTapAlertTwoButtons: () -> Unit,
    override val onTapSnack: () -> Unit,
    override val onTapShowBottomSheet: () -> Unit,
    override val onTapShowGlobalBottomSheet: () -> Unit,
) : ScreenViewProxy<DialogsBinding>(), DialogsView {

    override fun inflate(layoutInflater: LayoutInflater) = DialogsBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: DialogsBinding
    ): DialogsViewImpl {
        alert.bindTo(activity, fragment, layoutInflater, Unit)
        snackBar.bindTo(activity, fragment, layoutInflater, binding.root)
        bottomSheet.bindTo(activity, fragment, layoutInflater, Unit)

        return DialogsViewImpl(activity, fragment, binding).apply {
            onOnTapAlert(onTapAlert)
            onOnTapAlertCustomButton(onTapAlertCustomButton)
            onOnTapAlertTwoButtons(onTapAlertTwoButtons)
            onOnTapSnack(onTapSnack)
            onOnTapShowBottomSheet(onTapShowBottomSheet)
            onOnTapShowGlobalBottomSheet(onTapShowGlobalBottomSheet)
        }


    }


}

class DialogsViewImpl(activity: SKActivity, fragment: SKFragment?, binding: DialogsBinding) :
    ScreenViewImpl<DialogsBinding>(activity, fragment, binding) {

    override fun windowInsetPaddingTop() = true

    fun onOnTapAlert(onTapAlert: () -> Unit) {
        binding.btnAlert.setOnClick(onTapAlert)
    }
    fun onOnTapAlertCustomButton(onTapAlertCustomButton: ()->Unit) {
        binding.btnAlertCustom.setOnClick(onTapAlertCustomButton)
    }
    fun onOnTapAlertTwoButtons(onTapAlertTwoButtons: ()->Unit) {
        binding.btnAlertTwoButtons.setOnClick(onTapAlertTwoButtons)
    }
    fun onOnTapSnack(onTapSnack: () -> Unit) {
        binding.btnSnack.setOnClick(onTapSnack)
    }

    fun onOnTapShowBottomSheet(onTapShowBottomSheet: () -> Unit) {
        binding.btnShowBottomSheet.setOnClick(onTapShowBottomSheet)
    }

    fun onOnTapShowGlobalBottomSheet(onTapShowGlobalBottomSheet: () -> Unit) {
        binding.btnShowGlobalBottomSheet.setOnClick(onTapShowGlobalBottomSheet)
    }

}