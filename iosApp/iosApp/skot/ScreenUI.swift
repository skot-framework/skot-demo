//
//  BaseUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import SwiftUI

struct ScreenUI: View {
    @State var navBarHidden: Bool = true
    @ObservedObject var screenView: ScreenViewImpl
    
    @State var task: DispatchWorkItem?
    
    var body: some View {
        
        let hasScreenToPush = Binding<Bool>(
            get:{
                screenView.screenToPush != nil
            },
            set:{ _ in
                screenView.screenToPush = nil
            })
        
        return NavigationView {
                VStack {
                    if (screenView.screenToPush != nil) {
                        NavigationLink(
                            destination:
                                ScreenUI(screenView: screenView.screenToPush!)                            ,
                            isActive:hasScreenToPush
                            , label:{
                                EmptyView()
                            })
                    }
                    screenView.ui()
                }
            .navigationTitle("")
            .navigationBarHidden(true)
            .navigationBarBackButtonHidden(true)
        }
        .navigationTitle("")
        .navigationBarHidden(true)
        .navigationBarBackButtonHidden(true)
        
        

        
        /*.alert(isPresented: Binding<Bool> {
         get { view.presentAlert }
         set { value in view.presentAlert = value }
         }, content: {
         Alert(title: Text("Are you sure?"),
         message: Text("Do you want to dismiss the view?"))
         })*/
        
    }
}

struct BaseUI_Previews: PreviewProvider {
    static var previews: some View {
        let splash = SplashViewImpl(message: "Test")
        return BaseUI(screenView:splash)
    }
}
