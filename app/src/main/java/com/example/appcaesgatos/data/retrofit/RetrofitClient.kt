package com.example.appcaesgatos.data.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object {
        private lateinit var INSTANCE: Retrofit
        private lateinit var BASE_URL: String

        private fun getRetrofitClient(url: String): Retrofit {
            BASE_URL = url

            val http = OkHttpClient.Builder()
            if (!::INSTANCE.isInitialized) {
                INSTANCE = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(http.build())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }

            return INSTANCE
        }
    }

    fun <S> createService(url: String, className: Class<S>): S {
        return getRetrofitClient(url).create(className)
    }
}