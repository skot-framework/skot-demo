//
//  MainViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI



class MainViewImpl:ComponentViewImpl, MainView, ObservableObject {
    var tabs: [shared.TabView]
    let content: StackView
    
    let contentImpl:StackViewImpl
    let tabsImpl:Array<TabViewImpl>
    
    init(content:StackViewImpl, tabs:Array<TabViewImpl>) {
        self.content = content
        self.contentImpl = content
        self.tabs = tabs
        self.tabsImpl = tabs
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(MainUI(state: self))
    }
    
}


struct MainUI: View {
    
    @ObservedObject var state:MainViewImpl
    
    var body: some View {
        return VStack {
            state.contentImpl.ui()
                .frame(maxHeight:.infinity)
            
            HStack {
                
                ForEach(state.tabsImpl) { tab in
                    tab.ui().frame(maxWidth:.infinity)
                }
            }
        }
    }
}
