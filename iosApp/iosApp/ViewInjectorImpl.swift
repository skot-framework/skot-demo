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
    
    func oneButton(onTapButton: @escaping () -> Void) -> OneButtonView {
        return OneButtonViewImpl(onTapButton: onTapButton)
    }
    
    func withBackScreen(onTapBack: @escaping () -> Void, onTapOpen: @escaping () -> Void) -> WithBackScreenView {
        return WithBackScreenViewImpl(onTapBack: onTapBack, onTapOpen: onTapOpen)
    }
    
    
    
    
}
