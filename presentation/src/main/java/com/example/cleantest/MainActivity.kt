package com.example.cleantest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProvider(this)[UserViewModel::class.java]

        CoroutineScope(Dispatchers.Default).launch {
            viewModel.getUserData("5").collect {
                Log.e("t", "it >> $it")
            }
        }


        /*CoroutineScope(Dispatchers.Default).launch {
            getNumbers().collect {
                Log.e("t", "it >> $it")
            }
        }*/

    }

    private fun getNumbers(): Flow<Int> = flow {
        for (i in 1..100) {
            emit(i)
            Log.d("t", "Emit : $i")
        }

        emitAll((101 .. 200).asFlow())
    }
}