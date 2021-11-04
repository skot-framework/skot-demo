//
//  SKListView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 03/11/2021.
//

import Foundation
import shared

class SKListViewProxy:SKComponentViewProxy,ViewcontractSKListVC {
    var items: [ViewcontractSKListVCItem]
    
    func scrollToPosition(position: Int32) {
        
    }
    
    init(vertical: Bool, reverse: Bool, nbColumns: KotlinInt?, animate: Bool, animateItem: Bool) {
        self.items = []
    }
   
}
