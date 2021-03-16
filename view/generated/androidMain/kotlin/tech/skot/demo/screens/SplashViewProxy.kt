package tech.skot.demo.screens

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlin.Boolean
import kotlin.Function0
import kotlin.Int
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewProxy
import tech.skot.demo.view.R
import tech.skot.demo.view.databinding.SplashBinding
import tech.skot.view.live.MutableSKLiveData

class SplashViewProxy(
  override val onTapGo: Function0<Unit>,
  messageInitial: String?
) : ScreenViewProxy<SplashBinding>(), SplashVC {
  private val messageLD: MutableSKLiveData<String?> = MutableSKLiveData(messageInitial)

  override var message: String? by messageLD

  override val layoutId: Int = R.layout.splash

  override fun saveState() {
  }

  override fun getActivityClass() = tech.skot.demo.android.BaseActivity::class.java
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
  ): SplashViewImpl = SplashViewImpl(activity, fragment, binding).apply {
    collectObservers = collectingObservers
    onOnTapGo(onTapGo)
    messageLD.observe {
      onMessage(it)
    }
  }
}

interface SplashRAI {
  fun onOnTapGo(onTapGo: Function0<Unit>)

  fun onMessage(message: String?)
}
