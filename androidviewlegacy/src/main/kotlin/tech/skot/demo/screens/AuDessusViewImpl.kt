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
):ScreenViewProxy<AuDessusBinding>(),AuDessusView {

    override fun inflate(layoutInflater: LayoutInflater) = AuDessusBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: AuDessusBinding
    ) {
        AuDessusViewImpl(activity, fragment, binding).apply {
            onTitle(title)
            onOnTapAnother(onTapOpenAnother)
            onOnTapClose(onTapClose)
            onLines(lines)
        }
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