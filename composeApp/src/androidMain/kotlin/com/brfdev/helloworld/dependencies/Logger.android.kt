package com.brfdev.helloworld.dependencies

import android.util.Log

actual class Logger {
    actual fun log(tag: String, message: String) {
        Log.d(tag, message)
    }
}