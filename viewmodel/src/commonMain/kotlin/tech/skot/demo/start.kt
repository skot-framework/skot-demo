package tech.skot.demo

import tech.skot.contract.view.ComponentView
import tech.skot.demo.screens.Root

var root:Root? = null


fun start():ComponentView {
    return Root().apply { root =this }.run { view }
}