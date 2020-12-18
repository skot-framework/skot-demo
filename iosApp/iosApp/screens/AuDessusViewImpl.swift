//
//  AuDessusViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class AuDessusViewImpl: ComponentViewImpl, AuDessusView, ObservableObject {
    let title: String
    let onTapOpenAnother: () -> Void
    let onTapClose: () -> Void
    let lines: [AuDessusViewLine]
    
    init(
        title:String,
        onTapOpenAnother: @escaping () -> Void,
        onTapClose: @escaping () -> Void,
        lines: [AuDessusViewLine]
    ) {
        self.title = title
        self.onTapOpenAnother = onTapOpenAnother
        self.onTapClose = onTapClose
        self.lines = lines
        super.init()
        
    }
    
    override func ui() -> AnyView {
        AnyView(AuDessusUI(state: self))
    }
    
    var scroll:CGFloat = 0
    
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

struct AuDessusUI : View {
    
    @ObservedObject
    var state:AuDessusViewImpl
    
  
    
    var body: some View {
        
        VStack {
          
        
            VStack {
                HStack {
                    Text(state.title)
                    Button(action: state.onTapOpenAnother, label: { Text("Open") })
                    Button(action: state.onTapClose, label: { Text("close") })
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
                
              /*  List(state.lines, id:\.id) { line in
                    HStack {
                        Text("Ligne " + line.id.description).onAppear {
                            print("compute ligne "+line.id.description)
                        }
                    }
                    
                }
                */
                
                
            }
            
      
        }
        
    
    }
    
    
}
