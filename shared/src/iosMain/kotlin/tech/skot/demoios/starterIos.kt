package tech.skot.demoios

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import tech.skot.core.SKLog
import tech.skot.core.components.SKComponent
import tech.skot.core.components.SKRootStack
import tech.skot.core.components.SKStack
import tech.skot.core.components.errorTreatment
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.CoreViewInjector
import tech.skot.core.di.injector
import tech.skot.core.di.module
import tech.skot.demoios.di.*
import tech.skot.demoios.screens.Splash
import tech.skot.demoios.screens.burger.BurgerScreen
import tech.skot.demoios.states.restoreState
import tech.skot.di.modelFrameworkModule

fun startIos(): SKStack {
    CoroutineScope(Dispatchers.Main).launch {
        restoreState().let {
            tech.skot.demoios.states.rootState = it
            tech.skot.demoios.di.rootState = it
        }

        errorTreatment = { component, exception, errorMessage ->
            SKLog.e(exception, errorMessage ?: exception.message ?: "Erreur inconue")
        }

        SKRootStack.content = Splash()

    }



    return SKRootStack
}

fun initInjector(viewInjector: ViewInjector, coreViewInjector: CoreViewInjector) {
    SKLog.d("-- injector viewInjector $viewInjector")
    SKLog.d("-- injector coreViewInjector $coreViewInjector")
    injector = BaseInjector( listOf(
        modelFrameworkModule,
        modelModule,
        module<BaseInjector> {
            single<ModelInjector> { ModelInjectorImpl() }
            single<ViewInjector> { viewInjector }
            single<CoreViewInjector> { coreViewInjector }
        }
    ))
    SKLog.d("-- injector initialized $injector")
    SKLog.d("-- injector logged")
}

