
buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
        mavenLocal()
    }

}
plugins {
    id("skot-starter").version("1.0.0-alpha1")
}

skot {
    appPackage = "tech.skot.demo"
    appName = "Demo"
}