pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        jcenter()
        mavenCentral()
    }
    resolutionStrategy {
        eachPlugin {
            if (requested.id.namespace == "com.android") {
                useModule("com.android.tools.build:gradle:4.0.1")
            }
        }
    }
}
rootProject.name = "Skot-Demo"


include(":androidApp")
include(":androidAppLegacy")
include(":shared")
include(":contract")
include(":viewmodel")
include(":androidview")
include(":androidviewlegacy")
//include(":tools")
