package tech.skot.demo.screens

import tech.skot.demo.di.viewInjector
import tech.skot.demo.root
import tech.skot.viewmodel.Component

class AuDessus(val number: Int) : Component<AuDessusView>() {

    override val view = viewInjector.auDessus("\"Au dessus\" n° $number", onTapOpenAnother = {
        root?.stack?.push(AuDessus(number + 1))
    }, onTapClose = {
        root?.stack?.pop()
    })
}