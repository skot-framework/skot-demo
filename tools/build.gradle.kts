plugins {
//    kotlin("multiplatform")
    id("java-library")
    id("kotlin")
    application
}

application {
    mainClassName = "tech.skot.demo.generator.AllKt"
}

//kotlin {
//    jvm()
//
//    sourceSets {
//        val commonMain by getting {
//            dependencies {
//                implementation("tech.skot:generator:${Versions.skot}")
//                implementation(project(":contract"))
//            }
//        }
//
//    }
//}

dependencies {
    implementation("tech.skot:generator:${Versions.skot}")
    implementation(project(":contract", "jvmDefault"))
}


tasks {
//    val cleanContract = create<Delete>("cleanGeneratedContract") {
//        delete = setOf("../contract/generated")
//    }

//    create<JavaExec>("generateContract") {
//        dependsOn(cleanContract)
//        main = "tech.skot.demo.generator.ContractKt"
//        classpath = sourceSets["main"].runtimeClasspath
//        group = "generate"
//    }
//
//    create<JavaExec>("generateViewModel") {
//        dependsOn(cleanContract)
//        main = "tech.skot.demo.generator.ViewModelKt"
//        classpath = sourceSets["main"].runtimeClasspath
//        group = "generate"
//    }
//
//    create<JavaExec>("generateView") {
//        dependsOn(cleanContract)
//        main = "tech.skot.demo.generator.AndroidViewKt"
//        classpath = sourceSets["main"].runtimeClasspath
//        group = "generate"
//    }

    create<JavaExec>("all") {
//        dependsOn(cleanContract)
        main = "tech.skot.demo.generator.AllKt"
        classpath = sourceSets["main"].runtimeClasspath
        group = "generate"
    }
}
