package tech.skot.demoios

import tech.skot.core.SKLog
import kotlin.Any
import tech.skot.core.SKUri
import tech.skot.core.components.SKRootStack
import tech.skot.core.components.errorTreatment
import tech.skot.demoios.screens.Splash

fun start(any: Any) {
  SKRootStack.content = Splash()
  errorTreatment = { component, exception, errorMessage ->
    SKLog.e(exception, errorMessage)
    component.view.displayErrorMessage(errorMessage ?: exception.message ?:"Erreur inconnue")
  }
}

fun onDeeplink(uri: SKUri) {
}
