//
//  PagerExampleViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 24/12/2020.
//

import SwiftUI
import shared

class PagerExampleViewImpl: ScreenViewImpl, PagerExampleView, ObservableObject {
    let onTapToIndex2: () -> Void
    
    let pager: CorePagerView
    let pagerImpl: PagerViewImpl
    
    @Published var textSelectedPage: String?
    
    
    init(onTapToIndex2: @escaping () -> Void, pagerImpl: PagerViewImpl) {
        self.pager = pagerImpl
        self.pagerImpl = pagerImpl
        self.onTapToIndex2 = onTapToIndex2
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(PagerExampleUI(state: self))
    }
    
}

struct PagerExampleUI: View {
    
    @ObservedObject var state: PagerExampleViewImpl
    
    var body: some View {
        VStack {
            HStack {
                Text(state.textSelectedPage ?? "??")
                Spacer()
                Text("Exemple de Pager")
                Spacer()
                Button(action: state.onTapToIndex2, label: {
                        Text("to 2")
                    
                })
            }
            state.pagerImpl.ui()
                .frame(maxWidth: .infinity, maxHeight: .infinity)
        }.frame(maxWidth: .infinity)
        .background(Color.white)
        
    }
}
