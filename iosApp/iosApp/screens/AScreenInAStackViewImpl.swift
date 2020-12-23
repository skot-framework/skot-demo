//
//  AScreenInAStackViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import shared
import SwiftUI

class AScreenInAStackViewImpl: ScreenViewImpl, AScreenInAStackView, ObservableObject {
    var scrollState: CoreUiState
    
    @Published var lines: [AScreenInAStackViewLine]
    
    let title: String
    
    
    init(
        title:String,
        lines: [AScreenInAStackViewLine]
    ) {
        self.title = title
        self.lines = lines
        self.scrollState = UIStateImpl()
        super.init()
        //self.scrollState.value = AScreenInAStackViewState(scroll: 0)
    }
    
    override func ui() -> AnyView {
        AnyView(AScreenInAStackUI(state: self))
    }
    
    
}

private struct ScrollOffsetPreferenceKey: PreferenceKey {
    static var defaultValue: CGFloat = .zero

    static func reduce(value: inout CGFloat, nextValue: () -> CGFloat) {
        value = nextValue()
    }
}


private struct TotalHeightPreferenceKey: PreferenceKey {
    static var defaultValue: CGFloat = .zero

    static func reduce(value: inout CGFloat, nextValue: () -> CGFloat) {
        value = nextValue()
    }
}

struct AScreenInAStackUI : View {
    
    @ObservedObject
    var state:AScreenInAStackViewImpl
    
  
    
    var body: some View {
        
        VStack {
            Text(state.title)
                    ScrollView {
                        
                    LazyVStack(alignment: HorizontalAlignment.leading) {
                        ForEach(state.lines, id:\.id) { line in
                            HStack() {
                                Text("Ligne " + line.id.description)
                            }
                        }
                    }.frame(maxWidth: .infinity, maxHeight:.infinity)
            
        }.frame(maxWidth: .infinity, maxHeight:.infinity).background(Color.white)
      
    }
    }
        
    
}

