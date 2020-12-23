//
//  iosAppApp.swift
//  iosApp
//
//  Created by Mathieu Scotet on 04/11/2020.
//

import SwiftUI
import shared



@main
struct iosAppApp: App {
    
    var rootStack:CoreRootStack
    
    init() {
        print("------!!!!------ init")
        rootStack = StarterKt.start(viewInjector: ViewInjectorImpl(), coreViewInjector: CoreViewInjectorImpl())
        print("------!!!!------ init done")
    }
    
    
    var body: some Scene {
        WindowGroup {
            
            (rootStack.view as! RootStackViewImpl).ui()
            //(StartKt.root?.view as! RootViewImpl).ui()
            //SplashUI(state: Splash().view as! SplashViewImpl)
           // (Splash().view as! SplashViewImpl).ui()
            
            
            //RootUI(root: rootView!)
            //router()
            //SplashViewImpl()
            //let screenView = screensViewImpl[Int64(1)]!
            //(screenView as! SplashViewImpl).ui
            //SplashUI(view: screenView as! SplashViewImpl)
            //screenView.ui()
            
            
            //SplashViewImpl(message:"message intial", title: "Titre initial").ui() as! ()
        }
    }
}
