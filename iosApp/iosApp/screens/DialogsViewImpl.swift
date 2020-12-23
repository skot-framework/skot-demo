//
//  DialogsViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 30/11/2020.
//

import shared
import SwiftUI

class DialogsViewImpl:ScreenViewImpl, DialogsView, ObservableObject {
    
    let alert: CoreAlertView
    let alertImpl: AlertViewImpl
    let snackBar: CoreSnackBarView
    let snackBarImpl: SnackBarViewImpl
    let bottomSheet: CoreBottomSheetView
    let bottomSheetImpl: BottomSheetViewImpl
    
    let onTapAlert: () -> Void
    let onTapSnack: () -> Void
    let onTapShowBottomSheet: () -> Void
    
    init(
        alert:AlertViewImpl,
        snackBar: SnackBarViewImpl,
        bottomSheet: BottomSheetViewImpl,
        onTapAlert: @escaping () -> Void,
        onTapSnack: @escaping () -> Void,
        onTapShowBottomSheet: @escaping () -> Void
    ) {
        self.alert = alert
        self.alertImpl = alert
        self.snackBarImpl = snackBar
        self.snackBar = snackBar
        self.bottomSheet = bottomSheet
        self.bottomSheetImpl = bottomSheet
        self.onTapAlert = onTapAlert
        self.onTapSnack = onTapSnack
        self.onTapShowBottomSheet = onTapShowBottomSheet
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
                Button(action: state.onTapShowBottomSheet, label: {
                    Text("Show Bottom Sheet")
                })
            }
            state.alertImpl.ui()
            state.snackBarImpl.ui().frame(alignment: Alignment.topLeading)
            state.bottomSheetImpl.ui()
        }
        
    }
}
