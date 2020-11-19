//
//  DemoBaseActionsViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 09/11/2020.
//

import Foundation
import SwiftUI
import shared

final class DemoBaseActionsViewImpl:BaseScreenViewImpl, DemoBaseActionsView {
    
 
    override func ui() -> AnyView {
        AnyView(DemoBaseAcionsUI(view:self))
    }
    
    let onTapBack: () -> Void
    let onTapAlert: () -> Void
    let onTapConfirm: () -> Void
    let onTapSnack: () -> Void
    let onTapShortSnack: () -> Void
    let onTapOpenExternalNavigator: () -> Void
    
    
    init(
        onTapBack:@escaping () -> Void,
        onTapAlert:@escaping () -> Void,
        onTapConfirm:@escaping () -> Void,
        onTapSnack:@escaping () -> Void,
        onTapShortSnack:@escaping () -> Void,
        onTapOpenExternalNavigator:@escaping () -> Void
    ) {
        self.onTapBack = onTapBack
        self.onTapAlert = onTapAlert
        self.onTapConfirm = onTapConfirm
        self.onTapSnack = onTapSnack
        self.onTapShortSnack = onTapShortSnack
        self.onTapOpenExternalNavigator = onTapOpenExternalNavigator
        super.init()
        
    }
}
