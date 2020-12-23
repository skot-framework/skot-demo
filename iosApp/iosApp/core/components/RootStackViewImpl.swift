//
//  RootStackViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import Foundation
import SwiftUI
import shared

class RootStackViewImpl: ComponentViewImpl, CoreRootStackView, ObservableObject {
    @Published var screens:Array<CoreScreenView>
    
    let bottomSheet: CoreBottomSheetView
    let bottomSheetImpl: BottomSheetViewImpl
    
    init(bottomSheet:BottomSheetViewImpl) {
        screens = Array()
        self.bottomSheet = bottomSheet
        self.bottomSheetImpl = bottomSheet
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(RootStackUI(state:self))
    }
}

struct RootStackUI: View {
    
    @ObservedObject var state: RootStackViewImpl
    
    var body: some View {
        
        ZStack {
            if (state.screens.count % 2 != 0) {
                ZStack {
                    (state.screens.last as? ComponentViewImpl)?.ui()
                }.transition(.move(edge: .bottom))
                .animation(.default)
                
            }
            else {
                (state.screens.last as? ComponentViewImpl)?.ui()
                    .transition(.move(edge: .top)).animation(.default)
                
            }
            
            Spacer()
            
            state.bottomSheetImpl.ui()
        }
        
    }
    
    
}

