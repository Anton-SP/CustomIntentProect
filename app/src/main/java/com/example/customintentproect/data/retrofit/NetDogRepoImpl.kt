package com.example.customintentproect.data.retrofit

import com.example.customintentproect.domain.DogEntity
import com.example.customintentproect.domain.DogRepo
import io.reactivex.rxjava3.core.Single

class NetDogRepoImpl(val dogApi: DogsApi) : DogRepo {

    override fun getDog(): Single<DogEntity> =
        dogApi.getData().map { dto -> dto.convertDtoToEntity() }
}