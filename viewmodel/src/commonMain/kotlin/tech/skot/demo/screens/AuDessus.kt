package tech.skot.demo.screens

import tech.skot.core.components.RootStack
import tech.skot.core.components.Screen
import tech.skot.core.di.get
import tech.skot.demo.di.viewInjector

class AuDessus(val number: Int) : Screen<AuDessusView>() {

    override val view = viewInjector.auDessus("\"Au dessus\" n° $number", onTapOpenAnother = {
        get<RootStack>().push(AuDessus(number + 1))
//        RootStack.push(AuDessus(number + 1))
    }, onTapClose = {
        get<RootStack>().pop()
//        RootStack.pop()
    },
        List(100) {
            AuDessusView.Line(it.toLong())
        })

    init {
        view.onBackPressed = {
            get<RootStack>().pop()
//            RootStack.pop()
        }
    }
}