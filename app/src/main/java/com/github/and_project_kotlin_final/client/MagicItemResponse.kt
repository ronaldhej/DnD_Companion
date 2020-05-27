package com.github.and_project_kotlin_final.client

import com.github.and_project_kotlin_final.model.MagicItems.MagicItem
import com.google.gson.annotations.SerializedName

data class MagicItemResponse(
    @SerializedName("_id") val _id : String,
    @SerializedName("index") val index : String,
    @SerializedName("name") val name : String,
    @SerializedName("desc") val desc : List<String>,
    @SerializedName("higher_level") val higher_level : List<String>,
    @SerializedName("range") val range : String,
    @SerializedName("components") val components : List<String>,
    @SerializedName("material") val material : String,
    @SerializedName("ritual") val ritual : Boolean,
    @SerializedName("duration") val duration : String,
    @SerializedName("concentration") val concentration : Boolean,
    @SerializedName("casting_time") val casting_time : String,
    @SerializedName("level") val level : Int,
    @SerializedName("school") val school : School,
    @SerializedName("classes") val classes : List<Classes>,
    @SerializedName("subclasses") val subclasses : List<Subclasses>,
    @SerializedName("url") val url : String
)

data class School (
    @SerializedName("name")val name: String,
    @SerializedName("url")val url: String
)

data class Classes(
    @SerializedName("name")val name: String,
    @SerializedName("url")val url: String
)

data class Subclasses(
    @SerializedName("name")val name: String,
    @SerializedName("url")val url: String
)




