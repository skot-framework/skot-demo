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
    /*buildFeatures {
        viewBinding = true
    }*/

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion  = Versions.Android.compose
        kotlinCompilerVersion  = "1.4.10"
    }
}

dependencies {
    api(project(":contract"))

    api("androidx.appcompat:appcompat:${Versions.Android.appcompat}")
    api("androidx.compose.ui:ui:${Versions.Android.compose}")
    implementation("androidx.compose.material:material:${Versions.Android.compose}")
    implementation("androidx.ui:ui-tooling:${Versions.Android.compose}")

}