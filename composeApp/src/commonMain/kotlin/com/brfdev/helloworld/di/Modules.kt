package com.brfdev.helloworld.di

import com.brfdev.helloworld.dependencies.MyRepository
import com.brfdev.helloworld.dependencies.MyRepositoryImpl
import com.brfdev.helloworld.dependencies.MyViewModel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}