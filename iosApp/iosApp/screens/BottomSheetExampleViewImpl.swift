//
//  BottomSheetExampleViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import SwiftUI
import shared

class BottomSheetExampleViewImpl: ScreenViewImpl, BottomSheetExampleView, ObservableObject {
    let onTapDismiss: () -> Void
    
    init(onTapDismiss:@escaping () -> Void) {
        self.onTapDismiss = onTapDismiss
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(BottomSheetExampleUI(state: self))
    }
    
}

struct BottomSheetExampleUI: View {
    
    @ObservedObject var state: BottomSheetExampleViewImpl
    
    var body: some View {
        VStack {
            Text("Bottom Sheet")
            Button(action: state.onTapDismiss, label: { Text("Dismiss") } )
        }
        
    }
}

