//
//  TabViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class TabViewImpl: ComponentViewImpl, shared.TabView, Identifiable, ObservableObject {
    var id = UUID()
    
    let label: String
    let onTap: () -> Void
    @Published var selected: Bool
    
    init(
        label:String,
        onTap:@escaping () -> Void,
        selected:Bool) {
        self.label = label
        self.onTap = onTap
        self.selected = selected
        super.init()
    }
    
    override func ui() -> AnyView {
     AnyView(TabUI(state: self))
    }
    
}

struct TabUI: View {
    
    @ObservedObject var state:TabViewImpl
    
    var body: some View {
        
        var textColor:Color
        if (state.selected) {
            textColor = Color.black
        }
        else {
            textColor = Color.gray
        }
        return Button(
            action: state.onTap, label: { Text(state.label).foregroundColor(textColor) })
            .padding(4)
    }
}
