package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import tech.skot.core.SKLog
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.SplashBinding
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy
import tech.skot.view.live.MutableSKLiveData


class SplashViewProxy(
    messageInitial:String
): ScreenViewProxy<SplashBinding>(), SplashView {

    private val messageLD = MutableSKLiveData(messageInitial)
    override var message:String by messageLD

    override fun inflate(layoutInflater: LayoutInflater) = SplashBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: SplashBinding
    ) =
        SplashViewImpl(activity, fragment, binding).apply {
            messageLD.observe {
                onMessage(it)
            }
        }




}

class SplashViewImpl(activity: SKActivity, fragment: SKFragment?, binding:SplashBinding) : ScreenViewImpl<SplashBinding>(activity, fragment, binding) {

    override fun windowInsetPaddingTop() = true

    fun onMessage(message:String) {
        binding.tvMessage.text = message
    }

}