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
    
    init() {
        StarterKt.start(viewInjector: ViewInjectorImpl())
    }
    
    
    var body: some Scene {
        WindowGroup {
            (StartKt.root?.view as! RootViewImpl).ui()
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
