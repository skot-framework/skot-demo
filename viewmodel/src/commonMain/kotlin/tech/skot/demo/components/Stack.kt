package tech.skot.demo.components

import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class Stack : Component<StackView>() {
    override val view = viewInjector.statck()

    var screens: List<Component<*>> = emptyList()
        set(value) {
            field = value
            view.screens = value.map { it.view }
        }

    var content: Component<*>
        get() = screens.last()
        set(value) {
            screens = listOf(value)
        }

    fun push(screen: Component<*>) {
        screens += screen

    }

    fun pop() {
        screens = screens - screens.last()
    }


}