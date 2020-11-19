package tech.skot.demo.generator

import tech.skot.demo.screens.*
import tech.skot.generator.node

val views = SplashView::class.node(
    DemoBaseActionsView::class.node(),
    OneButtonView::class.node(
        WithBackScreenView::class.node()
    )
)