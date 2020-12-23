package tech.skot.demo.di

import tech.skot.core.components.RootStack
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.get
import tech.skot.core.di.module

val viewInjector: ViewInjector by lazy {
    get<ViewInjector>()
}

val rootModule = module<BaseInjector> {
    single { tech.skot.core.components.RootStack() }
}