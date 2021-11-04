//
//  iosAppApp.swift
//  iosApp
//
//  Created by Mathieu Scotet on 19/10/2021.
//

import SwiftUI
import shared


@main
struct iosAppApp: App {
    
    let rootStack:SKStackViewProxy
    
    init() {
        print("Initialization ...")
        StarterIosKt.doInitInjector(viewInjector: ViewInjectorImpl(), coreViewInjector: CoreViewInjectorImpl())
        print("--- injector initialized")
        rootStack = StarterIosKt.startIos().view as! SKStackViewProxy
       // print(TestKMMKt.coco())
       // print(Test.coucou())
        
        
        
    }
    
    var body: some Scene {
        WindowGroup {
            //TestView(updater: TestModel())
            rootStack.ui()
        }
    }
}
