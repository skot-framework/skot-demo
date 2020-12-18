//
//  AlertViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class AlertViewImpl: ComponentViewImpl, AlertView , ObservableObject{
    
    @Published var state:AlertViewShown?
    
    override func ui() -> AnyView {
        AnyView(AlertUI(state:self))
    }
    
}


struct AlertUI:View {
    @ObservedObject var state: AlertViewImpl
    
    var body: some View {
        VStack{}
            .alert(isPresented: Binding<Bool>(
                    get: { state.state != nil },
                    set :{ value in state.state?.onDismissRequest?.self() })
            , content: {
                Alert(title: Text(state.state?.title ?? ""), message: Text(state.state?.message ?? ""))
                
            })
        
    }
}
