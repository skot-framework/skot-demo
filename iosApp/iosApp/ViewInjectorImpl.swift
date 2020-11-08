//
//  ViewInjectorImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import shared

class ViewInjectorImpl: ViewInjector {
    func splash(message: String, onTapButton: @escaping () -> Void, onTapButton2: @escaping () -> Void, title: String) -> SplashView {
        return SplashViewImpl(message: message, title: title, onTapButton:onTapButton, onTapButton2: onTapButton2)
    }
    
    
    
    
}
