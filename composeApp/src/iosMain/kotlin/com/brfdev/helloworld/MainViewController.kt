package com.brfdev.helloworld

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.brfdev.helloworld.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}