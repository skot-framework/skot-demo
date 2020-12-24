//
//  PagerViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 24/12/2020.
//

import shared
import SwiftUI




class PagerViewImpl: ComponentViewImpl, CorePagerView, ObservableObject {
    
    let screens:Array<CoreScreenView>
    let screensImpl:Array<ScreenViewImpl>
    @Published var selectedPageIndex: Int32 {
        didSet {
            onSwipeToPage?.self(KotlinInt(value: selectedPageIndex))
        }
    }
    let onSwipeToPage: ((KotlinInt) -> Void)?
    
    

    
    
    init(screens:Array<ScreenViewImpl>, initialSelectedPageIndex:Int32, onSwipeToPage: ((KotlinInt) -> Void)?) {
        self.screens = screens
        self.screensImpl = screens
        self.selectedPageIndex = initialSelectedPageIndex
        self.onSwipeToPage = onSwipeToPage
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(PagerUI(state:self))
    }
    
}


struct PagerUI: View {
    
    @ObservedObject var state: PagerViewImpl
    
    var body: some View {
       
        SwiftUI.TabView(selection:Binding<Int>(
            get: { Int(state.selectedPageIndex) },
            set :{ value in
                state.selectedPageIndex = Int32(value)
                state.onSwipeToPage?.self(KotlinInt(integerLiteral: value))
            })) {
            ForEach(Array(state.screensImpl.enumerated()), id: \.offset) { index,screenImpl in
                screenImpl.ui().tag(index)
            }
        }.tabViewStyle(PageTabViewStyle(indexDisplayMode: .never))
    }
    
    /*if (state.screens.count % 2 != 0) {
            ZStack {
                (state.screens.last as? ComponentViewImpl)?.ui()
            }.transition(.slide)
            .animation(.default)
        }
        else {
            (state.screens.last as? ComponentViewImpl)?.ui()
                .transition(.slide).animation(.default)
        }
        
    }*/
}
