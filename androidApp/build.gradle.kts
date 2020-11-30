plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-android-extensions")
}
group = Application.group
version = Versions.app

repositories {
    gradlePluginPortal()
    google()
    jcenter()
    mavenCentral()
}
dependencies {
//    implementation(project(":viewmodel"))
    implementation(project(":androidview"))
    implementation(project(":shared"))
}
android {
    compileSdkVersion(Versions.Android.compileSdk)
    defaultConfig {
        applicationId = "${Application.group}.androidApp"
        minSdkVersion(Versions.Android.minSdk)
        targetSdkVersion(Versions.Android.targetSdk)
        versionCode = 1
        versionName = Versions.app
    }
//    buildTypes {
//        getByName("release") {
//            isMinifyEnabled = false
//        }
//    }

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


    packagingOptions {
        exclude("META-INF/*.kotlin_module")
        exclude("META-INF/*")
    }
}