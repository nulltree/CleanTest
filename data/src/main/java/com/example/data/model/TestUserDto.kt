package com.example.data.model


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

class TestUserDto : ArrayList<TestUserDto.TestUserDtoItem>(){
    @Serializable
    data class TestUserDtoItem(
        @SerialName("body")
        val body: String,
        @SerialName("id")
        val id: Int,
        @SerialName("title")
        val title: String,
        @SerialName("userId")
        val userId: Int
    )
}