//
//  MainViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI



class MainViewImpl:ScreenViewImpl, MainView, ObservableObject {
    var tabs: [shared.TabView]
    let tabsImpl:Array<TabViewImpl>
    
    let stack: CoreStackView
    let stackImpl:StackViewImpl
    
    init(stack:StackViewImpl, tabs:Array<TabViewImpl>) {
        self.stack = stack
        self.stackImpl = stack
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
            state.stackImpl.ui()
                .frame(maxHeight:.infinity)
            Spacer()
            HStack {
                
                ForEach(state.tabsImpl) { tab in
                    tab.ui().frame(maxWidth:.infinity)
                }
            }
        }
    }
}

struct MainUI_Previews: PreviewProvider {
    static var previews: some View {
        Group {
            MainUI(state: MainViewImpl(stack: StackViewImpl(),
                                       tabs: [
                                        TabViewImpl(label:"Navi",onTap: {
                                            print("Tap on Navi")
                                        }, selected: false),
                                        TabViewImpl(label:"NavInStack",onTap: {
                                            print("Tap on NavInStack")
                                        }, selected: true),
                                        TabViewImpl(label:"Dial",onTap: {
                                            print("Tap on Dial")
                                        }, selected: false),
                                   ]))
            
        }
    }
}
