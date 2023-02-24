package com.example.data.api

import com.example.data.model.TestUserDto
import com.example.domain.model.TestUser
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("posts")
    fun getTestApi(@Query("userID") userID: String) : Call<List<TestUser>>
}