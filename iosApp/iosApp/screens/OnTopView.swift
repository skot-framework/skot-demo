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
    
    let btnBurger: ViewcontractSKButtonVC
    let btnBurgerProxy: SKButtonViewProxy
    
    
    init(visibilityListener: ViewcontractSKVisiblityListener, btnBurger: SKButtonViewProxy, btnClose: SKButtonViewProxy) {
        self.btnClose = btnClose
        self.btnCloseProxy = btnClose
        self.btnBurger = btnBurger
        self.btnBurgerProxy = btnBurger
        
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
            /*Button(action:proxy.btnCloseProxy.onTap ?? {}) {
                Text(proxy.btnCloseProxy.label ?? "")
                Image(systemName: "chevron.up")
            }*/
            proxy.btnCloseProxy.ui()
                .foregroundColor(SwiftUI.Color.green)
                .overlay(
                    Capsule().stroke(Color.blue, lineWidth: 2)
                )
            proxy.btnBurgerProxy.ui()
        }
    }
    
}
