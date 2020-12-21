package tech.skot.demo.screens

import android.view.LayoutInflater
import tech.skot.components.UiStateImpl
import tech.skot.components.ViewImplWithState
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.AScreenInAStackBinding
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy
import tech.skot.view.live.MutableSKLiveData

class AScreenInAStackProxy(
    override val title: String,
    linesInitail: List<AScreenInAStackView.Line>
) : ScreenViewProxy<AScreenInAStackBinding>(), AScreenInAStackView {


    private val linesLD = MutableSKLiveData(linesInitail)
    override var lines: List<AScreenInAStackView.Line>
        get() = linesLD.value
        set(newVal) {
            linesLD.postValue(newVal)
        }

    override val scrollState = UiStateImpl<AScreenInAStackView.State>()

    override fun inflate(layoutInflater: LayoutInflater) =
        AScreenInAStackBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: AScreenInAStackBinding
    ) =
        AScreenInAStackViewImpl(activity, fragment, binding).apply {
            onTitle(title)
            linesLD.observe() {
                onLines(it)
            }

            scrollState.bindTo(this)

        }


}


class AScreenInAStackViewImpl(
    activity: SKActivity,
    fragment: SKFragment?,
    binding: AScreenInAStackBinding
) : ScreenViewImpl<AScreenInAStackBinding>(activity, fragment, binding),
    ViewImplWithState<AScreenInAStackView.State> {

    override fun saveState() =
        AScreenInAStackView.State(scroll = binding.sv.scrollY)

    override fun restoreState(state: AScreenInAStackView.State) {
        binding.sv.post {
            binding.sv.scrollY = state.scroll
        }
    }

    fun onTitle(title: String) {
        binding.tvTitle.text = title
    }


    fun onLines(lines: List<AScreenInAStackView.Line>) {
        binding.tvTextLines.text = lines.joinToString(separator = "\n") {
            "Ligne n°${it.id}"
        }
    }

}