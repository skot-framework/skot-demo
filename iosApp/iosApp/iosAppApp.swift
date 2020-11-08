//
//  iosAppApp.swift
//  iosApp
//
//  Created by Mathieu Scotet on 04/11/2020.
//

import SwiftUI
import shared


let vm = ViewModel()

@main
struct iosAppApp: App {
    
    init() {
        StarterKt.start(viewInjector: ViewInjectorImpl())
    
        Greeting().greetingCor()
        let spl = Splash()
    }
    
    
    var body: some Scene {
        WindowGroup {
            
            //router()
            //SplashViewImpl()
            let screenView = screensViewImpl[Int64(1)]!
            //(screenView as! SplashViewImpl).ui
            //SplashUI(view: screenView as! SplashViewImpl)
            screenView.ui()
            
            
            //SplashViewImpl(message:"message intial", title: "Titre initial").ui() as! ()
        }
    }
}
