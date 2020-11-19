//
//  DemoBaseActionsUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 09/11/2020.
//

import SwiftUI

struct DemoBaseAcionsUI: View {
    @ObservedObject var view:DemoBaseActionsViewImpl
    
    var body: some View {
        VStack {
            HStack {
                Button(action: {
                    view.onTapBack()
                } ) {
                    Image(systemName: "chevron.left")
                }.padding()
                Spacer()
                Text("BaseActions")
            }.padding()
            Text("Démo des actions de bases définies dans BaseActions")
            Button(action: { view.onTapAlert()}, label: {Text("Afficher une alerte")})
            Button(action: { view.onTapConfirm()}, label: {Text("Demander une confirmation")})
            Button(action: { view.onTapSnack()}, label: {Text("Afficher un snack")})
            Button(action: { view.onTapShortSnack()}, label: {Text("Afficher un snack court")})
            Button(action: { view.onTapOpenExternalNavigator()}, label: {Text("Ouvrir un navigateur externe")})
            Spacer()
            
        }
        
    }
}

struct DemoBaseAcionsUI_Previews: PreviewProvider {
    static var previews: some View {
        DemoBaseAcionsUI(view: DemoBaseActionsViewImpl(
            onTapBack: { print("onTapBack") },
            onTapAlert: { print("onTapAlert") },
            onTapConfirm: { print("onTapConfirm") },
            onTapSnack: { print("onTapSnack") },
            onTapShortSnack: { print("onTapShortSnack") },
            onTapOpenExternalNavigator: { print("onTapOpenExternalNavigator") }
            ))
    }
}
