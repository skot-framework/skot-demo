//
//  ScreenViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation

import SwiftUI
import shared

var _compteur = Int64(0)
func getKey() -> Int64 {
    _compteur += 1
    return _compteur
}

var screensViewImpl = [Int64 : ScreenViewImpl]()

class ScreenViewImpl: ComponentViewImpl, ContractScreenView, ObservableObject {
    
    @Published var screenToPush:ScreenViewImpl?
    
    func ui() -> AnyView {
        AnyView(ContentView())
    }
    
    
    @objc
    func closeKeyboard() {
        
    }
   
    
    
   
    @objc
    func dismiss() {
        
    }
    
    @objc
    func openScreenWillFinish(screenToOpen: ContractScreenView) {
        print("root will change")
        rootView?.screen = screenToOpen as! BaseScreenViewImpl
    }
    
    @objc
    func showBottomSheetDialog(screen_ screen: ContractScreenView) {
        
    }
    
    let key: Int64 = getKey()
    
    
    override init() {
        super.init()
        screensViewImpl[key] = self
    }
    
    
    var loading: Bool = false
    
    var onBack: (() -> Void)? = nil
    
    private var _onTop: ContractScreenView?
    var onTop: ContractScreenView? {
        get {
            _onTop
        }
        set(newVal) {
            _onTop = newVal
            print("will set ontop to")
            print(newVal ?? "rien")
            screenToPush = newVal as? ScreenViewImpl
        }
    
    }
    

    
 
    
    /*func ui<V:View>() -> V {
        return ContentView() as! V
    }*/
    
   // typealias UIView = ContentView
    
     /*func ui() -> Any {
        return ContentView()
    }*/
    
    
}
