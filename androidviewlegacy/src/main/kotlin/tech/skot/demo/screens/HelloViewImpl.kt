package tech.skot.demo.screens

import android.view.LayoutInflater
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent
import tech.skot.core.SKLog
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKFragment
import tech.skot.demo.androidviewlegacy.databinding.HelloBinding
import tech.skot.view.extensions.setOnClick
import tech.skot.view.legacy.ScreenViewImpl
import tech.skot.view.legacy.ScreenViewProxy
import tech.skot.view.live.MutableSKLiveData


class HelloViewProxy(
    override val onTapBack:()->Unit,
    override val onOpenAnotherHello: () -> Unit
): ScreenViewProxy<HelloViewImpl>(), HelloView {


    val onBackPressedLD = MutableSKLiveData<()->Unit>(onTapBack)

    override fun inflateAndLinkChildren(
        layoutInflater: LayoutInflater,
        activity: SKActivity,
        fragment: SKFragment?
    ) = HelloViewImpl(activity, fragment, HelloBinding.inflate(layoutInflater))


    override fun linkTo(impl: HelloViewImpl, lifeCycleOwner: LifecycleOwner) {
        impl.onOnTapBack(onTapBack)
        impl.onOnOpenAnotherHello(onOpenAnotherHello)

        lifeCycleOwner.lifecycle.addObserver(object : LifecycleObserver {
            @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
            fun onResume() {
                impl.setBack(onTapBack)
            }
        })
        onBackPressedLD.observe(lifeCycleOwner) {
            SKLog.d("------ $key onBackPressedLD !!!")
        }
    }




}

class HelloViewImpl(activity: SKActivity, fragment: SKFragment?, binding:HelloBinding) : ScreenViewImpl<HelloBinding>(activity, fragment, binding) {

    fun onOnTapBack(onTapBack:()->Unit) {
        binding.btnBack.setOnClick(onTapBack)
    }

    fun onOnOpenAnotherHello(onOpenAnotherHello: () -> Unit) {
        binding.btnOpenAnother.setOnClick(onOpenAnotherHello)
    }

    fun setBack(onBack:(()->Unit)?) {
        activity.onBackPressedAction = onBack
    }
}