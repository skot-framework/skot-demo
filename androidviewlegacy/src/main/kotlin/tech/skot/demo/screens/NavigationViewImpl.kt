package tech.skot.demo.screens

import android.view.LayoutInflater
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.NavigationBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy


class NavigationProxy(
    override val onTapOpenModale: () -> Unit,
    override val onTapToPager: () -> Unit
) : ScreenViewProxy<NavigationBinding>(), NavigationView {

    override fun inflate(layoutInflater: LayoutInflater) = NavigationBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: NavigationBinding
    ): NavigationViewImpl {
        return NavigationViewImpl(activity, fragment, binding).apply {
            onOnTapOpenModale(onTapOpenModale)
            onOnTapToPager(onTapToPager)
        }
    }


}

class NavigationViewImpl(activity: SKActivity, fragment: SKFragment?, binding: NavigationBinding) :
    ScreenViewImpl<NavigationBinding>(activity, fragment, binding) {

    fun onOnTapOpenModale(onTapOpenModale: () -> Unit) {
        binding.btnOpenModale.setOnClick(onTapOpenModale)
    }

    fun onOnTapToPager(onTapToPager: () -> Unit) {
        binding.btnOpenPagerExample.setOnClick(onTapToPager)
    }

}