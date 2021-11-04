package tech.skot.demoios.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKScreenViewProxy
import tech.skot.core.components.SKVisiblityListener
import tech.skot.core.components.inputs.SKButtonViewProxy
import tech.skot.demoios.view.R
import tech.skot.demoios.view.databinding.OnTopBinding
import kotlin.Boolean
import kotlin.Int

class OnTopViewProxy(
    override val visibilityListener: SKVisiblityListener,
    override val btnClose: SKButtonViewProxy
) : SKScreenViewProxy<OnTopBinding>(), OnTopVC {
    override val layoutId: Int = R.layout.on_top

    override fun saveState() {
        btnClose.saveState()
    }

    override fun getActivityClass() = tech.skot.demoios.android.BaseActivity::class.java
    override fun bindingOf(view: View): OnTopBinding = OnTopBinding.bind(view)

    override fun inflate(
        layoutInflater: LayoutInflater,
        parent: ViewGroup?,
        attachToParent: Boolean
    ): OnTopBinding = OnTopBinding.inflate(layoutInflater, parent, attachToParent)
    override fun bindTo(
        activity: SKActivity,
        fragment: Fragment?,
        binding: OnTopBinding,
        collectingObservers: Boolean
    ): OnTopView = OnTopView(this, activity, fragment, binding).apply {
        collectObservers = collectingObservers
        btnClose._bindTo(activity, fragment, binding.btnClose)
    }
}

interface OnTopRAI
