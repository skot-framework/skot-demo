//
//  OnButton.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import Foundation
import SwiftUI
import shared

final class OneButtonViewImpl:BaseScreenViewImpl, OneButtonView {
    
 
    override func ui() -> AnyView {
        AnyView(OneButtonUI(view:self))
    }
    
    let onTapButton: () -> Void
    let onTapDemoBaseActions: () -> Void
    
    
    init(onTapButton:@escaping () -> Void, onTapDemoBaseActions:@escaping () -> Void) {
        self.onTapButton = onTapButton
        self.onTapDemoBaseActions = onTapDemoBaseActions
        super.init()
        
    }
}
