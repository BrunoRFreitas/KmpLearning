package com.brfdev.helloworld.dependencies

import com.brfdev.helloworld.networking.InsultCensorClient
import com.brfdev.helloworld.networking.util.NetworkErro
import com.brfdev.helloworld.networking.util.Result

interface MyRepository {
    fun getData(): String
    suspend fun censoredText(text: String): Result<String, NetworkErro>
}

class MyRepositoryImpl(
    private val dbClient: DbClient,
    private val censorClient: InsultCensorClient
) : MyRepository {
    override fun getData(): String {
        return "Data!"
    }

    override suspend fun censoredText(text: String): Result<String, NetworkErro> {
        return censorClient.censorWords(text)
    }
}