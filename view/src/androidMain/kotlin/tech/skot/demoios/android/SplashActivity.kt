package tech.skot.demoios.android

import android.content.Intent
import tech.skot.core.toSKUri

class SplashActivity : BaseActivity() {
  override fun onNewIntent(intent: Intent?) {
    super.onNewIntent(intent)
    intent?.data?.toSKUri()?.let { featureInitializer.onDeepLink?.invoke(it) }
  }
}
