//
//  DialogsViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class DialogsViewImpl:ComponentViewImpl, DialogsView, ObservableObject {
    
    let alert: AlertView
    let alertImpl: AlertViewImpl
    let snackBarImpl: SnackBarViewImpl
    let snackBar: SnackBarView
    let onTapAlert: () -> Void
    let onTapSnack: () -> Void
    
    init(
        alert:AlertViewImpl,
        snackBar: SnackBarViewImpl,
        onTapAlert: @escaping () -> Void,
        onTapSnack: @escaping () -> Void
    ) {
        self.alert = alert
        self.alertImpl = alert
        self.snackBarImpl = snackBar
        self.snackBar = snackBar
        self.onTapAlert = onTapAlert
        self.onTapSnack = onTapSnack
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(DialogUI(state: self))
    }
}


struct DialogUI: View {
    
    @ObservedObject
    var state:DialogsViewImpl
    
    var body: some View {
        ZStack {
            VStack {
                Button(action: state.onTapSnack, label: {
                    Text("Snack !")
                })
                Button(action: state.onTapAlert, label: {
                    Text("Alerte")
                })
            }
            state.alertImpl.ui()
            state.snackBarImpl.ui().frame(alignment: Alignment.topLeading)
        }
        
    }
}
