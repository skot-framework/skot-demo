group = Application.group
version = Versions.app

plugins {
    kotlin("multiplatform")
    id("com.android.library")
    id("kotlin-android-extensions")
}


kotlin {
    android()
    ios {
        binaries {
            framework {
                baseName = "demoviewmodel"
            }
        }
    }

    sourceSets["commonMain"].kotlin.srcDir("generated/commonMain/kotlin")

    sourceSets {
        val commonMain by getting {
           dependencies {
               api("tech.skot:viewmodel:${Versions.skot}")
               api(project(":contract"))
           }
        }

        val androidMain by getting

        val iosMain by getting

    }
}


android  {
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