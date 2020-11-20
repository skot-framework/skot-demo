package tech.skot.demo.screens

import tech.skot.demo.components.Stack
import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class Root : Component<RootView>() {

    val stack = Stack()

    override val view = viewInjector.root(stack = stack.view)

    init {
        stack.content = Splash(stack)
    }

}