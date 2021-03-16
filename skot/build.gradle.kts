plugins {
	id("skot-tools")
}

skot {
    app = tech.skot.tools.gradle.App(
            startScreen = "tech.skot.demo.screens.SplashVC",
            packageName = "tech.skot.demo",
            baseActivity = "tech.skot.demo.android.BaseActivity")
}                