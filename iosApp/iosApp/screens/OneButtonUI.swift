//
//  OneButtonUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import SwiftUI

struct OneButtonUI: View {
    @ObservedObject var view:OneButtonViewImpl
    
    var body: some View {
        VStack {
            Text("Un bouton")
            Button(action: {
                view.onTapButton()
            }, label: {
                Text("Ouvrir un écran par dessus")
            })
            Button(action: {
                view.onTapDemoBaseActions()
            }, label: {
                Text("Démo des actions de base")
            })
        }
        
    }
}

struct OneButtonUI_Previews: PreviewProvider {
    static var previews: some View {
        OneButtonUI(view: OneButtonViewImpl(
                        onTapButton: {
            print("onTapButton")
        }, onTapDemoBaseActions: {
            print("onTapDemoBaseActions")
        }))
    }
}
