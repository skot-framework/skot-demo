//
//  ViewInjectorImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import shared

class ViewInjectorImpl: ViewInjector {

    
    
    func splash(message: String) -> SplashView {
        return SplashViewImpl(message: message)
    }
    
    func oneButton(onTapButton: @escaping () -> Void, onTapDemoBaseActions: @escaping () -> Void) -> OneButtonView {
        return OneButtonViewImpl(onTapButton: onTapButton, onTapDemoBaseActions: onTapDemoBaseActions)
    }
    
    func withBackScreen(onTapBack: @escaping () -> Void, onTapOpen: @escaping () -> Void) -> WithBackScreenView {
        return WithBackScreenViewImpl(onTapBack: onTapBack, onTapOpen: onTapOpen)
    }
    
    
    func demoBaseActions(onTapAlert: @escaping () -> Void, onTapBack: @escaping () -> Void, onTapConfirm: @escaping () -> Void, onTapOpenExternalNavigator: @escaping () -> Void, onTapShortSnack: @escaping () -> Void, onTapSnack: @escaping () -> Void) -> DemoBaseActionsView {
        return DemoBaseActionsViewImpl(onTapBack: onTapBack, onTapAlert: onTapAlert, onTapConfirm: onTapConfirm, onTapSnack: onTapSnack, onTapShortSnack: onTapShortSnack, onTapOpenExternalNavigator: onTapOpenExternalNavigator)
    }
    
    
}
