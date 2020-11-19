//
//  WithBackScreen.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import Foundation
import SwiftUI
import shared

final class WithBackScreenViewImpl:BaseScreenViewImpl, WithBackScreenView {
 
    override func ui() -> AnyView {
        AnyView(WithBackScreenUI(view:self))
    }
    
    let onTapBack: () -> Void
    let onTapOpen: () -> Void
    
    init(onTapBack:@escaping () -> Void, onTapOpen:@escaping () -> Void) {
        self.onTapBack = onTapBack
        self.onTapOpen = onTapOpen
        super.init()
        
    }
}
