package tech.skot.demoios.di

import tech.skot.core.di.get
import tech.skot.demoios.Colors
import tech.skot.demoios.Icons
import tech.skot.demoios.Plurals
import tech.skot.demoios.Strings
import tech.skot.demoios.Styles
import tech.skot.demoios.view.Transitions

val viewInjector: ViewInjector = get()

val modelInjector: ModelInjector = get()

val strings: Strings = get()

val plurals: Plurals = get()

val icons: Icons = get()

val colors: Colors = get()

val styles: Styles = get()

val transitions: Transitions = get()
