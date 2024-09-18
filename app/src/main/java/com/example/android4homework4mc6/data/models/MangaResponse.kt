package com.example.android4homework4mc6.data.models

import com.google.gson.annotations.SerializedName

data class MangaResponse<T>(
    @SerializedName("data")
    val data: List<T>
)