buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}")
        classpath("org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}")
        classpath("com.android.tools.build:gradle:${Versions.Android.plugin}")
        classpath("com.squareup.sqldelight:gradle-plugin:${Versions.Plugins.sqldelight}")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
        maven {
            url = uri("http://raw.github.com/MathieuScotet/skot/repository")
        }
    }

}

