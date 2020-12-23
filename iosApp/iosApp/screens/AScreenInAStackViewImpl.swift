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
    
    var lines: [AScreenInAStackViewLine]
    
    let title: String
    
    
    init(
        title:String,
        lines: [AScreenInAStackViewLine]
    ) {
        self.title = title
        self.lines = lines
        self.scrollState = UIStateImpl()
        super.init()
        
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
          
        
            VStack {
                HStack {
                    Text(state.title)
                }
                
                ScrollViewReader { scrollView in
                ScrollView(.vertical) {
                    
                    
                               
                    
                                LazyVStack {
                                    GeometryReader { geometry in
                                        ForEach(state.lines, id:\.id) { line in
                                        HStack {
                                            Text("Ligne " + line.id.description)
                                        }
                                    }
                                   
                                        let offset = geometry.frame(in: .named("scroll")).minY
                                                                Color.clear.preference(key: ScrollOffsetPreferenceKey.self, value: offset)
                                        let height = geometry.frame(in: .named("scroll")).height
                                                                Color.clear.preference(key: TotalHeightPreferenceKey.self, value: height)
                                }
                                /*.id("liste")
                                .onAppear {
                                    //scrollView.scrollTo(state.lines[state.lines.endIndex-1].id)
                                    scrollView.scrollTo("liste",anchor:UnitPoint(x: 0, y: state.scroll))
                                }
                                .onDisappear {
                                    print("offset: " + geometry.frame(in: .local).minY.description)
                                }*/
                                
                    }.background(Color.yellow)
                        }
                .coordinateSpace(name: "scroll")
                            .onPreferenceChange(ScrollOffsetPreferenceKey.self) { value in
                                print("offset  " + value.description)
                            }
                .onPreferenceChange(TotalHeightPreferenceKey.self) { value in
                    print("height" + value.description)
                }
                }
            }
            
      
        }
        
    
    }
    
    
}

