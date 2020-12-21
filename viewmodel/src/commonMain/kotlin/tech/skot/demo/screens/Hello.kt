package tech.skot.demo.screens

import tech.skot.core.components.RootStack
import tech.skot.core.components.Screen
import tech.skot.demo.di.viewInjector

class Hello : Screen<HelloView>() {

    override val view = viewInjector.hello(
        onTapBack = {
            if (RootStack.screens.size == 1) {
                logD("Vous êtes à la racine de la pile !!!")
            }
            else {
                RootStack.pop()
            }
        }, onOpenAnotherHello = {
            RootStack.push(Hello())
        })


}