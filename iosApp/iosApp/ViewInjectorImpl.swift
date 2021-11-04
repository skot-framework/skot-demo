//
//  ViewInjectorImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 03/11/2021.
//

import Foundation
import shared

class ViewInjectorImpl: ViewInjector {
    func onTop(visibilityListener: ViewcontractSKVisiblityListener, btnClose: ViewcontractSKButtonVC) -> OnTopVC {
        return OnTopViewProxy(visibilityListener: visibilityListener, btnClose: btnClose as! SKButtonViewProxy)
    }
    
    func splash(visibilityListener: ViewcontractSKVisiblityListener, onTapOpenOnTopScreen: @escaping () -> Void, messageInitial: String) -> SplashVC {
        return SplashViewProxy(visibilityListener: visibilityListener, onTapOpenOnTopScreen: onTapOpenOnTopScreen, messageInitial: messageInitial)
    }
    
   /* func onTop(visibilityListener: ViewcontractSKVisiblityListener, onTapClose: @escaping () -> Void) -> OnTopVC {
        return OnTopViewProxy(visibilityListener: visibilityListener, onTapClose: onTapClose)
    }*/
    
    
   
    
}
