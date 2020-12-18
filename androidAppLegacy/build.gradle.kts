plugins {
    id("com.android.application")
    kotlin("android")
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
    implementation(project(":androidviewlegacy"))
    implementation(project(":shared"))

    debugImplementation("com.squareup.leakcanary:leakcanary-android:2.5")
}
android {
    compileSdkVersion(Versions.Android.compileSdk)
    defaultConfig {
        applicationId = "${Application.group}.androidAppLegacy"
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



    packagingOptions {
        exclude("META-INF/*.kotlin_module")
        exclude("META-INF/*")
    }
}