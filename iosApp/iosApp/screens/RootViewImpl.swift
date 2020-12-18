//
//  RootViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import Foundation
import SwiftUI
import shared


final class RootViewImpl: ComponentViewImpl, RootView, ObservableObject {
    
    
    
    let stackImpl: StackViewImpl
    let stack: StackView
    
    
    init(stack: StackViewImpl) {
        self.stack = stack
        self.stackImpl = stack
        super.init()
    }
    
    
    override func ui() -> AnyView {
        AnyView(RootUI(state:self))
    }
    
}


struct RootUI: View {
    
    @ObservedObject var state:RootViewImpl
    
    var body: some View {
        state.stackImpl.ui()
    }
    
    
}
