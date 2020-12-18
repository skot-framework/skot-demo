import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("com.squareup.sqldelight")
}
group = Application.group
version = Versions.app

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
kotlin {
    android()
    ios {
        binaries {
            framework {
                baseName = "shared"
                export(project(":contract"))
                export(project(":viewmodel"))
            }
        }
    }
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(project(":viewmodel"))
                api(project(":contract"))
            }
        }

        val androidMain by getting

        val iosMain by getting

    }
}
android {
    compileSdkVersion(Versions.Android.compileSdk)
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdkVersion(Versions.Android.minSdk)
    }

}




val packForXcode by tasks.creating(Sync::class) {
    group = "build"
    fun buildFramework(mode: String) {
        val frameworkArm =
            kotlin.targets.getByName<KotlinNativeTarget>("iosArm64").binaries.getFramework(mode)
        val frameworkX64 =
            kotlin.targets.getByName<KotlinNativeTarget>("iosX64").binaries.getFramework(mode)
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

val buildFrameworks = tasks.create("buildUniversalFrameworks") {
    group = "build"
    dependsOn(packForXcode)
    dependsOn(buildUniversalFrameworkDebug)
    dependsOn(buildUniversalFrameworkRelease)
}

buildUniversalFrameworkDebug.mustRunAfter(packForXcode)
buildUniversalFrameworkRelease.mustRunAfter(packForXcode)

sqldelight {
    linkSqlite = true
}