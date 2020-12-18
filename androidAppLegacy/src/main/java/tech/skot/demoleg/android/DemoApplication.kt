package tech.skot.demoleg.android

import android.app.Application
import tech.skot.core.SKLog
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.injector
import tech.skot.demo.di.androidviewModule
import tech.skot.demo.di.viewmodelAndroidModule
import tech.skot.demo.start
import tech.skot.di.coreViewModule
import timber.log.Timber

//var startScreen:ScreenViewProxy<*>? = null

class DemoApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        injector = BaseInjector(
            this,
            listOf(
                coreViewModule,
                viewmodelAndroidModule,
                androidviewModule
            )
        )


        SKLog.d("----DemoApplication----- onCreate")

        start()

//        registerActivityLifecycleCallbacks(object:ActivityLifecycleCallbacks {
//            override fun onActivityCreated(p0: Activity, p1: Bundle?) {
//                SKLog.d("onActivityCreated ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//            override fun onActivityStarted(p0: Activity) {
//                SKLog.d("onActivityStarted ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//            override fun onActivityResumed(p0: Activity) {
//                SKLog.d("onActivityResumed ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//            override fun onActivityPaused(p0: Activity) {
//                SKLog.d("onActivityPaused ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//            override fun onActivityStopped(p0: Activity) {
//                SKLog.d("onActivityStopped ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//            override fun onActivitySaveInstanceState(p0: Activity, p1: Bundle) {
//                SKLog.d("onActivitySaveInstanceState ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//            override fun onActivityDestroyed(p0: Activity) {
//                SKLog.d("onActivityDestroyed ${p0.hashCode()} ${(p0 as SKActivity).screenKey}")
//            }
//
//        })
//        startScreen = start() as ScreenViewProxy<*>

    }
}