package com.example.android4homework4mc6.data.models

import com.example.android4homework4mc6.data.models.TagSuggestionsItem
import com.google.gson.annotations.SerializedName

data class Suggestions(
    @SerializedName("processingWarnings")
    val processingWarnings: List<String>?,
    @SerializedName("processingErrors")
    val processingErrors: List<String>?,
    @SerializedName("editorSuggestions")
    val editorSuggestions: List<String>?,
    @SerializedName("processingHints")
    val processingHints: List<String>?,
    @SerializedName("tagSuggestions")
    val tagSuggestions: List<TagSuggestionsItem>?
)