package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.NavigationBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.*


class NavigationProxy(
    override val onTapOpenModale:()->Unit):ScreenViewProxy<NavigationBinding>(), NavigationView {

    override fun inflate(layoutInflater: LayoutInflater) = NavigationBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: NavigationBinding
    ) =
        NavigationViewImpl(activity, fragment, binding).apply {
            onOnTapOpenModale(onTapOpenModale)
        }


}

class NavigationViewImpl(activity: SKActivity, fragment: SKFragment?, binding:NavigationBinding): ScreenViewImpl<NavigationBinding>(activity, fragment, binding) {

    fun onOnTapOpenModale(onTapOpenModale:()->Unit) {
        binding.btnOpenModale.setOnClick(onTapOpenModale)
    }

}