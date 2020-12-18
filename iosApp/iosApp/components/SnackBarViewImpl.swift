//
//  SnackBarViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class SnackBarViewImpl: ComponentViewImpl, SnackBarView, ObservableObject {
    
    @Published var state:SnackBarViewShown?
    
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
            }.background(Color.blue).foregroundColor(Color.white)
            .padding(12)
            .frame(alignment:.top)
        }
        
    }
}
