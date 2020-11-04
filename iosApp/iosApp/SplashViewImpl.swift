//
//  SplashViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/10/2020.
//  Copyright © 2020 orgName. All rights reserved.
//

import Foundation
import shared

class SplashViewImpl: SplashView {
    var message: String = ""
    
    var title: String = ""
    
    func closeKeyboard() {
        
    }
    
    func confirm(title: String?, message: String?, okLabel: String?, koLabel: String?, onOk: @escaping () -> Void) {
        
    }
    
    func displayAlert(title: String?, message: String?, onOk: (() -> Void)? = nil) {
        
    }
    
    func openExternalNavigator(url: String) {
        
    }
    
    func snack(message: String, long long_: Bool, action: BaseActionsSnackAction?) {
        
    }
    
    func toast(message: String, top: Bool, long long_: Bool) {
        
    }
    
    func dismiss() {
        
    }
    
    func openScreenWillFinish(screenToOpen: ContractScreenView) {
        
    }
    
    func showBottomSheetDialog(screen: ContractScreenView) {
        
    }
    
    var key: Int64 = 0
    
    var loading: Bool = false
    
    var onBack: (() -> Void)?
    
    var onTop: ContractScreenView?
    
    func onRemove() {
        
    }
    
    
}
