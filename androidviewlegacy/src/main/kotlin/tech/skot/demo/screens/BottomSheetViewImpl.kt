package tech.skot.demo.screens

import android.view.LayoutInflater
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.BottomSheetExampleBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy


class BottomSheetExampleViewProxy(
    override val onTapDismiss: () -> Unit
) : ScreenViewProxy<BottomSheetExampleBinding>(), BottomSheetExampleView {

    override fun inflate(layoutInflater: LayoutInflater) =
        BottomSheetExampleBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: BottomSheetExampleBinding
    ) = BottomSheetViewImpl(activity, fragment, binding).apply {
        onOnTapDismiss(onTapDismiss)
    }
}

class BottomSheetViewImpl(
    activity: SKActivity,
    fragment: SKFragment?,
    binding: BottomSheetExampleBinding
) : ScreenViewImpl<BottomSheetExampleBinding>(activity, fragment, binding) {

    fun onOnTapDismiss(onTapDismiss: () -> Unit) {
        binding.btnDismiss.setOnClick(onTapDismiss)
    }
}