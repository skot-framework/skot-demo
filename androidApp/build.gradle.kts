plugins {
	id("skot-app")
	kotlin("android")
}

android {

    defaultConfig {
        applicationId = "tech.skot.demo.android"
        
        versionCode = Build.versionCode
        versionName = Build.versionName
    }

//    signingConfigs {
//        create("release") {
//            val signingProps = Build.readSigningProperties("$projectDir")
//            keyAlias = signingProps.getProperty("key.alias")
//            keyPassword = signingProps.getProperty("key.password")
//            storeFile = file("signing/keystore.jks")
//            storePassword = signingProps.getProperty("store.password")
//        }
//    }


    buildTypes {
        getByName("debug") {
            applicationIdSuffix = "dev"
            manifestPlaceholders["app_name"] = "Dev ${Build.appName}"
        }

        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")

//            signingConfig = signingConfigs.getByName("release")

            manifestPlaceholders["app_name"] = Build.appName
        }
    }

}