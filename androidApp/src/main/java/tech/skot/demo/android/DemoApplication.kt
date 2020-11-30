package tech.skot.demo.android

import android.app.Application
import tech.skot.core.SKLog
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.injector
import tech.skot.demo.components.ComponentViewImpl
import tech.skot.demo.di.androidviewModule
import tech.skot.demo.di.viewmodelAndroidModule
import tech.skot.demo.start
import timber.log.Timber

var startScreen:ComponentViewImpl? = null

class DemoApplication :Application() {

    override fun onCreate() {
        super.onCreate()

        injector = BaseInjector(this,
            listOf(
                viewmodelAndroidModule,
                androidviewModule
            ))

        startScreen = start() as ComponentViewImpl
        Timber.plant(Timber.DebugTree())

        SKLog.d("----DemoApplication----- onCreate")

    }
}