package tech.skot.demoios.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKScreenViewProxy
import tech.skot.core.components.SKVisiblityListener
import tech.skot.demoios.view.R
import tech.skot.demoios.view.databinding.SplashBinding
import tech.skot.view.live.MutableSKLiveData
import kotlin.Boolean
import kotlin.Function0
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SplashViewProxy(
    override val visibilityListener: SKVisiblityListener,
    override val onTapOpenOnTopScreen: Function0<Unit>,
    messageInitial: String
) : SKScreenViewProxy<SplashBinding>(), SplashVC {
    private val messageLD: MutableSKLiveData<String> = MutableSKLiveData(messageInitial)

    override var message: String by messageLD

    override val layoutId: Int = R.layout.splash

    override fun saveState() {
    }

    override fun getActivityClass() = tech.skot.demoios.android.BaseActivity::class.java
    override fun bindingOf(view: View): SplashBinding = SplashBinding.bind(view)

    override fun inflate(
        layoutInflater: LayoutInflater,
        parent: ViewGroup?,
        attachToParent: Boolean
    ): SplashBinding = SplashBinding.inflate(layoutInflater, parent, attachToParent)
    override fun bindTo(
        activity: SKActivity,
        fragment: Fragment?,
        binding: SplashBinding,
        collectingObservers: Boolean
    ): SplashView = SplashView(this, activity, fragment, binding).apply {
        collectObservers = collectingObservers
        onOnTapOpenOnTopScreen(onTapOpenOnTopScreen)
        messageLD.observe {
            onMessage(it)
        }
    }
}

interface SplashRAI {
    fun onOnTapOpenOnTopScreen(onTapOpenOnTopScreen: Function0<Unit>)

    fun onMessage(message: String)
}
