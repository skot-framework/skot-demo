//
//  SplashViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import SwiftUI
import shared

final class SplashViewImpl: ScreenViewImpl, SplashView, ObservableObject {
    
    
    override func ui() -> AnyView {
        AnyView(SplashUI(view:self))
    }
    
    
    @Published var title: String = ""
    @Published var message:String  = "mess"
    
   let onTapButton: () -> Void
    let onTapButton2: () -> Void
    
    
    
    
    init(message:String, title:String, onTapButton:@escaping () -> Void, onTapButton2:@escaping () -> Void) {
        self.message = message
        self.title = title
        self.onTapButton = onTapButton
        self.onTapButton2 = onTapButton2
        super.init()
        
        
    }

    
    
    
}
