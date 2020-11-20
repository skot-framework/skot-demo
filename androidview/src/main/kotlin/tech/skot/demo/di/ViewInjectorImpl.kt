package tech.skot.demo.di

import tech.skot.demo.components.StackView
import tech.skot.demo.components.StackViewImpl
import tech.skot.demo.screens.*
import kotlin.Function0
import kotlin.String
import kotlin.Unit

class ViewInjectorImpl : ViewInjector {
    override fun statck(): StackView {
        return StackViewImpl()
    }

    override fun root(stack: StackView): RootView {
        return RootViewImpl(stack = stack as StackViewImpl)
    }

    override fun hello(): HelloView {
        return HelloViewImpl()
    }

    override fun splash(message: String?): SplashView {
        return SplashViewImpl(messageInitial = message)
    }

}
