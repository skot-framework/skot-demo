package tech.skot.demo.di

import tech.skot.demo.components.*
import tech.skot.demo.screens.*
import kotlin.Function0
import kotlin.String
import kotlin.Unit

class ViewInjectorImpl : ViewInjector {

    override fun stack(): StackView {
        return StackViewImpl()
    }

    override fun tabView(label: String, onTap: () -> Unit, selectedInitial: Boolean): TabView {
        return TabViewImpl(label, onTap, selectedInitial)
    }

    override fun alert(): AlertView {
        return AlertViewImpl()
    }

    override fun snackBar(): SnackBarView {
        return SnackBarViewImpl()
    }

    override fun root(stack: StackView): RootView {
        return RootViewImpl(stack = stack as StackViewImpl)
    }

    override fun hello(onTapBack:()->Unit): HelloView {
        return HelloViewImpl(onTapBack)
    }

    override fun splash(message: String): SplashView {
        return SplashViewImpl(messageInitial = message)
    }

    override fun main(tabs: List<TabView>, content: StackView): MainView {
        return MainViewImpl(tabs as List<TabViewImpl>, content as StackViewImpl)
    }

    override fun dialogs(alert:AlertView, snackBar: SnackBarView, onTapSnack: () -> Unit, onTapAlert:()->Unit): DialogsView {
        return DialogsViewImpl(alert as AlertViewImpl, snackBar as SnackBarViewImpl,  onTapSnack = onTapSnack, onTapAlert = onTapAlert)
    }

    override fun navigation(onTapOpenModale: () -> Unit): NavigationView {
        return NavigationViewImpl(onTapOpenModale = onTapOpenModale)
    }

    override fun auDessus(title: String, onTapOpenAnother: () -> Unit, onTapClose:()->Unit, lines:List<AuDessusView.Line>): AuDessusView {
        return AuDessusViewImpl(title = title, onTapOpenAnother = onTapOpenAnother, onTapClose = onTapClose, lines = lines)
    }

}
