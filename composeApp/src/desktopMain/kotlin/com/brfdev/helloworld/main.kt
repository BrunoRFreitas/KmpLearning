package com.brfdev.helloworld

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.brfdev.helloworld.di.initKoin
import com.brfdev.helloworld.screens.App

fun main() {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "HelloWorld",
        ) {
            App()
        }
    }
}