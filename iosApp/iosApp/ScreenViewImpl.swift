//
//  ScreenViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation

import SwiftUI
import shared

var _compteur = Int64(0)
func getKey() -> Int64 {
    _compteur += 1
    return _compteur
}

var screensViewImpl = [Int64 : ScreenViewImpl]()


class ScreenViewImpl: ContractScreenView {
    
    
    func ui() -> AnyView {
        AnyView(ContentView())
    }
    
    
    @objc
    func closeKeyboard() {
        
    }
   
    
    
    @objc(confirmTitle:message:okLabel:koLabel:onOk:)
    func confirm(title: String?, message: String?, okLabel: String?, koLabel: String?, onOk: @escaping () -> Void) {
        
    }
    
    
    @Published var presentAlert:Bool = false
    var titleAlert:String?
    var messageAlert:String?
    
    @objc(displayAlertTitle:message:onOk:)
    func displayAlert(title: String?, message: String?, onOk: (() -> Void)? = nil) {
        titleAlert = title
        messageAlert = message
        print("---ALERTE!!!--"+(title ?? "pas de titre"))
        presentAlert = true
    }
    
    @objc(openExternalNavigatorUrl:)
    func openExternalNavigator(url: String) {
        
    }
    
    @objc(snackMessage:long:action:)
    func snack(message: String, long long_: Bool, action: BaseActionsSnackAction?) {
        
    }
    
    @objc(toastMessage:top:long:)
    func toast(message: String, top: Bool, long long_: Bool) {
        
    }
    
    @objc
    func dismiss() {
        
    }
    
    @objc
    func openScreenWillFinish(screenToOpen: ContractScreenView) {
        
    }
    
    @objc
    func showBottomSheetDialog(screen_ screen: ContractScreenView) {
        
    }
    
    let key: Int64 = getKey()
    
    
    init() {
        screensViewImpl[key] = self
    }
    
    
    var loading: Bool = false
    
    var onBack: (() -> Void)? = nil
    
    var onTop: ContractScreenView? = nil
    
    func onRemove() {
        
    }
    
 
    
    /*func ui<V:View>() -> V {
        return ContentView() as! V
    }*/
    
   // typealias UIView = ContentView
    
     /*func ui() -> Any {
        return ContentView()
    }*/
    
    
}
