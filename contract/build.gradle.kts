group = Application.group
version = Versions.app

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("maven-publish")
    id("kotlinx-serialization")
}

android {
    defaultConfig {
        minSdkVersion(Versions.Android.minSdk)
    }
    compileSdkVersion(Versions.Android.compileSdk)

    lintOptions {
        isAbortOnError = false
    }

    sourceSets {
        getByName("main").java.srcDirs("generated/androidMain/kotlin")
        getByName("main").java.srcDirs("src/androidMain/kotlin")
        getByName("main").manifest.srcFile("src/androidMain/AndroidManifest.xml")
        getByName("main").res.srcDir("src/androidMain/res")
    }
}

kotlin {
    jvm()
    android()
    ios {
        binaries {
            framework {
                baseName = "shared"
            }
        }
    }

    sourceSets["commonMain"].kotlin.srcDir("generated/commonMain/kotlin")
    sourceSets["commonMain"].kotlin.srcDir("src/commonMain/kotlin")

    sourceSets {
        val commonMain by getting {
            dependencies {
                api("tech.skot:contract:${Versions.skot}")
            }
        }

        val androidMain by getting

        val jvmMain by getting {
            dependencies {
                api("tech.skot:contract-jvm:${Versions.skot}")
            }
        }

        val iosMain by getting

    }
}