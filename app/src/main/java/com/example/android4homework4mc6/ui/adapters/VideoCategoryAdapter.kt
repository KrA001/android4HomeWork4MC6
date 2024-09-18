package com.example.android4homework4mc6.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android4homework4mc6.databinding.ItemYoutubeRecyclerviewHorizontalBinding
import com.example.android4homework4mc6.data.models.videocategory.VideoCategory

class VideoCategoryAdapter(private val onItemClick: (id: String?) -> Unit) :
    ListAdapter<VideoCategory, VideoCategoryAdapter.CategoryViewHolder>(DiffUtilCallback()) {

    inner class CategoryViewHolder(private val binding: ItemYoutubeRecyclerviewHorizontalBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            binding.materialButton.setOnClickListener {
                getItem(absoluteAdapterPosition)?.let {
                    onItemClick(it.id)
                }
            }
        }

        fun onBind(item: VideoCategory) = with(binding) {
            materialButton.text = item.snippet.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            ItemYoutubeRecyclerviewHorizontalBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {
        class DiffUtilCallback : DiffUtil.ItemCallback<VideoCategory>() {
            override fun areItemsTheSame(oldItem: VideoCategory, newItem: VideoCategory): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: VideoCategory,
                newItem: VideoCategory,
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}

