//
//  StackViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI




class StackViewImpl: ComponentViewImpl, CoreStackView, ObservableObject {

    
    @Published var screens:Array<CoreScreenView>
    
    override init() {
        screens = Array()
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(StackUI(state:self))
    }
    
}


struct StackUI: View {
    
    @ObservedObject var state: StackViewImpl
    
    var body: some View {
        
    
    if (state.screens.count % 2 != 0) {
            ZStack {
                (state.screens.last as? ComponentViewImpl)?.ui()
            }.transition(.slide)
            .animation(.default)
        }
        else {
            (state.screens.last as? ComponentViewImpl)?.ui()
                .transition(.slide).animation(.default)
        }
        
    }
}

/*struct StackViewImpl: View {
    var body: some View {
        Text(/*@START_MENU_TOKEN@*/"Hello, World!"/*@END_MENU_TOKEN@*/)
    }
}

struct StackViewImpl_Previews: PreviewProvider {
    static var previews: some View {
        StackViewImpl()
    }
}
*/
