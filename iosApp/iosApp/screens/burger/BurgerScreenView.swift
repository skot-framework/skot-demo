//
//  BurgerScreenView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2021.
//

import Foundation
import shared
import SwiftUI


class BurgerScreenViewProxy:SKScreenViewProxy,BurgerScreenVC, ObservableObject {
    
    let toBasket: ViewcontractSKButtonVC
    let toBasketProxy: SKButtonViewProxy
    
    
    let burgerList: ViewcontractSKListVC
    let burgerListProxy: SKListViewProxy
    
    let loader: ViewcontractSKLoaderVC
    let loaderProxy: SKLoaderViewProxy
    
    init(visibilityListener: ViewcontractSKVisiblityListener, burgerList: SKListViewProxy, loader: SKLoaderViewProxy, toBasket: SKButtonViewProxy) {
        self.toBasket = toBasket
        self.toBasketProxy = toBasket
        self.burgerList = burgerList
        self.burgerListProxy = burgerList
        self.loader = loader
        self.loaderProxy = loader
        super.init(visibilityListener: visibilityListener)
        
    }
    
    func ui() -> BurgerScreenView {
        BurgerScreenView(proxy:self)
    }
    
    
}

struct BurgerScreenView: View {
    
    @ObservedObject var proxy:BurgerScreenViewProxy
    
 
    var body: some View {
        VStack {
            proxy.burgerListProxy.ui()
            Spacer()
            proxy.toBasketProxy.ui()
        }
        
    }
}
