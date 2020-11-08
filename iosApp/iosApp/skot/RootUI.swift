//
//  RootUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import SwiftUI

struct RootUI: View {
    @ObservedObject var root:Root
    
    /*private var ob:Binding<Bool> = Binding<Bool>(
        get:{
            self.root.screenToPush != nil
        },
        set:{_ in
            self.root.screenToPush = nil
        })
    
    @State private var oneScreenToPush:Bool {
        get {
            root.screenToPush != nil
        }
        set {
            root.screenToPush = nil
        }
    }*/
    
    @State var navBarHidden: Bool = true
    
    var body: some View {
        
        let bdtp = Binding<Bool>(
        get:{
            root.screenToPush != nil
            },
        set:{ _ in
                root.screenToPush = nil
            })
            
        return NavigationView {
            VStack {
                NavigationLink(
                    destination: root.screenToPush?.ui()
                        .navigationTitle("")
                        .navigationBarHidden(true)
                        .navigationBarBackButtonHidden(true),
                    isActive:bdtp
                    , label:{
                    EmptyView()
                })
                root.screen.ui()
                    .navigationTitle("")
                    .navigationBarHidden(true)
                    .navigationBarBackButtonHidden(true)
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

struct RootUI_Previews: PreviewProvider {
    static var previews: some View {
        RootUI(root: Root(startScreen: SplashViewImpl(message:"Test")))
    }
}
