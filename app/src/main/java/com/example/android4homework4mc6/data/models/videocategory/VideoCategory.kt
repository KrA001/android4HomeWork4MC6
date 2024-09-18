package com.example.android4homework4mc6.data.models.videocategory

import com.example.android4homework4mc6.data.models.ContentDetails
import com.example.android4homework4mc6.data.models.FileDetails
import com.example.android4homework4mc6.data.models.LiveStreamingDetails
import com.example.android4homework4mc6.data.models.Localizations
import com.example.android4homework4mc6.data.models.Player
import com.example.android4homework4mc6.data.models.ProcessingDetails
import com.example.android4homework4mc6.data.models.RecordingDetails
import com.example.android4homework4mc6.data.models.Snippet
import com.example.android4homework4mc6.data.models.Statistics
import com.example.android4homework4mc6.data.models.Status
import com.example.android4homework4mc6.data.models.Suggestions
import com.example.android4homework4mc6.data.models.TopicDetails
import com.google.gson.annotations.SerializedName

data class  VideoCategory(
    @SerializedName("snippet")
    val snippet: Snippet,
    @SerializedName("fileDetails")
    val fileDetails: FileDetails,
    @SerializedName("localizations")
    val localizations: Localizations,
    @SerializedName("kind")
    val kind: String = "",
    @SerializedName("recordingDetails")
    val recordingDetails: RecordingDetails,
    @SerializedName("contentDetails")
    val contentDetails: ContentDetails,
    @SerializedName("topicDetails")
    val topicDetails: TopicDetails,
    @SerializedName("processingDetails")
    val processingDetails: ProcessingDetails,
    @SerializedName("liveStreamingDetails")
    val liveStreamingDetails: LiveStreamingDetails,
    @SerializedName("etag")
    val etag: String = "",
    @SerializedName("suggestions")
    val suggestions: Suggestions,
    @SerializedName("id")
    val id: String,
    @SerializedName("status")
    val status: Status,
    @SerializedName("statistics")
    val statistics: Statistics,
    @SerializedName("player")
    val player: Player,
)