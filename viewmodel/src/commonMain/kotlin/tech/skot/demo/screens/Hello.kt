package tech.skot.demo.screens

import tech.skot.demo.di.viewInjector
import tech.skot.viewmodel.Component

class Hello :Component<HelloView>() {

    override val view = viewInjector.hello()

}