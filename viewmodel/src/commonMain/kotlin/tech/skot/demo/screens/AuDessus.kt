package tech.skot.demo.screens

import tech.skot.core.components.Screen
import tech.skot.core.di.rootStack
import tech.skot.demo.di.viewInjector

class AuDessus(val number: Int) : Screen<AuDessusView>() {

    override val view = viewInjector.auDessus("\"Au dessus\" n° $number", onTapOpenAnother = {
        push(AuDessus(number + 1))
//        RootStack.push(AuDessus(number + 1))
    }, onTapClose = {
                    finish()
//        rootStack.pop()
//        RootStack.pop()
    },
        List(100) {
            AuDessusView.Line(it.toLong())
        })

    init {
        view.onBackPressed = {
            finish()
//            rootStack.pop()
//            RootStack.pop()
        }
    }
}