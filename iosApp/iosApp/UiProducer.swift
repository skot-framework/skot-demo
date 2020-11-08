//
//  UiProducer.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation
import SwiftUI

public protocol UiProducer {
    associatedtype V:View
    func ui() -> V
}
