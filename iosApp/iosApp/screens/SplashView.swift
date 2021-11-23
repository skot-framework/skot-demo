//
//  SplashView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 03/11/2021.
//

import Foundation
import shared
import SwiftUI

class SplashViewProxy:SKScreenViewProxy,SplashVC, ObservableObject {
    
    let onTapOpenOnTopScreen: () -> Void
    @Published var message: String
    
    
    init(visibilityListener: ViewcontractSKVisiblityListener, onTapOpenOnTopScreen: @escaping () -> Void, messageInitial: String) {
        self.message = messageInitial
        self.onTapOpenOnTopScreen = onTapOpenOnTopScreen
        super.init(visibilityListener: visibilityListener)
    }
    
    func ui() -> SplashView {
        SplashView(proxy:self)
    }
}

struct SplashView:View {
    
    @ObservedObject var proxy:SplashViewProxy
    
 
    var body: some View {
        VStack {
            //Text("SkotiOs !")
            Text(proxy.message)
            Button(action: proxy.onTapOpenOnTopScreen, label:{
                Text("Open on top")
            })
            //Text(proxy.message)
        }
        
    }
    
}
