//
//  ViewInjectorImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import shared

class ViewInjectorImpl: ViewInjector {
    
    func statck() -> StackView {
        return StackViewImpl()
    }
    
    func tabView(label: String, onTap: @escaping () -> Void, selectedInitial: Bool) -> TabView {
        return TabViewImpl(label: label, onTap: onTap, selected: selectedInitial)
    }
    
    func alert() -> AlertView {
        return AlertViewImpl()
    }
    
    func snackBar() -> SnackBarView {
        return SnackBarViewImpl()
    }
    
    
    
    func root(stack: StackView) -> RootView {
        return RootViewImpl(stack: stack as! StackViewImpl)
    }
    
    func hello() -> HelloView {
        return HelloViewImpl()
    }
    
    func splash(message: String) -> SplashView {
        return SplashViewImpl(message: message)
    }
    
    func main(tabs: [TabView], content: StackView) -> MainView {
        return MainViewImpl(content: content as! StackViewImpl, tabs: tabs as! Array<TabViewImpl>)
    }
    
    func dialogs(alert: AlertView, snackBar: SnackBarView, onTapSnack: @escaping () -> Void, onTapAlert: @escaping () -> Void) -> DialogsView {
        return DialogsViewImpl(alert: alert as! AlertViewImpl, snackBar: snackBar as! SnackBarViewImpl, onTapAlert: onTapAlert, onTapSnack: onTapSnack)
    }
    
    func navigation(onTapOpenModale: @escaping () -> Void) -> NavigationView {
        return NavigationViewImpl(onTapOpenModale: onTapOpenModale)
    }
    
    func auDessus(title: String, onTapOpenAnother: @escaping () -> Void, onTapClose: @escaping () -> Void, lines:[AuDessusViewLine]) -> AuDessusView {
        return AuDessusViewImpl(title: title, onTapOpenAnother: onTapOpenAnother, onTapClose: onTapClose, lines: lines)
    }
    
   

}
