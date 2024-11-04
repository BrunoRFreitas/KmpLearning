package com.brfdev.helloworld.networking

import com.brfdev.helloworld.model.CensoredText
import com.brfdev.helloworld.networking.util.NetworkErro
import com.brfdev.helloworld.networking.util.Result
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import io.ktor.util.network.UnresolvedAddressException
import kotlinx.serialization.SerializationException

class InsultCensorClient(
    private val httpClient: HttpClient
) {

    suspend fun censorWords(uncensored: String): Result<String, NetworkErro> {
        val response = try {
            httpClient.get(
                urlString = "https://www.purgomalum.com/service/json"
//            urlString = "https://www.purgomalum.com/service/containsprofanity?text=$uncensored"
            ) {
                parameter("text", uncensored)
//            contentType(ContentType.Application.Json)
//            setBody(
//                Any()
//            )
//            headers {
//                append("Accept", "application/json")
//                append("Content-Type", "application/json")
//            }
            }
        } catch (e: UnresolvedAddressException) {
            return Result.Error(NetworkErro.NO_INTERNET)
        } catch (e: SerializationException) {
            return Result.Error(NetworkErro.SERIALIZATION)
        }

        return when (response.status.value){
            in 200 .. 299 -> {
                val censoredText = response.body<CensoredText>()
                Result.Success(censoredText.result)
            }
            401 -> Result.Error(NetworkErro.UNAUTHORIZED)
            409 -> Result.Error(NetworkErro.CONFLICT)
            408 -> Result.Error(NetworkErro.REQUEST_TIMEOUT)
            413 -> Result.Error(NetworkErro.PAYLOAD_TOO_LARGE)
            in 500 .. 599 -> Result.Error(NetworkErro.SERVER_ERROR)
            else -> Result.Error(NetworkErro.UNKNOWN)
        }
    }
}