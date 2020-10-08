package tech.skot.demo.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.module
import tech.skot.demo.ViewInjector
import tech.skot.demo.ViewInjectorImpl

val androidviewModule = module<BaseInjector> {
    single { ViewInjectorImpl() as ViewInjector }
}