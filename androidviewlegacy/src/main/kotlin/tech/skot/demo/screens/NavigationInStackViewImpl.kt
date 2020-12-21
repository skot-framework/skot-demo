package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import androidx.viewbinding.ViewBinding
import tech.skot.components.UiStateImpl
import tech.skot.core.SKLog
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.core.components.UiState
import tech.skot.demo.androidviewlegacy.databinding.NavigationInStackBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.*


class NavigationInStackProxy(
    override val stack: StackViewProxy,
    override val onTapPushScreen: () -> Unit,
    override val onTapBack: () -> Unit
) : ScreenViewProxy<NavigationInStackBinding>(), NavigationInStackView {

    override fun inflate(layoutInflater: LayoutInflater) = NavigationInStackBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: NavigationInStackBinding
    ) : NavigationInStackViewImpl{
        stack.bindTo(activity, fragment, layoutInflater, binding.stack.id)

        return NavigationInStackViewImpl(activity, fragment, binding).apply {
            onOnTapPushScreen(onTapPushScreen)
            onOnTapBack(onTapBack)

        }
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
    }

}