package com.example.android4homework4mc6.ui.fragments.youtube

import android.util.Log
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android4homework4mc6.R
import com.example.android4homework4mc6.base.BaseFragment
import com.example.android4homework4mc6.databinding.FragmentYouTubeBinding
import com.example.android4homework4mc6.ui.adapters.VideoCategoryAdapter
import com.example.android4homework4mc6.ui.adapters.VideosAdapter
import com.example.android4homework4mc6.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class YouTubeFragment :
    BaseFragment<FragmentYouTubeBinding, YouTubeViewModel>(R.layout.fragment_you_tube) {

    override val binding by viewBinding(FragmentYouTubeBinding::bind)
    override val viewModel by viewModels<YouTubeViewModel>()
    private val videosAdapter = VideosAdapter()
    private val videoCategoryAdapter = VideoCategoryAdapter(this::onItemClick)

    private fun onItemClick(id: String?) {
        viewModel.fetchVideos(id).observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    Log.e("anime", it.message.toString())
                }

                is Resource.Loading -> {
                    Log.e("anime", it.message.toString())
                }

                is Resource.Success -> {
                    videosAdapter.submitList(it.data?.items)
                    Log.d("anime", it.data?.items.toString())
                }
            }
        }
    }

    override fun initialize() {
        binding.recyclerviewYouTube.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = videosAdapter
        }

        binding.recyclerviewYouTubeHorizontal.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = videoCategoryAdapter
        }
    }

    override fun setupSubscribes() {
        videoCategorySubscribe()
        videosSubscribe()
    }

    private fun videosSubscribe() {
        viewModel.fetchVideos("0").observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    Log.e("anime", it.message.toString())

                }

                is Resource.Loading -> {

                }

                is Resource.Success -> {
                    videosAdapter.submitList(it.data?.items)
                    Log.d("anime", it.data?.items.toString())
                }
            }
        }
    }

    private fun videoCategorySubscribe() {
        viewModel.fetchVideoCategory().observe(viewLifecycleOwner) {
            when (it) {
                is Resource.Error -> {
                    Log.e("anime", it.message.toString())

                }

                is Resource.Loading -> {

                }

                is Resource.Success -> {
                    videoCategoryAdapter.submitList(it.data?.items)
                    Log.d("anime", it.data?.items.toString())
                }
            }
        }
    }
}