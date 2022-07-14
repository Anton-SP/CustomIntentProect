package com.example.customintentproect.data.retrofit

import com.example.customintentproect.domain.DogEntity
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface DogsApi {
    @GET
    fun getData(): Single<DogDto>
}