package tech.skot.demo.shared

import tech.skot.core.SKLog
import tech.skot.core.di.BaseInjector
import tech.skot.core.di.injector
import tech.skot.demo.ViewInjector
import tech.skot.demo.di.fromIosModule
import tech.skot.demo.di.viewInjectorImpl


fun start(viewInjector: ViewInjector) {
    viewInjectorImpl = viewInjector
    SKLog.d("start App")
    SKLog.d("creating injector")
    injector = BaseInjector(listOf(fromIosModule))

}