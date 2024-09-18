package com.example.android4homework4mc6.data.repositories

import com.example.android4homework4mc6.base.BaseRepository
import com.example.android4homework4mc6.data.remote.apiservices.VideosApiService
import javax.inject.Inject

class VideosRepository @Inject constructor(
    private val service: VideosApiService
) : BaseRepository(){

    fun fetchVideos(id: String?) = doRequest {
        service.fetchVideos(categoryId = id)
    }
}