package com.example.data.api

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class RetrofitClient {

    private val BASE_URL = "https://jsonplaceholder.typicode.com/"


    fun getApiService(): ApiService {
        return getInstance().create(ApiService::class.java)
    }

    private fun getInstance(): Retrofit {
        val gson: Gson = GsonBuilder().setLenient().create()
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
    }
}