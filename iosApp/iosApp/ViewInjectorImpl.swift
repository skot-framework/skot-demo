//
//  ViewInjectorImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import shared

class ViewInjectorImpl: ViewInjector {
    
    func aScreenInAStackView(title: String, lines: [AScreenInAStackViewLine]) -> AScreenInAStackView {
        return AScreenInAStackViewImpl(title: title, lines: lines)
    }
    
    func bottomSheetExample(onTapDismiss: @escaping () -> Void) -> BottomSheetExampleView {
        return BottomSheetExampleViewImpl(onTapDismiss: onTapDismiss)
    }
    

    func navigationInStack(stack: CoreStackView, onTapPushScreen: @escaping () -> Void, onTapBack: @escaping () -> Void) -> NavigationInStackView {
        return NavigationInAStackViewImpl(stack: stack  as! StackViewImpl, onTapPushScreen: onTapPushScreen, onTapBack: onTapBack)
    }
    

   
    func tabView(label: String, onTap: @escaping () -> Void, selectedInitial: Bool) -> TabView {
        return TabViewImpl(label: label, onTap: onTap, selected: selectedInitial)
    }
    
    
    func splash(message: String) -> SplashView {
        return SplashViewImpl(message: message)
    }
    
    func main(tabs: [TabView], stack: CoreStackView) -> MainView {
        return MainViewImpl(stack: stack as! StackViewImpl, tabs: tabs as! Array<TabViewImpl>)
    }
    

    
    func dialogs(alert: CoreAlertView, snackBar: CoreSnackBarView, bottomSheet: CoreBottomSheetView, onTapSnack: @escaping () -> Void, onTapAlert: @escaping () -> Void, onTapAlertCustomButton: @escaping () -> Void, onTapAlertTwoButtons: @escaping () -> Void, onTapShowBottomSheet: @escaping () -> Void, onTapShowGlobalBottomSheet: @escaping () -> Void) -> DialogsView {
        return DialogsViewImpl(alert: alert as! AlertViewImpl, snackBar: snackBar as! SnackBarViewImpl, bottomSheet: bottomSheet as! BottomSheetViewImpl, onTapAlert: onTapAlert, onTapAlertCustomButton: onTapAlertCustomButton, onTapAlertTwoButtons: onTapAlertTwoButtons, onTapSnack: onTapSnack, onTapShowBottomSheet: onTapShowBottomSheet, onTapShowGlobalBottomSheet: onTapShowGlobalBottomSheet)
    }
    
    func navigation(onTapOpenModale: @escaping () -> Void, onTapToPager: @escaping () -> Void) -> NavigationView {
        return NavigationViewImpl(onTapOpenModale: onTapOpenModale, onTapToPager: onTapToPager)
    }
    
    func auDessus(title: String, onTapOpenAnother: @escaping () -> Void, onTapClose: @escaping () -> Void, lines:[AuDessusViewLine]) -> AuDessusView {
        return AuDessusViewImpl(title: title, onTapOpenAnother: onTapOpenAnother, onTapClose: onTapClose, lines: lines)
    }
    
    func pagerExample(pager: CorePagerView, onTapToIndex2: @escaping () -> Void) -> PagerExampleView {
        return PagerExampleViewImpl(onTapToIndex2: onTapToIndex2, pagerImpl: pager as! PagerViewImpl)
    }
    
   

}
