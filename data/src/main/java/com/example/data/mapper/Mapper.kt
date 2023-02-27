package com.example.data.mapper

import com.example.data.model.TestUserResponse
import com.example.domain.model.TestUserDto

object Mapper {

    fun mapperToTestUserDto(resList: List<TestUserResponse>): List<TestUserDto> {
        return resList.toList().map {
            TestUserDto(
                body = it.body,
                id = it.id,
                userId = it.userId,
                title = it.title
            )
        }
    }
}