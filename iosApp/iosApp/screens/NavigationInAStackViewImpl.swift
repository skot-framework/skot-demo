//
//  NavigationInAStackViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import shared
import SwiftUI

class NavigationInAStackViewImpl: ScreenViewImpl, NavigationInStackView, ObservableObject{
    
    let stack: CoreStackView
    let stackImpl:StackViewImpl
    
    let onTapPushScreen: () -> Void
    let onTapBack: () -> Void
    
    init(stack: StackViewImpl, onTapPushScreen:@escaping () -> Void, onTapBack:@escaping () -> Void) {
        self.stack = stack
        self.stackImpl = stack
        self.onTapPushScreen = onTapPushScreen
        self.onTapBack = onTapBack
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(NavigationInAStackUI(state: self))
    }
    
    
}

struct NavigationInAStackUI: View {
    
    @ObservedObject var state: NavigationInAStackViewImpl
    
    var body: some View {
        VStack {
            HStack {
                Button(action: state.onTapPushScreen, label: { Text("Push Screen") } )
                Button(action: state.onTapBack, label: { Text("Back") } )
            }
            state.stackImpl.ui()
                .frame(maxHeight:.infinity)
        }
        
    }
}

