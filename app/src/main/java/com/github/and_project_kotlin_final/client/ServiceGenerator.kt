package com.github.and_project_kotlin_final.client

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ServiceGenerator {

    private val retrofitBuilder: Retrofit.Builder = Retrofit.Builder()
        .baseUrl("https://www.dnd5eapi.co/api/")
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit: Retrofit = retrofitBuilder.build()
    private val dndAPI: DndAPI = retrofit.create(DndAPI::class.java)

    public fun getDndAPI(): DndAPI {
        return dndAPI
    }
}