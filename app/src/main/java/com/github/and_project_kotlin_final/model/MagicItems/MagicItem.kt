package com.github.and_project_kotlin_final.model.MagicItems

import androidx.room.Entity
import androidx.room.PrimaryKey

data class MagicItemResult(val MagicItems: List<MagicItem>)

@Entity
data class MagicItem(
    private val index: String,
    private val name: String,
    private val desc: String
)
