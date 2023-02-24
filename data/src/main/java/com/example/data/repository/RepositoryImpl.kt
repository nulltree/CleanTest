package com.example.data.repository

import android.util.Log
import com.example.data.api.RetrofitClient
import com.example.domain.model.TestUser
import com.example.domain.repository.Repository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.awaitResponse

class RepositoryImpl : Repository{
    override fun getUserData(userID: String): Flow<List<TestUser>> = flow {
        val apiService = RetrofitClient().getApiService()

        val response = apiService.getTestApi(userID).awaitResponse()
        Log.e("t", "response : $response")
        val dataList = response.body()
        Log.e("t", "dataList :: $dataList")
        dataList?.let {
            emit(dataList)
        }
    }
}