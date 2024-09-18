package com.example.android4homework4mc6.ui.fragments.youtube

import androidx.lifecycle.ViewModel
import com.example.android4homework4mc6.data.repositories.VideoCategoryRepository
import com.example.android4homework4mc6.data.repositories.VideosRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class YouTubeViewModel @Inject constructor(
    private val videoCategoryRepository: VideoCategoryRepository,
    private val videosRepository: VideosRepository
) : ViewModel() {


    fun fetchVideos(id: String?) = videosRepository.fetchVideos(id)

    fun fetchVideoCategory() = videoCategoryRepository.fetchVideoCategory()

}