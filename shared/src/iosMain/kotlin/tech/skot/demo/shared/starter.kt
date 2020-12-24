package tech.skot.demo.shared

import tech.skot.core.components.RootStack
import tech.skot.core.di.*
import tech.skot.demo.di.ViewInjector
import tech.skot.demo.di.fromIosModule
import tech.skot.demo.di.viewInjectorImpl



fun start(viewInjector: ViewInjector, coreViewInjector: CoreViewInjector): RootStack {
    viewInjectorImpl = viewInjector
    injector = BaseInjector(listOf(fromIosModule, module<BaseInjector> {
        single { coreViewInjector }
    }))

    tech.skot.demo.start()
    return rootStack
}