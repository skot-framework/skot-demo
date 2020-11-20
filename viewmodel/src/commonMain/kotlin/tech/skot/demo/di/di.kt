package tech.skot.demo.di

import tech.skot.core.di.get

val viewInjector: ViewInjector by lazy {
    get<ViewInjector>()
}
