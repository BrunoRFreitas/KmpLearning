package com.brfdev.helloworld.dependencies

actual class Logger {
    actual fun log(tag: String, message: String) {
        println("$tag -> $message")
    }
}