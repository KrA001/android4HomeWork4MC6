package com.example.android4homework4mc6.base

import androidx.lifecycle.liveData
import com.example.android4homework4mc6.utils.Resource
import retrofit2.Response

open class BaseRepository {

    protected open fun <T> doRequest(request: suspend () -> Response<T>) = liveData {
        emit(Resource.Loading())
        try {
            request().also {
                if (it.isSuccessful && it.body() != null){
                    emit(Resource.Success(it.body()!!))
                }else{
                    emit(Resource.Error(null, it.message()))
                }
            }
        } catch (exception: Exception) {
            emit(Resource.Error(null, exception.localizedMessage ?: "Error"))
        }
    }
}