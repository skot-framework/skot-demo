package tech.skot.demo.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.module
import tech.skot.demo.di.ViewInjector

var viewInjectorImpl:ViewInjector? = null


val fromIosModule = module<BaseInjector> {
    single {
        viewInjectorImpl!!
    }
}