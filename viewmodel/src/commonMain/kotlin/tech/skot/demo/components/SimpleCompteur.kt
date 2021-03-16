package tech.skot.demo.components

import tech.skot.demo.di.strings
import tech.skot.demo.di.viewInjector

class SimpleCompteur : SimpleCompteurGen() {
    override val view: SimpleCompteurVC = viewInjector.simpleCompteur(onTap = { onTap() }, labelInitial
    = strings.simple_compteur_initial)

    private var counter = 0

    private fun onTap() {
        counter++
        view.label = counter.toString()
    }
}
