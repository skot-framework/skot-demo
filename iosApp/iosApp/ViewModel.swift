//
//  ViewModel.swift
//  iosApp
//
//  Created by Mathieu Scotet on 06/11/2020.
//

import Foundation

class ViewModel: ObservableObject {

    @Published var titre:String = "Titre initial view Model"
    
    init() {
        //super.init()
        DispatchQueue.main.asyncAfter(deadline: .now() + 4.0) {
            self.titre = "Titre view model modifié"
        }
    }

}
