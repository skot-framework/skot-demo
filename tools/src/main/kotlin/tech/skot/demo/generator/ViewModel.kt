package tech.skot.demo.generator

import tech.skot.generator.cleanGenerated
import tech.skot.generator.generateViewModel
import tech.skot.generator.initGenerator

fun main(args: Array<String>) {
    initGenerator(views)
//    cleanGenerated("viewmodel")
    generateViewModel("viewmodel")
}