package com.brfdev.helloworld.di

import com.brfdev.helloworld.dependencies.DbClient
import com.brfdev.helloworld.dependencies.Logger
import com.brfdev.helloworld.networking.InsultCensorClient
import com.brfdev.helloworld.networking.createHttpClient
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
    single {
        InsultCensorClient(createHttpClient(OkHttp.create()))
    }
    singleOf(::Logger)

}