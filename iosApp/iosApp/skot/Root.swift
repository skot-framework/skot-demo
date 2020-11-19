//
//  Root.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import Foundation

class Root: ObservableObject {
    
    @Published var screen:BaseScreenViewImpl
    //@Published var oneScreenToPush:Bool = false
    
    init(startScreen:BaseScreenViewImpl) {
        screen = startScreen
    }
}

var rootView:Root?
