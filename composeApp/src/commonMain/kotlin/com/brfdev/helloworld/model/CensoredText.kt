package com.brfdev.helloworld.model

import kotlinx.serialization.Serializable

@Serializable
data class CensoredText(
    val result: String
)
