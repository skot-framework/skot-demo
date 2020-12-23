//
//  BottomSheetViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import shared
import SwiftUI

class BottomSheetViewImpl: ComponentViewImpl, CoreBottomSheetView , ObservableObject{
    
    func onDismiss() {
        state = nil
    }
    
    
    @Published var state:CoreBottomSheetViewShown?
    
    override func ui() -> AnyView {
        AnyView(BottomSheetUI(state:self))
    }
    
}


struct BottomSheetUI:View {
    @ObservedObject var state: BottomSheetViewImpl
    
    var body: some View {
        /*VStack{
        }.sheet(isPresented: Binding<Bool>(
                    get: { state.state != nil },
                    set :{ value in state.onDismiss() })) {
            (state.state?.screen as! ScreenViewImpl).ui()
        }*/
        
        
        if let sheetState = state.state {
            VStack{
                VStack{
                 
                }.frame(maxWidth: .infinity, maxHeight: .infinity)
                .background(Color(Color.RGBColorSpace.sRGB, red: 0.5, green: 0.5, blue: 0.5, opacity: 0.5))
                    .onTapGesture {
                    state.onDismiss()
                }
                (sheetState.screen as! ScreenViewImpl).ui()
                    .frame(maxWidth: .infinity)
                    
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            
            .animation(.easeIn)
                //.background(Color.init(Color.RGBColorSpace.sRGB, red: 66, green: 66, blue: 66, opacity: 0.8))
            
        }
        
        /*VStack{}
            .alert(isPresented: Binding<Bool>(
                    get: { state.state != nil },
                    set :{ value in state.state?.onDismissRequest?.self() })
            , content: {
                Alert(title: Text(state.state?.title ?? ""), message: Text(state.state?.message ?? ""))
                
            })
        */
    }
}
