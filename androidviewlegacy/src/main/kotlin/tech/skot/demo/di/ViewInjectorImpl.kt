package tech.skot.demo.di

import tech.skot.core.components.*
import tech.skot.core.components.presented.AlertView
import tech.skot.core.components.presented.BottomSheetView
import tech.skot.core.components.presented.SnackBarView

import tech.skot.demo.components.TabView
import tech.skot.demo.components.TabViewProxy
import tech.skot.demo.screens.*
import tech.skot.view.legacy.StackViewProxy

class ViewInjectorImpl : ViewInjector {

    override fun tabView(label: String, onTap: () -> Unit, selectedInitial: Boolean): TabView {
        return TabViewProxy(label, onTap, selectedInitial)
    }



    override fun hello(onTapBack: () -> Unit, onOpenAnotherHello: () -> Unit): HelloView {
        return HelloViewProxy(onTapBack, onOpenAnotherHello)
    }

    override fun splash(message: String): SplashView {
        return SplashViewProxy(messageInitial = message)
    }

    override fun main(tabs: List<TabView>, stack: StackView): MainView {
        return MainViewProxy(tabs as List<TabViewProxy>, stack as StackViewProxy)
    }

    override fun dialogs(
        alert: AlertView,
        snackBar: SnackBarView,
        bottomSheet: BottomSheetView,
        onTapSnack: () -> Unit,
        onTapAlert: () -> Unit,
        onTapShowBottomSheet: () -> Unit,
    ): DialogsView {
        return DialogsViewProxy(alert = alert as AlertViewProxy, snackBar = snackBar as SnackBarViewProxy, bottomSheet = bottomSheet as BottomSheetViewProxy, onTapSnack = onTapSnack, onTapAlert = onTapAlert, onTapShowBottomSheet = onTapShowBottomSheet)
    }


    override fun navigation(onTapOpenModale: () -> Unit): NavigationView {
        return NavigationProxy(onTapOpenModale)
    }

    override fun navigationInStack(
        content: StackView,
        onTapPushScreen: () -> Unit,
        onTapBack:()->Unit
    ): NavigationInStackView {
        return NavigationInStackProxy(content as StackViewProxy, onTapPushScreen, onTapBack)
    }

    override fun auDessus(
        title: String,
        onTapOpenAnother: () -> Unit,
        onTapClose: () -> Unit,
        lines: List<AuDessusView.Line>
    ): AuDessusView {
        return AuDessusViewProxy(
            title, onTapOpenAnother, onTapClose, lines
        )
    }

    override fun aScreenInAStackView(
        title: String,
        lines: List<AScreenInAStackView.Line>
    ): AScreenInAStackView {
        return AScreenInAStackProxy(title, lines)
    }

    override fun bottomSheetExample(onTapDismiss: () -> Unit) = BottomSheetExampleViewProxy(onTapDismiss)

}
