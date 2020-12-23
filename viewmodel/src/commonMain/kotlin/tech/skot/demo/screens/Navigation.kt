package tech.skot.demo.screens

import tech.skot.core.SKLog
import tech.skot.core.components.Screen
import tech.skot.core.di.rootStack
import tech.skot.demo.di.viewInjector

class Navigation : Screen<NavigationView>() {


    override val view = viewInjector.navigation(
        onTapOpenModale = {
            openModale()
        })

    private fun openModale() {
        SKLog.d("open Modale !!!")
        rootStack.push(AuDessus(1))
    }


}