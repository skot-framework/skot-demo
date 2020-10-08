package tech.skot.demo

import tech.skot.core.di.get

val viewInjector: ViewInjector by lazy {
    get<ViewInjector>()
}

val modelInjector: ModelInjector by lazy {
    get<ModelInjector>()
}