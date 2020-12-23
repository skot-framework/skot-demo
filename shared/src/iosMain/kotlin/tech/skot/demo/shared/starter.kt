package tech.skot.demo.shared

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import tech.skot.core.SKLog
import tech.skot.core.components.RootStack
import tech.skot.core.di.*
import tech.skot.demo.di.ViewInjector
import tech.skot.demo.di.fromIosModule
import tech.skot.demo.di.rootModule
import tech.skot.demo.di.viewInjectorImpl


fun start(viewInjector: ViewInjector, coreViewInjector: CoreViewInjector): RootStack {
    viewInjectorImpl = viewInjector
    injector = BaseInjector(listOf(fromIosModule, coreViewModule(coreViewInjector), rootModule))

    SKLog.d("---- start, injections done")
    tech.skot.demo.start()
    return get<RootStack>()
}