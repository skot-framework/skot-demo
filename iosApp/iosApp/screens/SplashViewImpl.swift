//
//  SplashViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import Foundation
import SwiftUI
import shared
import Combine


class SplashViewImpl: ScreenViewImpl, SplashView, ObservableObject {
    
    
    @Published
    var message: String
    
    
    override func ui() -> AnyView {
        AnyView(SplashUI(state:self))
    }
    
    init(message:String) {
        self.message = message
        super.init()
    }
    
}


struct SplashUI: View {
    
    @ObservedObject var state:SplashViewImpl
    
    var body: some View {
        
        VStack {
            Text(state.message)
        }
    }
    
    
}
