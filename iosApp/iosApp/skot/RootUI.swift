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
        
    
        return NavigationView {
            BaseUI(screenView: root.screen)
                .navigationTitle("")
                .navigationBarHidden(true)
                .navigationBarBackButtonHidden(true)
            
    }
    }
}

struct RootUI_Previews: PreviewProvider {
    static var previews: some View {
        RootUI(root: Root(startScreen: SplashViewImpl(message:"Test")))
    }
}
