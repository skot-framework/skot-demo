package tech.skot.demo.generator

import tech.skot.generator.ViewGenerator
import tech.skot.generator.cleanGenerated

fun main(args: Array<String>) {

    cleanGenerated("view")
    ViewGenerator(views, "tech.skot.demo.android.BaseActivity", "tech.skot.demo.android.BaseFragment",
    emptyMap(), emptyMap(), emptyMap(), emptyMap())
        .generateView("androidview")
}