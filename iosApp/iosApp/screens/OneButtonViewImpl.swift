//
//  OnButton.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import Foundation
import SwiftUI
import shared

final class OneButtonViewImpl:ScreenViewImpl, OneButtonView, ObservableObject {
 
    override func ui() -> AnyView {
        AnyView(OneButtonUI(view:self))
    }
    
    let onTapButton: () -> Void
    
    init(onTapButton:@escaping () -> Void) {
        self.onTapButton = onTapButton
        super.init()
        
    }
}
