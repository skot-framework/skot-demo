//
//  SnackBarViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class SnackBarViewImpl: ComponentViewImpl, CoreSnackBarView, ObservableObject {
    
    func onDismiss() {
        state = nil
    }
    
    @Published var state:CoreSnackBarViewShown?
    
    override func ui() -> AnyView {
        AnyView(SnackBarUI(state:self))
    }
    
    
}

struct SnackBarUI:View {
    @ObservedObject var state: SnackBarViewImpl
    
    var body: some View {
        
        if let sta = state.state {
            HStack {
                Text(sta.message)
                    .frame(maxWidth:.infinity)
                if let action = sta.action {
                    Button(action: {action.action()
                        state.onDismiss()
                    }, label: {
                        Text(action.label)
                    })
                }
            }.background(Color.blue).foregroundColor(Color.white)
            .frame(maxWidth:.infinity, alignment:.top)
        }
        
    }
}
