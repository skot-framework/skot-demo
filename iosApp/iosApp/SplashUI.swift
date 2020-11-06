//
//  SplashUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import SwiftUI

struct SplashUI: View {
    @ObservedObject var view:SplashViewImpl
    
   /* let showAlert = Binding<Bool> {
        get { view.presentAlert }
        set { value in view.presentAlert = value }
    }
    */
    var body: some View {
        
        return VStack {
            Text(view.title)
            Text(view.message)
            Button(action: {
                view.onTapButton()
            }, label: {
                /*@START_MENU_TOKEN@*/Text("Button")/*@END_MENU_TOKEN@*/
            })
        }.alert(isPresented: Binding<Bool> {
            get { view.presentAlert }
            set { value in view.presentAlert = value }
        }, content: {
            Alert(title: Text("Are you sure?"),
                  message: Text("Do you want to dismiss the view?"))
        })
        
    }
}

struct SplashUI_Previews: PreviewProvider {
    static var previews: some View {
        SplashUI(
            view: SplashViewImpl(message: "message", title: "Titre", onTapButton: {
                print("coucou")
            }))
    }
}
