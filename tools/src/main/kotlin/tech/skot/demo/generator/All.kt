package tech.skot.demo.generator

import tech.skot.generator.*

fun main(args: Array<String>) {
    initGenerator(views)
    cleanGenerated("contract")
    generateContract("contract")

    cleanGenerated("viewmodel")
    generateViewModel("viewmodel")

    cleanGenerated("androidview")
    ViewGenerator(views, "tech.skot.demo.android.BaseActivity", "tech.skot.demo.android.BaseFragment",
        emptyMap(), emptyMap(), emptyMap(), emptyMap())
        .generateView("androidview")
}