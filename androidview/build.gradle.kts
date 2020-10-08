plugins {
    id("com.android.library")
    id("kotlin-android")
}


android {
    compileSdkVersion(Versions.Android.compileSdk)
    sourceSets.getByName("main") {
        java.srcDir("src/main/kotlin")
        java.srcDir("generated/main/kotlin")
    }
    defaultConfig {
        minSdkVersion(Versions.Android.minSdk)
    }

    lintOptions {
        isAbortOnError = false
    }
    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    api("tech.skot:view:${Versions.skot}")
    api(project(":contract"))
}