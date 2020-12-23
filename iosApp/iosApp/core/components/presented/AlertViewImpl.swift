//
//  AlertViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class AlertViewImpl: ComponentViewImpl, CoreAlertView , ObservableObject{
    
    func onDismiss() {
        state = nil
    }
    
    @Published var state:CoreAlertViewShown?
    
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
                    set :{ value in state.onDismiss() })
            , content: {
                if let alertState = state.state {
                    let title = Text(alertState.title ?? "")
                    let message = Text(alertState.message ?? "")
                    let mainButton = Alert.Button.default(Text(alertState.mainButton.label), action: {
                        alertState.mainButton.action?.self()
                    })
                    if let secondButton = alertState.secondaryButton {
                        return  Alert(title: title, message: message, primaryButton: mainButton, secondaryButton: Alert.Button.default(Text(secondButton.label), action: secondButton.action))
                    }
                    else {
                        return  Alert(title: title, message: message, dismissButton: mainButton)
                    }
                    
                }
                else {
                    return Alert(title: Text("Problème"), message: Text("Problème"), dismissButton: nil)
                }
                
                
            })
        
    }
}
