package tech.skot.demoios.android

import tech.skot.core.components.SKActivity
import tech.skot.core.di.get
import tech.skot.demoios.DemoiosInitializer

open class BaseActivity : SKActivity() {
  override val featureInitializer: DemoiosInitializer = get()
}
