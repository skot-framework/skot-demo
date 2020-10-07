plugins {
//    kotlin("multiplatform")
    id("java-library")
    id("kotlin")
    application
}

application {
    mainClassName = "tech.skot.demo.generator.ContractKt"
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

    create<JavaExec>("generateContract") {
//        dependsOn(cleanContract)
        main = "tech.skot.demo.generator.ContractKt"
        classpath = sourceSets["main"].runtimeClasspath
        group = "generate"
    }

    create<JavaExec>("generateViewModel") {
        main = "tech.skot.demo.generator.ViewModelKt"
        classpath = sourceSets["main"].runtimeClasspath
        group = "generate"
    }

    create<JavaExec>("generateView") {
        main = "tech.skot.demo.generator.AndroidViewKt"
        classpath = sourceSets["main"].runtimeClasspath
        group = "generate"
    }
}
