//
//  SplashViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import SwiftUI
import shared

class SplashViewImpl: ScreenViewImpl, SplashView, ObservableObject {
    
 
    @Published var title: String = ""
    @Published var message:String  = "mess"
    
   let onTapButton: () -> Void
    
    
    
    
    init(message:String, title:String, onTapButton:@escaping () -> Void) {
        self.message = message
        self.title = title
        self.onTapButton = onTapButton
        super.init()
        
        
    }

    
    
    
}
