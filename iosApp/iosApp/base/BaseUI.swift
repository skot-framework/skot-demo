//
//  BaseUI.swift
//  iosApp
//
//  Created by Mathieu Scotet on 08/11/2020.
//

import SwiftUI

struct BaseUI: View {
    @State var navBarHidden: Bool = true
    @ObservedObject var screenView: BaseScreenViewImpl
    
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
            ZStack{
                VStack {
                    if (screenView.screenToPush != nil) {
                        NavigationLink(
                            destination:
                                BaseUI(screenView: screenView.screenToPush!)                            ,
                            isActive:hasScreenToPush
                            , label:{
                                EmptyView()
                            })
                    }
                    screenView.ui()
                }
                if let snack = screenView.act_snack {
                    VStack {
                        HStack {
                            Text(snack.message)
                                .foregroundColor(Color.white)
                                .padding()
                            Spacer()
                        }.background(Color.gray)
                        
                        Spacer()
                            .padding()
                    }
                    .animation(.easeInOut(duration: 1.2))
                    .transition(AnyTransition.move(edge: .top).combined(with: .opacity))
                    .onAppear {
                      //  self.task?.cancel()
                        self.task = DispatchWorkItem {
                        //    withAnimation {
                                self.screenView.act_snack = nil
                          //  }
                        }
                        // Auto dismiss after 5 seconds, and cancel the task if view disappear before the auto dismiss
                        let presentedTime: Double
                        if (snack.isLong) {
                            presentedTime = 5} else {
                                presentedTime = 2}
                        
                        DispatchQueue.main.asyncAfter(deadline: .now() + presentedTime, execute: self.task!)
                    }
                    .onDisappear {
                        self.task?.cancel()
                    }
                    
                }
            }
            .navigationTitle("")
            .navigationBarHidden(true)
            .navigationBarBackButtonHidden(true)
        }
        .navigationTitle("")
        .navigationBarHidden(true)
        .navigationBarBackButtonHidden(true)
        
        
        .alert(isPresented: Binding<Bool>(
            get: { screenView.act_alert != nil },
            set: { newVal in
                if (!newVal) {
                    screenView.act_alert = nil}
            }
        ), content: {
            let messageText:Text?  = {
                if let messT = screenView.act_alert?.message {
                    return Text(messT)
                }
                else {
                    return nil
                }
            }()
            return Alert(
                title: Text(screenView.act_alert?.title ?? ""),
                message: messageText,
                dismissButton: Alert.Button.default(Text("Ok"), action: {
                    screenView.act_alert?.onOk?()
                }))
        })
        
        
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
