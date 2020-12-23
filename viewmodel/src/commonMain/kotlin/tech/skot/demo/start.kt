package tech.skot.demo

import tech.skot.core.di.rootStack
import tech.skot.demo.screens.Splash


fun start() {
    rootStack.push(Splash())
}