package com.example.android4homework4mc6.data.repositories

import com.example.android4homework4mc6.base.BaseRepository
import com.example.android4homework4mc6.data.remote.apiservices.VideoCategoryApiService
import javax.inject.Inject

class VideoCategoryRepository @Inject constructor(
    private val service: VideoCategoryApiService
) : BaseRepository(){


    fun fetchVideoCategory() = doRequest {
        service.fetchVideoCategory()
    }
}