package com.brfdev.helloworld

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform