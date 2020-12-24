package tech.skot.demo.screens

import android.view.LayoutInflater
import tech.skot.core.components.PagerViewProxy
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.PagerExampleBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy
import tech.skot.view.live.MutableSKLiveData

class PagerExampleViewProxy(
    override val pager:PagerViewProxy,
    override val onTapToIndex2: () -> Unit
) : ScreenViewProxy<PagerExampleBinding>(), PagerExampleView {


    private val textSelectedPageLD = MutableSKLiveData<String?>(null)
    override var textSelectedPage by textSelectedPageLD

    override fun inflate(layoutInflater: LayoutInflater) = PagerExampleBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: PagerExampleBinding
    ): ScreenViewImpl<PagerExampleBinding> {
        pager.bindTo(activity, fragment, layoutInflater, binding.pager)
        return PagerExampleViewImpl(activity, fragment, binding).apply {
            onOnTapToIndex2(onTapToIndex2)
            textSelectedPageLD.observe {
                onTextSelectedPage(it)
            }
        }
    }

}

class PagerExampleViewImpl(activity: SKActivity, fragment: SKFragment?, binding: PagerExampleBinding) : ScreenViewImpl<PagerExampleBinding>(activity, fragment, binding) {

    override fun windowInsetPaddingTop() = true

    fun onTextSelectedPage(textSelectedPage:String?) {
        binding.tvSelectedPage.text = textSelectedPage
    }

    fun onOnTapToIndex2(onTapToIndex2:()->Unit) {
        binding.btnToPage2.setOnClick(onTapToIndex2)
    }
}