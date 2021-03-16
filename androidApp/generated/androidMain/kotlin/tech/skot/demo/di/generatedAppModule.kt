package tech.skot.demo.di

import tech.skot.core.di.BaseInjector
import tech.skot.core.di.Module
import tech.skot.core.di.get
import tech.skot.core.di.module
import tech.skot.demo.Colors
import tech.skot.demo.ColorsImpl
import tech.skot.demo.Icons
import tech.skot.demo.IconsImpl
import tech.skot.demo.Plurals
import tech.skot.demo.PluralsImpl
import tech.skot.demo.Strings
import tech.skot.demo.StringsImpl

val generatedAppModule: Module<BaseInjector> = module {
  single { StringsImpl(androidApplication) as Strings}
  single { PluralsImpl(androidApplication) as Plurals}
  single { IconsImpl() as Icons}
  single { ColorsImpl() as Colors}
  single { ViewInjectorImpl() as ViewInjector}
}

