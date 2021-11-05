//
//  ViewInjectorImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 03/11/2021.
//

import Foundation
import shared

class ViewInjectorImpl: ViewInjector {
    func burgerScreen(visibilityListener: ViewcontractSKVisiblityListener, burgerList: ViewcontractSKListVC, loader: ViewcontractSKLoaderVC, toBasket: ViewcontractSKButtonVC) -> BurgerScreenVC {
        return BurgerScreenViewProxy(visibilityListener: visibilityListener, burgerList: burgerList as! SKListViewProxy, loader: loader as! SKLoaderViewProxy, toBasket: toBasket as! SKButtonViewProxy )
    }
    
    func catalogItem(imageUrl: String, label: String, onClickAdd: @escaping () -> Void, price: String) -> CatalogItemVC {
        return CatalogItemViewProxy(imageUrl: imageUrl, label: label, onClickAdd: onClickAdd, price: price)
    }
    

    
    func onTop(visibilityListener: ViewcontractSKVisiblityListener, btnBurger: ViewcontractSKButtonVC, btnClose: ViewcontractSKButtonVC) -> OnTopVC {
        return OnTopViewProxy(visibilityListener: visibilityListener, btnBurger: btnBurger as! SKButtonViewProxy, btnClose: btnClose as! SKButtonViewProxy)
    }
    
    func splash(visibilityListener: ViewcontractSKVisiblityListener, onTapOpenOnTopScreen: @escaping () -> Void, messageInitial: String) -> SplashVC {
        return SplashViewProxy(visibilityListener: visibilityListener, onTapOpenOnTopScreen: onTapOpenOnTopScreen, messageInitial: messageInitial)
    }

   
    
}
