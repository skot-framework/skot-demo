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
    implementation(project(":shared"))
    implementation(project(":androidview"))

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

    packagingOptions {
        exclude("META-INF/*.kotlin_module")
        exclude("META-INF/*")
    }
}