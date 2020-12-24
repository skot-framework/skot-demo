//
//  ScreenViewImpl.swift
//  iosApp
//
//  Created by Mathieu Scotet on 22/12/2020.
//

import Foundation
import shared
import SwiftUI

class ScreenViewImpl : ComponentViewImpl,CoreScreenView  {
    var onBackPressed: (() -> Void)?
    var id = UUID()
}
