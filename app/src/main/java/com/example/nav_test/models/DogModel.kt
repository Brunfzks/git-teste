package com.example.nav_test.models

import com.google.gson.annotations.SerializedName

class DogModel {

    @SerializedName("url")
    lateinit var url: String

    @SerializedName("fileSizeBytes")
    lateinit var fileSizeBytes: String
}