package com.brfdev.helloworld.dependencies

interface MyRepository {
    fun getData(): String
}

class MyRepositoryImpl(
    private val dbClient: DbClient
) : MyRepository {
    override fun getData(): String {
        return "Data!"
    }
}