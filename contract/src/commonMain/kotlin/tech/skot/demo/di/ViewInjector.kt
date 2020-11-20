package tech.skot.demo.di

import tech.skot.demo.components.StackView
import tech.skot.demo.screens.HelloView
import tech.skot.demo.screens.RootView
import tech.skot.demo.screens.SplashView


interface ViewInjector {
    fun statck():StackView

    fun root(stack:StackView):RootView
    fun hello():HelloView
    fun splash(message:String?):SplashView
}
