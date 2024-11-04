package com.brfdev.helloworld

import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.brfdev.helloworld.di.initKoin

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