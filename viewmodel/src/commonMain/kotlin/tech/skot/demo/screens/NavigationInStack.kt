package tech.skot.demo.screens

import tech.skot.core.SKLog
import tech.skot.core.components.Screen
import tech.skot.core.components.Stack
import tech.skot.demo.di.viewInjector

class NavigationInStack : Screen<NavigationInStackView>() {

    val content = Stack()

    override val view = viewInjector.navigationInStack(
        content = content.view,
        onTapPushScreen = {
        pushScreen()
    }, onTapBack = {
        popScreen()
        })


    var numOfNextScreen = 0

    private fun pushScreen() {
        SKLog.d("push Screen !!!")

        content.push(AScreenInAStack(++numOfNextScreen))

    }

    private fun popScreen() {
        content.pop()
    }

}