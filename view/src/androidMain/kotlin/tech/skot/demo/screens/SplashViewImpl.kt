package tech.skot.demo.screens

import androidx.fragment.app.Fragment
import kotlin.Function0
import kotlin.String
import kotlin.Unit
import tech.skot.core.components.SKActivity
import tech.skot.core.components.ScreenViewImpl
import tech.skot.demo.view.databinding.SplashBinding
import tech.skot.view.extensions.setOnClick

class SplashViewImpl(
  activity: SKActivity,
  fragment: Fragment?,
  binding: SplashBinding
) : ScreenViewImpl<SplashBinding>(activity, fragment, binding), SplashRAI {
  override fun onOnTapGo(onTapGo: Function0<Unit>) {
    binding.btnGo.setOnClick(onTapGo)
  }

  override fun onMessage(message: String?) {
    binding.tvMessage.text = message
  }
}
