package tech.skot.demoios

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tech.skot.core.SKLog
import tech.skot.core.components.SKRootStack
import tech.skot.core.components.SKStack
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.CoreViewInjector
import tech.skot.core.di.injector
import tech.skot.core.di.module
import tech.skot.demoios.di.ModelInjector
import tech.skot.demoios.di.ModelInjectorImpl
import tech.skot.demoios.di.ViewInjector
import tech.skot.demoios.di.startModel
import tech.skot.di.modelFrameworkModule

fun startIos(coreViewInjector: CoreViewInjector, viewInjector: ViewInjector): SKStack {
    injector = BaseInjector( listOf(
        modelFrameworkModule,
        module<BaseInjector> {
            single<ModelInjector> { ModelInjectorImpl() }
            single { coreViewInjector }
            single { viewInjector }
        }
    ))
    GlobalScope.launch {
        start(startModel())
    }
    return SKRootStack
}

fun initInjector() {
    injector = BaseInjector( listOf(
        modelFrameworkModule,
        module<BaseInjector> {
            single<ModelInjector> { ModelInjectorImpl() }
        }
    ))
    SKLog.d("-- injector initialized $injector")
    SKLog.d("-- injector logged")
}
