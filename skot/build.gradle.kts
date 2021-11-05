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
}                