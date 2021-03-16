package tech.skot.demo.di

import tech.skot.core.di.get
import tech.skot.demo.Colors
import tech.skot.demo.Icons
import tech.skot.demo.Plurals
import tech.skot.demo.Strings

val viewInjector: ViewInjector = get()

val strings: Strings = get()

val plurals: Plurals = get()

val icons: Icons = get()

val colors: Colors = get()
