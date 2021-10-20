package tech.skot.demoios.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.Module
import tech.skot.core.di.coreViewModule
import tech.skot.core.di.module
import tech.skot.demoios.Colors
import tech.skot.demoios.ColorsImpl
import tech.skot.demoios.DemoiosInitializer
import tech.skot.demoios.Icons
import tech.skot.demoios.IconsImpl
import tech.skot.demoios.Plurals
import tech.skot.demoios.PluralsImpl
import tech.skot.demoios.Strings
import tech.skot.demoios.StringsImpl
import tech.skot.demoios.Styles
import tech.skot.demoios.StylesImpl
import tech.skot.demoios.onDeeplink
import tech.skot.demoios.start
import tech.skot.demoios.view.Transitions
import tech.skot.demoios.view.TransitionsImpl
import tech.skot.di.modelFrameworkModule
import kotlin.collections.List

val generatedAppModules: List<Module<BaseInjector>> = listOf(
    module {
        single<Strings> { StringsImpl(androidApplication) }
        single<Plurals> { PluralsImpl(androidApplication) }
        single<Icons> { IconsImpl() }
        single<Colors> { ColorsImpl() }
        single<Styles> { StylesImpl() }
        single<ViewInjector> { ViewInjectorImpl() }
        single<ModelInjector> { ModelInjectorImpl() }
        single<Transitions> { TransitionsImpl() }
        single {
            DemoiosInitializer(
                initialize = {
                    initializeView()
                },
                onDeepLink = {
                    onDeeplink(it)
                },
                start = {
                    start(startModel())
                }
            )
        }
    },
    modelFrameworkModule,
    coreViewModule,
)
