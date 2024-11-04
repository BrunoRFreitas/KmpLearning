package com.brfdev.helloworld.dependencies

import androidx.lifecycle.ViewModel

class MyViewModel(
    private val repository: MyRepository
): ViewModel() {

    fun getData(): String {
        return repository.getData()
    }
}