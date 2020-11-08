//
//  WithBackScreenUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import SwiftUI

struct WithBackScreenUI: View {
    @ObservedObject var view:WithBackScreenViewImpl
    
    var body: some View {
        VStack {
            HStack {
                Button(action: {
                    view.onTapBack()
                } ) {
                    Image(systemName: "chevron.left")
                }.padding()
                Spacer()
                Text("Ecran avec back")
            }.padding()
            Button(action: {
                view.onTapOpen()
            }, label: {
                Text("Ouvre une autre instance du même écran")
            })
            Spacer()
            Text(view.key.description)
            
        }
        
    }
}

struct WithBackScreenUI_Previews: PreviewProvider {
    static var previews: some View {
        WithBackScreenUI(view: WithBackScreenViewImpl(onTapBack: {
            print("onTapBack")
        }, onTapOpen: {
            print("onTapOpen")
        }))
    }
}
