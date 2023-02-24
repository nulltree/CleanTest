package com.example.cleantest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.data.repository.RepositoryImpl
import com.example.domain.model.TestUser
import com.example.domain.repository.Repository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class UserViewModel : ViewModel() {

    /*fun getUserData(userID: String) {
        viewModelScope.launch(Dispatchers.IO) {
            //val repository = Reposit
        }
    }*/
    fun getUserData(userID: String): Flow<List<TestUser>> = RepositoryImpl().getUserData(userID)
}