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
): ScreenViewProxy<HelloBinding>(), HelloView {


//    val onBackPressedLD = MutableSKLiveData<()->Unit>(onTapBack)

    override fun inflate(layoutInflater: LayoutInflater) = HelloBinding.inflate(layoutInflater)

    override fun bindTo(
        activity: SKActivity,
        fragment: SKFragment?,
        layoutInflater: LayoutInflater,
        binding: HelloBinding
    ) =
        HelloViewImpl(activity, fragment, binding).apply {
            onOnTapBack(onTapBack)
            onOnOpenAnotherHello(onOpenAnotherHello)
        }






}

class HelloViewImpl(activity: SKActivity, fragment: SKFragment?, binding:HelloBinding) : ScreenViewImpl<HelloBinding>(activity, fragment, binding) {

    fun onOnTapBack(onTapBack:()->Unit) {
        binding.btnBack.setOnClick(onTapBack)
    }

    fun onOnOpenAnotherHello(onOpenAnotherHello: () -> Unit) {
        binding.btnOpenAnother.setOnClick(onOpenAnotherHello)
    }

//    fun setBack(onBack:(()->Unit)?) {
//        activity.onBackPressedAction = onBack
//    }
}