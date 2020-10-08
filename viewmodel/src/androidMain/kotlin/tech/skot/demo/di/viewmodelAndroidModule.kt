package tech.skot.demo.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.module
import tech.skot.viewmodel.NetworkApplicativeModel
import tech.skot.viewmodel.NetworkApplicativeModelImpl

val viewmodelAndroidModule = module<BaseInjector> {
    single { NetworkApplicativeModelImpl(androidApplication) as NetworkApplicativeModel }
}