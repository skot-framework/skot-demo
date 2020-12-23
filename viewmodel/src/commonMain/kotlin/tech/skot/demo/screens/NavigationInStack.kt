package tech.skot.demo.screens

import tech.skot.core.SKLog
import tech.skot.core.components.Screen
import tech.skot.core.components.Stack
import tech.skot.demo.di.viewInjector

class NavigationInStack : Screen<NavigationInStackView>() {

    val stack = Stack()

    override val view = viewInjector.navigationInStack(
        stack = stack.view,
        onTapPushScreen = {
        pushScreen()
    }, onTapBack = {
        popScreen()
        })


    init {
        view.onBackPressed = {
            popScreen()
        }
    }


    var numOfNextScreen = 0

    private fun pushScreen() {
        stack.push(AScreenInAStack(++numOfNextScreen))
    }

    private fun popScreen() {
        stack.pop()
    }

}