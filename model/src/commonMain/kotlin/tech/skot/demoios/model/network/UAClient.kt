package tech.skot.demoios.model.network

import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.features.get
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.request.*
import io.ktor.http.*
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

interface UAClient {
    suspend fun getBurgers():List<UABurger>
}

@Serializable
data class UABurger(
        val ref: String,
        val title: String,
        val description: String,
        val thumbnail: String,
        val price: Double
)

val baseJson by lazy {
    Json {
        ignoreUnknownKeys = true
        encodeDefaults = true
    }
}

val baseSerializer by lazy {
    KotlinxSerializer(baseJson)
}


class UAClientImpl: UAClient {


    val client = HttpClient {
        install(JsonFeature) {
            serializer = baseSerializer
        }

        defaultRequest {
            url {
                protocol = URLProtocol.HTTPS
                host = "bigburger.useradgents.com"
            }
            timeout {
                this.requestTimeoutMillis = 30*1000L
                this.connectTimeoutMillis = 30*1000L
                this.socketTimeoutMillis = 30*1000L
            }
        }
    }



    override suspend fun getBurgers(): List<UABurger> {
//        throw IllegalStateException("----- ??? ---")
        return client.get<List<UABurger>> {
            url {
                encodedPath = "catalog"
            }
        }
    }
}