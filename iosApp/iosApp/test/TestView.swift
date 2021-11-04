//
//  TestView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 04/11/2021.
//

import Foundation
import SwiftUI

struct TestView: View {
    
    @ObservedObject var updater = TestModel()
    
    var body: some View {
            Text("Value is: \(updater.value)")
        }
    
}
