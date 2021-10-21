//buildscript {
//    dependencies {
//        classpath("com.squareup.sqldelight:gradle-plugin:1.5.0")
//    }
//}

plugins {
    kotlin("multiplatform")
    id("com.squareup.sqldelight")
//    id("com.squareup.sqldelight")
}
//repositories {
//    gradlePluginPortal()
//    google()
//    mavenCentral()
//}

kotlin {
    ios {
        binaries {
            framework {
                baseName = "shared"
                export(project(":viewcontract"))
                export(project(":viewmodel"))
            }
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":viewcontract"))
                api(project(":viewmodel"))
                api(project(":model"))
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
//tasks.getByName("build").dependsOn(packForXcode)

val quickPackForXcode by tasks.creating(Sync::class) {
    group = "build"
    fun buildFramework(mode: String) {
        val frameworkX64 =
            kotlin.targets.getByName<org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget>("iosX64").binaries.getFramework(mode)
        inputs.property("mode", mode)
        dependsOn(frameworkX64.linkTask)
    }

    buildFramework("DEBUG")

}

//tasks.getByName("build").dependsOn(quickPackForXcode)


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
        "frameworks/debug/shared.xcframework"
    )
}

val buildQuickFrameworkDebug = tasks.create<Exec>("buildQuickFrameworkDebug") {
    group = "build"
    workingDir(".")
    commandLine(
        "xcodebuild",
        "-create-xcframework",
        "-framework",
        "build/bin/iosX64/debugFramework/shared.framework",
        "-output",
        "frameworks/debug/shared.xcframework"
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
        "frameworks/release/shared.xcframework"
    )
}
val cleanFrameworkDir = tasks.create<Delete>("cleanFrameworkDir") {
    delete("frameworks")
}
val buildFrameworks = tasks.create("buildUniversalFrameworks") {
    group = "build"
    dependsOn(cleanFrameworkDir)
    dependsOn(packForXcode)
    dependsOn(buildUniversalFrameworkDebug)
    dependsOn(buildUniversalFrameworkRelease)
}

val buildQuickFramework = tasks.create("buildQuickFramework") {
    group = "build"
    dependsOn(cleanFrameworkDir)
    dependsOn(quickPackForXcode)
    dependsOn(buildQuickFrameworkDebug)
}

buildUniversalFrameworkDebug.mustRunAfter(packForXcode)
buildUniversalFrameworkRelease.mustRunAfter(packForXcode)
buildQuickFrameworkDebug.mustRunAfter(quickPackForXcode)
packForXcode.mustRunAfter(cleanFrameworkDir)
quickPackForXcode.mustRunAfter(cleanFrameworkDir)

sqldelight {
    linkSqlite = true
}