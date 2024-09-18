package com.example.android4homework4mc6.data.models

import com.google.gson.annotations.SerializedName

data class TagSuggestionsItem(
    @SerializedName("tag")
    val tag: String,
    @SerializedName("categoryRestricts")
    val categoryRestricts: List<String>?
)