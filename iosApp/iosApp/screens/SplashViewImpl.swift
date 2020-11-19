//
//  SplashViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import SwiftUI
import shared
import Combine

final class SplashViewImpl: BaseScreenViewImpl, SplashView  {
    
    
    override func ui() -> AnyView {
        AnyView(SplashUI(view:self))
    }
    
    
    @Published var message:String  = "" {
        willSet {
            self.objectWillChange.send()
        }
    }
    
    
    
    private var cancellableSet = Set<AnyCancellable>()
    
    
    init(message:String) {
        self.message = message
        super.init()
    }


}

