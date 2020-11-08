//
//  BaseUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import SwiftUI

struct BaseUI: View {
    @State var navBarHidden: Bool = true
    @ObservedObject var screenView:ScreenViewImpl
    
    var body: some View {
        
        let bdtp = Binding<Bool>(
        get:{
            screenView.screenToPush != nil
            },
        set:{ _ in
            screenView.screenToPush = nil
            })
            
        return NavigationView {
            VStack {
                NavigationLink(
                    destination: screenView.screenToPush?.ui()
                        .navigationTitle("")
                        .navigationBarHidden(true)
                        .navigationBarBackButtonHidden(true),
                    isActive:bdtp
                    , label:{
                    EmptyView()
                })
                screenView.ui()
                     
            }
            
        }
        .navigationTitle("")
        .navigationBarHidden(true)
        .navigationBarBackButtonHidden(true)
        /*.navigationBarTitle("")
                .navigationBarHidden(self.navBarHidden)
                .onReceive(NotificationCenter.default.publisher(for: UIApplication.willEnterForegroundNotification)) { _ in
                    self.navBarHidden = true
                }
                .onReceive(NotificationCenter.default.publisher(for: UIApplication.willResignActiveNotification)) { _ in
                    self.navBarHidden = false
                }*/
        
    }
}

struct BaseUI_Previews: PreviewProvider {
    static var previews: some View {
        BaseUI(screenView: SplashViewImpl(message: "Test"))
    }
}
