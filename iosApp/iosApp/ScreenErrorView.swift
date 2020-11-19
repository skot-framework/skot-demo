//
//  ScreenErrorView.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import SwiftUI

struct ScreenErrorView: View {
    var body: some View {
        Text("Ecran non trouvé !")
    }
}

struct ScreenErrorView_Previews: PreviewProvider {
    static var previews: some View {
        ScreenErrorView()
    }
}

class ScreenErrorViewImpl: ScreenViewImpl {
    override func ui() -> AnyView {
        AnyView(Text("Ecran non trouvé !"))
    }
}
