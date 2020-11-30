package tech.skot.demo.screens

import tech.skot.demo.di.viewInjector
import tech.skot.demo.root
import tech.skot.viewmodel.Component

class Navigation : Component<NavigationView>() {

    override val view = viewInjector.navigation(onTapOpenModale = {
        openModale()
    })


    private fun openModale() {
        root?.stack?.push(AuDessus(1))
    }

}