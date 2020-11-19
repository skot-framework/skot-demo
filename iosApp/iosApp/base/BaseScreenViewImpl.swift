//
//  BaseScreenViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 11/11/2020.
//

import Foundation
import shared

class BaseScreenViewImpl: ScreenViewImpl, BaseScreenView {
    
    @objc(confirmTitle:message:okLabel:koLabel:onOk:)
    func confirm(title: String?, message: String?, okLabel: String?, koLabel: String?, onOk: @escaping () -> Void) {
        
    }
    
    
    struct Alert {
        let title:String?
        let message:String?
        let onOk: (()->Void)?
    }
    @Published
    var act_alert:Alert?
    
    
    @objc(displayAlertTitle:message:onOk:)
    func displayAlert(title: String?, message: String?, onOk: (() -> Void)? = nil) {
        act_alert = Alert(title: title, message: message, onOk: onOk)
    }
    
    @objc(openExternalNavigatorUrl:)
    func openExternalNavigator(url: String) {
        
    }
    
    struct Snack {
        let message:String
        let isLong:Bool
    }
    @Published
    var act_snack:Snack?
    
    @objc(snackMessage:long:action:)
    func snack(message: String, long long_: Bool, action: BaseActionsSnackAction?) {
        act_snack = Snack(message: message, isLong: long_)
    }
    
    @objc(toastMessage:top:long:)
    func toast(message: String, top: Bool, long long_: Bool) {
        
    }
    
}
