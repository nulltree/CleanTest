package com.example.domain.repository

import com.example.domain.model.TestUser
import kotlinx.coroutines.flow.Flow

interface Repository {

    fun getUserData(userID: String): Flow<List<TestUser>>
}