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
    
    
    @Published var message:String  = ""
    
    
    init(message:String) {
        self.message = message
        super.init()
    }
    
}
