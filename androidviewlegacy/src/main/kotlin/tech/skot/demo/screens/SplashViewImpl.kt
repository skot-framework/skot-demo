package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.LifecycleOwner
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.SplashBinding
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy
import tech.skot.view.live.MutableSKLiveData


class SplashViewProxy(
    messageInitial:String
): ScreenViewProxy<SplashViewImpl>(), SplashView {

    private val messageLD = MutableSKLiveData(messageInitial)
    override var message:String by messageLD


    override fun inflateAndLinkChildren(
        layoutInflater: LayoutInflater,
        activity: SKActivity,
        fragment: SKFragment?
    ) = SplashViewImpl(activity, fragment, SplashBinding.inflate(layoutInflater))


    override fun linkTo(impl: SplashViewImpl, lifeCycleOwner: LifecycleOwner) {
        messageLD.observe(lifeCycleOwner) {
            impl.onMessage(it)
        }
    }



}

class SplashViewImpl(activity: SKActivity, fragment: SKFragment?, binding:SplashBinding) : ScreenViewImpl<SplashBinding>(activity, fragment, binding) {

    fun onMessage(message:String) {
        binding.tvMessage.text = message
    }

}