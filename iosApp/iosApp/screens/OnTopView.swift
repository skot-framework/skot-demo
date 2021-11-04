//
//  OnTopView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 04/11/2021.
//

import Foundation
import SwiftUI
import shared

class OnTopViewProxy:SKScreenViewProxy,OnTopVC, ObservableObject {
    
    let btnClose: ViewcontractSKButtonVC
    let btnCloseProxy: SKButtonViewProxy
    
    
    
    init(visibilityListener: ViewcontractSKVisiblityListener, btnClose: SKButtonViewProxy) {
        self.btnClose = btnClose
        self.btnCloseProxy = btnClose
        super.init(visibilityListener: visibilityListener)
    }
    

    override func ui() -> AnyView {
        AnyView(OnTopView(proxy:self))
    }
  
}

struct OnTopView:View {
    
    @ObservedObject var proxy:OnTopViewProxy
    
    var body: some View {
        VStack {
            Text("ONTOP")
            proxy.btnCloseProxy.ui()
           /* Button(action: proxy.onTapClose, label: {
                Text("close")
            })*/
        }
    }
    
}
