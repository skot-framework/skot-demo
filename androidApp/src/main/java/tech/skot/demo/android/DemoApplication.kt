package tech.skot.demo.android

import android.app.Application
import tech.skot.components.startView
import tech.skot.core.SKLog
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.injector
import tech.skot.demo.di.androidviewModule
import tech.skot.demo.di.viewmodelAndroidModule
import tech.skot.demo.screens.Splash
import tech.skot.di.viewFrameworkModule

class DemoApplication :Application() {

    override fun onCreate() {
        super.onCreate()

        injector = BaseInjector(this,
            listOf(
                viewmodelAndroidModule,
                viewFrameworkModule,
                androidviewModule
            ))

        SKLog.d("----DemoApplication----- onCreate")

        startView {
            Splash().setAsInitial().view
        }
    }
}