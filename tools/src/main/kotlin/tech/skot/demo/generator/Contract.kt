package tech.skot.demo.generator

import tech.skot.generator.cleanGenerated
import tech.skot.generator.generateContract
import tech.skot.generator.initGenerator

fun main(args: Array<String>) {
    initGenerator(views)
    cleanGenerated("contract")
    generateContract("contract")
}
