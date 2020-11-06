//
//  UiProducer.swift
//  iosApp
//
//  Created by Mathieu Scotet on 05/11/2020.
//

import Foundation

protocol UiProducer {
    associatedtype UiView
    var uiview: Self.UiView { get }
}
