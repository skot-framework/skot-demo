package tech.skot.demo.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.module

val androidviewModule = module<BaseInjector> {
    single { ViewInjectorImpl() as ViewInjector }
}