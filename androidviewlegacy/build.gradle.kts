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

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }

}

dependencies {
    api(project(":contract"))
    api("tech.skot:viewlegacy:${Versions.skot}")

    api("androidx.appcompat:appcompat:${Versions.Android.appcompat}")
//    implementation("androidx.ui:ui-tooling:${Versions.Android.compose}")

}