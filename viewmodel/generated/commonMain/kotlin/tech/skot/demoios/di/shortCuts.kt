package tech.skot.demoios.di

import tech.skot.core.di.get
import tech.skot.demoios.Colors
import tech.skot.demoios.Icons
import tech.skot.demoios.Plurals
import tech.skot.demoios.Strings
import tech.skot.demoios.Styles
import tech.skot.demoios.states.RootStateContract
import tech.skot.demoios.view.Transitions

val viewInjector: ViewInjector by lazy {
    get()
}

val modelInjector: ModelInjector by lazy {
    get()
}

val strings: Strings by lazy {
    get()
}

val plurals: Plurals by lazy {
    get()
}

val icons: Icons by lazy {
    get()
}

val colors: Colors by lazy {
    get()
}

val styles: Styles by lazy {
    get()
}

val transitions: Transitions by lazy {
    get()
}

lateinit var rootState: RootStateContract
