package com.example.android4homework4mc6.data.models

import com.google.gson.annotations.SerializedName

data class PageInfo(
    @SerializedName("totalResults")
    val totalResults: String,
    @SerializedName("resultsPerPage")
    val resultsPerPage: String
)