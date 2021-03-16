package tech.skot.demo.android

import android.app.Application
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.coreViewModule
import tech.skot.core.di.injector
import tech.skot.demo.di.generatedAppModule
import tech.skot.demo.start
import tech.skot.di.modelFrameworkModule
import timber.log.Timber

class DemoApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    Timber.plant(Timber.DebugTree())
    injector = BaseInjector(this,
        listOf(
                modelFrameworkModule,
                coreViewModule,
                generatedAppModule
        ))
    start()
  }
}
