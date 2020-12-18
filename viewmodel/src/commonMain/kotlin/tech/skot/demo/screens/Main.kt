package tech.skot.demo.screens

import tech.skot.core.SKLog
import tech.skot.core.components.Screen
import tech.skot.core.components.Stack
import tech.skot.demo.components.Tab
import tech.skot.demo.di.viewInjector

class Main : Screen<MainView>() {

    init {
        SKLog.d("---Main init")
    }

    val tabNavigation = Tab(
        label = "Navi",
        onTap = {
            selectNav()
        }
    )

    val tabNavInAStack = Tab(
        label = "NavInStack",
        onTap = {
            selectNavInStack()
        }
    )

    val tabDialogs = Tab(
        label = "Dial",
        onTap = {
            selectDialogs()
        }
    )

    val tabs = listOf(tabNavigation, tabNavInAStack, tabDialogs)

    val stack = Stack()

    override val view = viewInjector.main(tabs = tabs.map { it.view }, stack = stack.view)



    private val navigationScreen by lazy {
        Navigation()
    }


    private fun selectNav() {
        stack.content = navigationScreen
        tabs.forEach {
            it.view.selected = it == tabNavigation
        }
    }

    private val navInStackScreen by lazy {
        NavigationInStack()
    }

    private fun selectNavInStack() {
        stack.content = navInStackScreen
        tabs.forEach {
            it.view.selected = it == tabNavInAStack
        }
    }

    private val dialogsScreen by lazy {
        Dialogs()
    }

    private fun selectDialogs() {
        stack.content = dialogsScreen
        tabs.forEach {
            it.view.selected = it == tabDialogs
        }
    }

}