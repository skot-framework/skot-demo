plugins {
    kotlin("multiplatform")
//    id("com.squareup.sqldelight")
}
//repositories {
//    gradlePluginPortal()
//    google()
//    mavenCentral()
//}

println("----------!!!!!! ${tech.skot.Versions.group}")

kotlin {
    ios {
        binaries {
            framework {
                baseName = "shared"
                export(project(":viewcontract"))
                export(project(":viewmodel"))
                export("${tech.skot.Versions.group}:core:${Versions.skot}")

            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":viewmodel"))
                api(project(":viewcontract"))
            }
        }

        val iosMain by getting {
            dependencies {
                api("${tech.skot.Versions.group}:core:${Versions.skot}")
            }
        }

    }
}



val packForXcode by tasks.creating(Sync::class) {
    group = "build"
    fun buildFramework(mode: String) {
        val frameworkArm =
            kotlin.targets.getByName<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>("iosArm64").binaries.getFramework(mode)
        val frameworkX64 =
            kotlin.targets.getByName<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>("iosX64").binaries.getFramework(mode)
        inputs.property("mode", mode)
        dependsOn(frameworkArm.linkTask)
        dependsOn(frameworkX64.linkTask)
    }

    buildFramework("DEBUG")
    buildFramework("RELEASE")


}
tasks.getByName("build").dependsOn(packForXcode)

val buildUniversalFrameworkDebug = tasks.create<Exec>("buildUniversalFrameworkDebug") {
    group = "build"
    workingDir(".")
    commandLine(
        "xcodebuild",
        "-create-xcframework",
        "-framework",
        "build/bin/iosArm64/debugFramework/shared.framework",
        "-framework",
        "build/bin/iosX64/debugFramework/shared.framework",
        "-output",
        "build/framework/debug/shared.xcframework"
    )
}

val buildUniversalFrameworkRelease = tasks.create<Exec>("buildUniversalFrameworkRelease") {
    group = "build"
    workingDir(".")
    commandLine(
        "xcodebuild",
        "-create-xcframework",
        "-framework",
        "build/bin/iosArm64/releaseFramework/shared.framework",
        "-framework",
        "build/bin/iosX64/releaseFramework/shared.framework",
        "-output",
        "build/framework/release/shared.xcframework"
    )
}
val cleanFrameworkDir = tasks.create<Delete>("cleanFrameworkDir") {
    delete("build/framework")
}
val buildFrameworks = tasks.create("buildUniversalFrameworks") {
    group = "build"
    dependsOn(packForXcode)
    dependsOn(cleanFrameworkDir)
    dependsOn(buildUniversalFrameworkDebug)
    dependsOn(buildUniversalFrameworkRelease)
}

buildUniversalFrameworkDebug.mustRunAfter(packForXcode)
buildUniversalFrameworkRelease.mustRunAfter(packForXcode)
//
//sqldelight {
//    linkSqlite = true
//}