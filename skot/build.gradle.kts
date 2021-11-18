import org.jetbrains.kotlin.gradle.utils.loadPropertyFromResources
import tech.skot.tools.gradle.commandLine

plugins {
    id("skot-tools")
}

skot {
    app = tech.skot.tools.gradle.App(
        startScreen = ".screens.SplashVC",
        packageName = "tech.skot.demoios",
        baseActivity = ".android.BaseActivity",
        rootState = ".states.RootStateDef"
    )


//    task("testCopy", type= Copy::class) {
//
//        commandLine("curl","https://raw.githubusercontent.com/skot-framework/skot/beta/1.0/README.md", ">", "charge.txt")
//            https://raw.githubusercontent.com/skot-framework/skot/beta/1.0/README.md
////        project.javaClass.classLoader
//        //this.destinationDir = rootDir
//
//       // from(project.fileTree(project.javaClass.protectionDomain.codeSource.location.toExternalForm())
//       // into("../iosApp/tutu")
////        project.resources.loadPropertyFromResources("test.properties","test")
////        project.resources.text.fromFile(project.resources.loadPropertyFromResources())
//
//    }
}                