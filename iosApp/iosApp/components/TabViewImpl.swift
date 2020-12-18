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
    var selected: Bool
    
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
        var textStyle:Font.Weight
        if (state.selected) {
            textStyle = Font.Weight.bold
        }
        else {
            textStyle = Font.Weight.light
        }
        return Button(
            action: state.onTap, label: { Text(state.label).fontWeight( textStyle) })
    }
}
