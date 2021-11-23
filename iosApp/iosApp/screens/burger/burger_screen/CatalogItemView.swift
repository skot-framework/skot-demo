//
//  CatalogItemView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2021.
//

import Foundation
import shared
import SwiftUI

class CatalogItemViewProxy:SKComponentViewProxy,CatalogItemVC, ObservableObject {
    let imageUrl: String
    
    let label: String
    
    let onClickAdd: () -> Void
    
    let price: String
    
    
    init(imageUrl: String, label: String, onClickAdd: @escaping () -> Void, price: String) {
        self.imageUrl = imageUrl
        self.label = label
        self.onClickAdd = onClickAdd
        self.price = price
        super.init()
    }
    
    func ui() -> CatalogItemView {
        CatalogItemView(proxy:self)
    }
}

struct CatalogItemView: View {
    
    @ObservedObject var proxy:CatalogItemViewProxy
    
 
    var body: some View {
        HStack {
    
            Text(proxy.label)
                .multilineTextAlignment(.center)
            .frame(height: 36, alignment: .topLeading)
            Spacer()
            Text(proxy.price)
            Button(action: proxy.onClickAdd, label:{
                Text("+")
            })
        }
        
    }
}

