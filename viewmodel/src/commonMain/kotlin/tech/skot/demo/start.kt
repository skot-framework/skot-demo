package tech.skot.demo

import tech.skot.core.SKLog
import tech.skot.core.components.RootStack
import tech.skot.demo.screens.Splash

//var root:Root? = null


fun start() {
    SKLog.d("---- start !!")
    RootStack.push(Splash())
//    return Root().apply { root =this }.run { view }//Splash().view//
}