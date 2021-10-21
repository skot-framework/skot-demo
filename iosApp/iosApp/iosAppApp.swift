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
    
    init() {
        print("Initialisation ....")
        StarterIosKt.doInitInjector()
        print(TestKMMKt.coco())
       // print(Test.coucou())
        
    }
    
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}
