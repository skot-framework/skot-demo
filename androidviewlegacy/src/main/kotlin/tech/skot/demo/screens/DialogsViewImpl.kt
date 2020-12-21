package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import tech.skot.core.components.*
import tech.skot.demo.androidviewlegacy.databinding.DialogsBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy


class DialogsViewProxy(
    override val alert: AlertViewProxy,
    override val snackBar: SnackBarViewProxy,
    override val onTapAlert: () -> Unit,
    override val onTapSnack: () -> Unit
):ScreenViewProxy<DialogsBinding>(), DialogsView {

    override fun inflate(layoutInflater: LayoutInflater) = DialogsBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: DialogsBinding
    ) :DialogsViewImpl {
        alert.bindTo(activity, fragment, layoutInflater, Unit)
        snackBar.bindTo(activity, fragment, layoutInflater, binding.root)

        return DialogsViewImpl(activity, fragment, binding).apply {
            onOnTapAlert(onTapAlert)
            onOnTapSnack(onTapSnack)
        }


    }



}

class DialogsViewImpl(activity: SKActivity, fragment: SKFragment?, binding: DialogsBinding) :ScreenViewImpl<DialogsBinding>(activity, fragment, binding) {

    fun onOnTapAlert(onTapAlert: () -> Unit) {
        binding.btnAlert.setOnClick(onTapAlert)
    }

    fun onOnTapSnack(onTapSnack: () -> Unit) {
        binding.btnSnack.setOnClick(onTapSnack)
    }

}