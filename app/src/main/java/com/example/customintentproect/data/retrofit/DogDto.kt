package com.example.customintentproect.data.retrofit

import com.example.customintentproect.domain.DogEntity
import com.google.gson.annotations.SerializedName

data class DogDto(
    @SerializedName("message")
    var message: String? = null,

    @SerializedName("status")
    var status: String? = null

) {
    fun convertDtoToEntity() = DogEntity (message,status)
}