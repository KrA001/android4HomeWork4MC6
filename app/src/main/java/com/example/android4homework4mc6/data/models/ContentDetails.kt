package com.example.android4homework4mc6.data.models

import com.example.android4homework4mc6.data.models.ContentRating
import com.example.android4homework4mc6.data.models.RegionRestriction
import com.google.gson.annotations.SerializedName

data class ContentDetails(
    @SerializedName("duration")
    val duration: String,
    @SerializedName("licensedContent")
    val licensedContent: String,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("definition")
    val definition: String,
    @SerializedName("contentRating")
    val contentRating: ContentRating,
    @SerializedName("hasCustomThumbnail")
    val hasCustomThumbnail: String,
    @SerializedName("regionRestriction")
    val regionRestriction: RegionRestriction,
    @SerializedName("projection")
    val projection: String,
    @SerializedName("dimension")
    val dimension: String
)