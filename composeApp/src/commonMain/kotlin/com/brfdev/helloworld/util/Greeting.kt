package com.brfdev.helloworld.util

import com.brfdev.helloworld.getPlatform

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }
}