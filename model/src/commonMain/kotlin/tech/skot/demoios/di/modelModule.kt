package tech.skot.demoios.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.module
import tech.skot.demoios.model.network.UAClient
import tech.skot.demoios.model.network.UAClientImpl

val modelModule = module<BaseInjector> {
    single { UAClientImpl() as UAClient }
}