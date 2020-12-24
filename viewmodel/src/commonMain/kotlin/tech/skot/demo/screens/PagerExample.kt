package tech.skot.demo.screens

import tech.skot.core.components.Pager
import tech.skot.core.components.Screen
import tech.skot.demo.di.viewInjector

class PagerExample : Screen<PagerExampleView>() {

    private val pager = Pager(
        screens = listOf(AScreenInAStack(1),AScreenInAStack(2),AScreenInAStack(3),AScreenInAStack(4),AScreenInAStack(5)),
        onSwipeToPage = { onSwipeToPage(it) }
    )

    override val view = viewInjector.pagerExample(pager.view, onTapToIndex2 = {
        pager.selectedIndex = 2
    })

    private fun onSwipeToPage(index:Int) {
        view.textSelectedPage = index.toString()
    }
    init {
        view.onBackPressed = {
            finish()
        }
        view.textSelectedPage = "??"
    }
}