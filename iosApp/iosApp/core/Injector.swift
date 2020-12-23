//
//  Injector.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import Foundation
import shared

class CoreViewInjectorImpl: CoreCoreViewInjector {
    func alert() -> CoreAlertView {
        return AlertViewImpl()
    }
    
    func bottomSheet() -> CoreBottomSheetView {
        return BottomSheetViewImpl()
    }
    
    func rootStack(bottomSheetView: CoreBottomSheetView) -> CoreRootStackView {
        return RootStackViewImpl(bottomSheet: bottomSheetView as! BottomSheetViewImpl)
    }
    
    
    func snackBar() -> CoreSnackBarView {
        return SnackBarViewImpl()
    }
    
    func stack() -> CoreStackView {
        return StackViewImpl()
    }
    
    
}
