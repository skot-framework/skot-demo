//
//  TestUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 01/12/2020.
//

import SwiftUI


class TestVM : ObservableObject {
    
    @Published
    var message:String
    
    init() {
        self.message = "départ"
        DispatchQueue.main.asyncAfter(deadline: .now() + 6, execute: {
            self.message = "message modifié au bout de 6 secondes"
        })
    }
    
}

struct TestUI: View {
    
    @ObservedObject
    var vm:TestVM
    
    var body: some View {
        Text(/*@START_MENU_TOKEN@*/"Hello, World!"/*@END_MENU_TOKEN@*/)
        Text(vm.message)
    }
}

struct TestUI_Previews: PreviewProvider {
    static var previews: some View {
        TestUI(vm:TestVM())
    }
}
