package com.github.and_project_kotlin_final.model.Characters

import com.github.and_project_kotlin_final.model.InventoryItem

data class Character(val name: String, val items: MutableCollection<InventoryItem>, val level: Int)