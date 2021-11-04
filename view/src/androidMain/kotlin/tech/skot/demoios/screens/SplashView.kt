package tech.skot.demoios.screens

import androidx.fragment.app.Fragment
import tech.skot.core.components.SKActivity
import tech.skot.core.components.SKScreenView
import tech.skot.demoios.view.databinding.SplashBinding
import tech.skot.view.extensions.setOnClick

class SplashView(
  override val proxy: SplashViewProxy,
  activity: SKActivity,
  fragment: Fragment?,
  binding: SplashBinding
) : SKScreenView<SplashBinding>(proxy, activity, fragment, binding), SplashRAI {

  override fun onMessage(message: String) {
    binding.tvMessage.text = message
  }

  override fun onOnTapOpenOnTopScreen(onTapOpenOnTopScreen: () -> Unit) {
    binding.btnOpenOnTopScreen.setOnClick(onTapOpenOnTopScreen)
  }

}
