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
    let onTapAlertCustomButton: () -> Void
    let onTapAlertTwoButtons: () -> Void
    
    let onTapSnack: () -> Void
    let onTapShowBottomSheet: () -> Void
    let onTapShowGlobalBottomSheet: () -> Void
    
    init(
        alert:AlertViewImpl,
        snackBar: SnackBarViewImpl,
        bottomSheet: BottomSheetViewImpl,
        onTapAlert: @escaping () -> Void,
        onTapAlertCustomButton: @escaping () -> Void,
        onTapAlertTwoButtons: @escaping () -> Void,
        onTapSnack: @escaping () -> Void,
        onTapShowBottomSheet: @escaping () -> Void,
        onTapShowGlobalBottomSheet: @escaping () -> Void
    ) {
        self.alert = alert
        self.alertImpl = alert
        self.snackBarImpl = snackBar
        self.snackBar = snackBar
        self.bottomSheet = bottomSheet
        self.bottomSheetImpl = bottomSheet
        self.onTapAlert = onTapAlert
        self.onTapAlertCustomButton = onTapAlertCustomButton
        self.onTapAlertTwoButtons = onTapAlertTwoButtons
        self.onTapSnack = onTapSnack
        self.onTapShowBottomSheet = onTapShowBottomSheet
        self.onTapShowGlobalBottomSheet = onTapShowGlobalBottomSheet
        super.init()
    }
    
    override func ui() -> AnyView {
        AnyView(DialogsUI(state: self))
    }
}


struct DialogsUI: View {
    
    @ObservedObject
    var state:DialogsViewImpl
    
    var body: some View {
        ZStack(alignment: Alignment(horizontal: HorizontalAlignment.center, vertical: VerticalAlignment.top)) {
            VStack {
                Button(action: state.onTapAlert, label: {
                    Text("Alert")
                })
                Button(action: state.onTapAlertCustomButton, label: {
                    Text("Alert Custom Button")
                })
                Button(action: state.onTapAlertTwoButtons, label: {
                    Text("Alert Two Buttons")
                })
                Button(action: state.onTapSnack, label: {
                    Text("Snack")
                })
                Button(action: state.onTapShowBottomSheet, label: {
                    Text("Show Bottom Sheet")
                })
                Button(action: state.onTapShowGlobalBottomSheet, label: {
                    Text("Show Bottom Global Sheet")
                })
                Spacer()
            }
            state.alertImpl.ui()
            state.snackBarImpl.ui().frame(alignment: Alignment.topLeading)
            state.bottomSheetImpl.ui()
        }
        
    }
}

struct DialogsUI_Previews: PreviewProvider {
    static var previews: some View {
        Group {
            DialogsUI(state: DialogsViewImpl(
                        alert: AlertViewImpl(), snackBar: SnackBarViewImpl(), bottomSheet: BottomSheetViewImpl(), onTapAlert: {
                            
                        }, onTapAlertCustomButton: {
                            
                        }, onTapAlertTwoButtons: {
                            
                        }, onTapSnack: {
                            
                        }, onTapShowBottomSheet: {
                            
                        }, onTapShowGlobalBottomSheet: {
                            
                        }))
            
        }
    }
}

protocol Prot {
    var test:String { get }
}

class ProtImpl:Prot {
    let test:String
    
    init(test:String) {
        self.test = test
    }
}


protocol MetaProt {
    var testProt:Prot { get }
}

class A:MetaProt {
    let testProtImpl:ProtImpl
    
    var testProt: Prot {
        get { testProtImpl }
    }
 
    init(testProt:ProtImpl) {
        self.testProtImpl = testProt
    }
}
