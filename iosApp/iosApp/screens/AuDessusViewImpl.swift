//
//  AuDessusViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class AuDessusViewImpl: ScreenViewImpl, AuDessusView, ObservableObject {
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
            Text(state.title)
            HStack {
                Button(action: state.onTapOpenAnother, label: { Text("Open") })
                Button(action: state.onTapClose, label: { Text("close") })
            }.frame(maxWidth:.infinity)
            ScrollView {
                LazyVStack(alignment: HorizontalAlignment.leading) {
                    ForEach(state.lines, id:\.id) { line in
                        HStack() {
                            Text("Ligne " + line.id.description)
                        }
                    }
                }
            }
            .frame(maxWidth: .infinity, maxHeight:.infinity)

            
        }.frame(maxWidth: .infinity, maxHeight:.infinity).background(Color.white)
      
        
        
    
    }
    
    
}


struct AudessusUI_Previews: PreviewProvider {
    static var previews: some View {
        Group {
            AuDessusUI(state: AuDessusViewImpl(title: "Au dessus n° ???", onTapOpenAnother: {
                
            }, onTapClose: {
                
            }, lines: [AuDessusViewLine(id: 1), AuDessusViewLine(id: 2), AuDessusViewLine(id: 3)]))
            
        }
    }
}
