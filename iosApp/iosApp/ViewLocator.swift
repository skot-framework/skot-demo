//
//  ViewLocator.swift
//  iosApp
//
//  Created by Mathieu Scotet on 23/11/2021.
//

import Foundation
import SwiftUI

struct ViewLocator {
    
    
    @ViewBuilder func getView(proxy:SKComponentViewProxy) -> some View {
        switch proxy {
        case is SplashViewProxy:
            (proxy as! SplashViewProxy).ui()
        case is OnTopViewProxy:
            (proxy as! OnTopViewProxy).ui()
        case is CatalogItemViewProxy:
            (proxy as! CatalogItemViewProxy).ui()
        case is BurgerScreenViewProxy:
            (proxy as! BurgerScreenViewProxy).ui()
        default:
            Text("Vue inconnue")
        }
    }
    
}
