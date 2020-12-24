package tech.skot.demo.di

import tech.skot.core.components.PagerView
import tech.skot.core.components.PagerViewProxy
import tech.skot.core.components.StackView
import tech.skot.core.components.presented.*
import tech.skot.demo.components.TabView
import tech.skot.demo.components.TabViewProxy
import tech.skot.demo.screens.*
import tech.skot.view.legacy.StackViewProxy

class ViewInjectorImpl : ViewInjector {

    override fun tabView(label: String, onTap: () -> Unit, selectedInitial: Boolean): TabView {
        return TabViewProxy(label, onTap, selectedInitial)
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
        onTapAlertCustomButton: () -> Unit,
        onTapAlertTwoButtons: () -> Unit,
        onTapShowBottomSheet: () -> Unit,
        onTapShowGlobalBottomSheet: () -> Unit
    ): DialogsView {
        return DialogsViewProxy(
            alert = alert as AlertViewProxy,
            snackBar = snackBar as SnackBarViewProxy,
            bottomSheet = bottomSheet as BottomSheetViewProxy,
            onTapSnack = onTapSnack,
            onTapAlert = onTapAlert,
            onTapAlertCustomButton = onTapAlertCustomButton,
            onTapAlertTwoButtons = onTapAlertTwoButtons,
            onTapShowBottomSheet = onTapShowBottomSheet,
            onTapShowGlobalBottomSheet = onTapShowGlobalBottomSheet
        )
    }


    override fun navigation(onTapOpenModale: () -> Unit, onTapToPager: () -> Unit): NavigationView {
        return NavigationProxy(onTapOpenModale, onTapToPager)
    }

    override fun navigationInStack(
        stack: StackView,
        onTapPushScreen: () -> Unit,
        onTapBack: () -> Unit
    ): NavigationInStackView {
        return NavigationInStackProxy(stack as StackViewProxy, onTapPushScreen, onTapBack)
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

    override fun bottomSheetExample(onTapDismiss: () -> Unit) =
        BottomSheetExampleViewProxy(onTapDismiss)

    override fun pagerExample(pager: PagerView, onTapToIndex2:()->Unit) =
        PagerExampleViewProxy(
            pager as PagerViewProxy,
            onTapToIndex2 = onTapToIndex2
        )

}
