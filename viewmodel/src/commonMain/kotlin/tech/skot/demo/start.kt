package tech.skot.demo

import tech.skot.core.SKLog
import tech.skot.core.di.rootStack
import tech.skot.demo.screens.Splash

//var root:Root? = null


fun start() {
    SKLog.d("---- start !!")
    rootStack.push(Splash())
//    RootStack.push(Splash())
//    return Root().apply { root =this }.run { view }//Splash().view//
}