package com.github.and_project_kotlin_final.client

import android.os.AsyncTask
import com.github.and_project_kotlin_final.model.MagicItems.MagicItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DndAPI {
    @GET("spells/acid-arrow/")
    fun getMagicItems(): Call<MagicItemResponse>

}