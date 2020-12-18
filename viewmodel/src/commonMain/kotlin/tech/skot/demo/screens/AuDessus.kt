package tech.skot.demo.screens

import tech.skot.core.components.RootStack
import tech.skot.core.components.Screen
import tech.skot.demo.di.viewInjector

class AuDessus(val number: Int) : Screen<AuDessusView>() {

    override val view = viewInjector.auDessus("\"Au dessus\" n° $number", onTapOpenAnother = {
        RootStack.push(AuDessus(number + 1))
//        root?.stack?
    }, onTapClose = {
        RootStack.pop()
//        root?.stack?.pop()
    },
        List(100) {
            AuDessusView.Line(it.toLong())
        })
}