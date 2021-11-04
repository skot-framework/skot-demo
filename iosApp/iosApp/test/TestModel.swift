//
//  TestModel.swift
//  iosApp
//
//  Created by Mathieu Scotet on 04/11/2021.
//

import Foundation
import SwiftUI

class TestModel: ObservableObject {
    
    @Published var value = 0

        init() {
            for i in 1...10 {
                DispatchQueue.main.asyncAfter(deadline: .now() + Double(i)) {
                    self.value += 1
                    print("New val \(self.value)")
                }
            }
        }
    
}
