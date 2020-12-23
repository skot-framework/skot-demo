package tech.skot.demo.screens

import tech.skot.core.SKLog
import tech.skot.core.components.RootStack
import tech.skot.core.components.Screen
import tech.skot.core.di.get
import tech.skot.demo.di.viewInjector

class Navigation : Screen<NavigationView>() {


    override val view = viewInjector.navigation(
        onTapOpenModale = {
            openModale()
        })

    private fun openModale() {
        SKLog.d("open Modale !!!")
        get<RootStack>().push(AuDessus(1))
//        RootStack.push(AuDessus(1))
    }


}