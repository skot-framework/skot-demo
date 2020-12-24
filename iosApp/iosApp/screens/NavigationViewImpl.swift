//
//  NavigationViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class NavigationViewImpl: ScreenViewImpl, shared.NavigationView, ObservableObject{
    let onTapOpenModale: () -> Void
    let onTapToPager: () -> Void
    
    init(onTapOpenModale:@escaping () -> Void, onTapToPager:@escaping () -> Void) {
        self.onTapOpenModale = onTapOpenModale
        self.onTapToPager = onTapToPager
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
            Button(action: state.onTapToPager, label: { Text("Exemple de Pager") } )
        }
        
    }
}
