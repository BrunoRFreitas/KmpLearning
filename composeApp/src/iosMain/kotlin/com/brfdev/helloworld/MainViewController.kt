package com.brfdev.helloworld

import androidx.compose.ui.window.ComposeUIViewController
import com.brfdev.helloworld.di.initKoin
import com.brfdev.helloworld.screens.App

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}