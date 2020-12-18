//
//  NavigationViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class NavigationViewImpl: ComponentViewImpl, shared.NavigationView, ObservableObject{
    let onTapOpenModale: () -> Void
    
    init(onTapOpenModale:@escaping () -> Void) {
        self.onTapOpenModale = onTapOpenModale
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(NavigationUI(state: self))
    }
    
    
}

struct NavigationUI: View {
    
    @ObservedObject var state: NavigationViewImpl
    
    var body: some View {
        VStack {
            Button(action: state.onTapOpenModale, label: { Text("Ouvre une modale !") } )
        }
        
    }
}
