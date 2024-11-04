package com.brfdev.helloworld.dependencies

import platform.Foundation.NSLog

actual class Logger {
    actual fun log(tag: String, message: String) {
        NSLog("[$tag] $message")
    }
}