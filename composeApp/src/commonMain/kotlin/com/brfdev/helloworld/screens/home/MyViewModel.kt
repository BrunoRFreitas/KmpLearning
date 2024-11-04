package com.brfdev.helloworld.screens.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brfdev.helloworld.dependencies.Logger
import com.brfdev.helloworld.dependencies.MyRepository
import com.brfdev.helloworld.networking.util.onError
import com.brfdev.helloworld.networking.util.onSuccess
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MyViewModel(
    private val repository: MyRepository,
    private val logger: Logger
): ViewModel() {

    init {
        logger.log("BRUNO-TESTE", "init")
        getTextCensored("your piece of shit")
    }

    private val _text = MutableStateFlow("")
    val text: StateFlow<String> = _text

    fun getData(): String {
        return repository.getData()

    }

    fun getTextCensored(text: String){

        logger.log("BRUNO-TESTE", "getTextCensored")
        viewModelScope.launch {
            repository.censoredText(text)
                .onSuccess {
                    logger.log("BRUNO-TESTE", "Success: $it")
                    _text.value = it
                }
                .onError {
                    logger.log("BRUNO-TESTE", "Error: $it")
                }
        }
    }
}