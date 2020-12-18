package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.NavigationInStackBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.*


class NavigationInStackProxy(
    override val stack: StackViewProxy,
    override val onTapPushScreen: () -> Unit,
    override val onTapBack: () -> Unit
) : ScreenViewProxy<NavigationInStackViewImpl>(), NavigationInStackView {

    override fun inflateAndLinkChildren(
        layoutInflater: LayoutInflater,
        activity: SKActivity,
        fragment: SKFragment?
    ) = NavigationInStackViewImpl(activity, fragment, NavigationInStackBinding.inflate(layoutInflater)).apply {
        stack.linkTo(StackViewImpl(activity, fragment, binding.stack.id), fragment?.viewLifecycleOwner ?: activity)
    }


    override fun linkTo(impl: NavigationInStackViewImpl, lifeCycleOwner: LifecycleOwner) {
        impl.onOnTapPushScreen(onTapPushScreen)
        impl.onOnTapBack(onTapBack)
    }
}

class NavigationInStackViewImpl(
    activity: SKActivity,
    fragment: SKFragment?,
    binding: NavigationInStackBinding
) : ScreenViewImpl<NavigationInStackBinding>(activity, fragment, binding) {

    fun onOnTapPushScreen(onTapPushScreen: () -> Unit) {
        binding.btnPushScreen.setOnClick(onTapPushScreen)
    }

    fun onOnTapBack(onTapBack: () -> Unit) {
        binding.btnBack.setOnClick(onTapBack)
        activity.onBackPressedAction = onTapBack
    }

}