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
):ScreenViewProxy<DialogsViewImpl>(), DialogsView {

    override fun inflateAndLinkChildren(
        layoutInflater: LayoutInflater,
        activity: SKActivity,
        fragment: SKFragment?
    ): DialogsViewImpl {
        val impl = DialogsViewImpl(activity, fragment, DialogsBinding.inflate(layoutInflater))
        alert.linkTo(AlertViewImpl(activity, fragment), fragment?.viewLifecycleOwner ?: activity)
        snackBar.linkTo(SnackBarViewImpl(activity, fragment, activity.findViewById(android.R.id.content)), fragment?.viewLifecycleOwner ?: activity)
        return impl
    }

    override fun linkTo(impl: DialogsViewImpl, lifeCycleOwner: LifecycleOwner) {
        impl.onOnTapAlert(onTapAlert)
        impl.onOnTapSnack(onTapSnack)
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