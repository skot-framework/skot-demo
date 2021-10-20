package tech.skot.demoios.android

import android.app.Application
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.injector
import tech.skot.demoios.di.generatedAppModules
import timber.log.Timber

class DemoiosApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    Timber.plant(Timber.DebugTree())
    injector = BaseInjector(this,
                        generatedAppModules +
                        listOf(
                        ))
  }
}
