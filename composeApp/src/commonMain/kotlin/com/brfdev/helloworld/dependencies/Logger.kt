package com.brfdev.helloworld.dependencies

expect class Logger {
    fun log(tag: String, message: String)
}