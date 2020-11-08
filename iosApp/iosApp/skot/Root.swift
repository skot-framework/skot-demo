//
//  Root.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import Foundation

class Root: ObservableObject {
    
    @Published var screen:ScreenViewImpl
    //@Published var oneScreenToPush:Bool = false
    
    init(startScreen:ScreenViewImpl) {
        screen = startScreen
    }
}

var rootView:Root?
