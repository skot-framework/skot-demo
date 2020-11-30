package tech.skot.demo.screens

import tech.skot.demo.components.Stack
import tech.skot.demo.components.Tab
import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class Main :Component<MainView>() {

    val tabNavigation = Tab(
        label = "Navi",
        onTap = {
            selectNav()
        }
    )

    val tabDialogs = Tab(
        label = "Dial",
        onTap = {
            selectDialogs()
        }
    )

    val tabs = listOf(tabNavigation, tabDialogs)

    val content = Stack()

    override val view = viewInjector.main(tabs = tabs.map { it.view }, content = content.view)


    private fun selectNav() {
        content.content = Navigation()
        tabs.forEach {
            it.view.selected = it == tabNavigation
        }
    }

    private fun selectDialogs() {
        content.content = Dialogs()
        tabs.forEach {
            it.view.selected = it == tabDialogs
        }
    }


    init {
        logD("--------- Main !!!!")
    }
}