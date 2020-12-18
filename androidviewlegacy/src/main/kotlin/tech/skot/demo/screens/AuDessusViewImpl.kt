package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.AuDessusBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy


class AuDessusViewProxy(
    override val title:String,
    override val onTapOpenAnother:()->Unit,
    override val onTapClose:()->Unit,
    override val lines: List<AuDessusView.Line>,
):ScreenViewProxy<AuDessusViewImpl>(),AuDessusView {

    override fun inflateAndLinkChildren(
        layoutInflater: LayoutInflater,
        activity: SKActivity,
        fragment: SKFragment?
    ) = AuDessusViewImpl(activity, fragment, AuDessusBinding.inflate(layoutInflater))

    override fun linkTo(impl: AuDessusViewImpl, lifeCycleOwner: LifecycleOwner) {
        impl.onTitle(title)
        impl.onOnTapAnother(onTapOpenAnother)
        impl.onOnTapClose(onTapClose)
        impl.onLines(lines)
    }

}


class AuDessusViewImpl(activity: SKActivity, fragment: SKFragment?, binding:AuDessusBinding) : ScreenViewImpl<AuDessusBinding>(activity, fragment, binding){

    fun onTitle(title:String) {
        binding.tvTitle.text = title
    }

    fun onOnTapAnother(onTapOpenAnother: () -> Unit) {
        binding.btnOpen.setOnClick(onTapOpenAnother)
    }

    fun onOnTapClose(onTapClose: () -> Unit) {
        binding.btnClose.setOnClick(onTapClose)
    }

    fun onLines(lines: List<AuDessusView.Line>) {
        binding.tvTextLines.text = lines.joinToString(separator = "\n") {
            "Ligne n°${it.id}"
        }
    }

}