package com.github.and_project_kotlin_final.ui.characters

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.and_project_kotlin_final.client.DndAPI
import com.github.and_project_kotlin_final.client.MagicItemResponse
import com.github.and_project_kotlin_final.client.Repository
import com.github.and_project_kotlin_final.model.MagicItems.MagicItem

class CharacterMenuViewModel
: ViewModel() {

    val magicItemSlug : String = "amulet-of-health"

    fun getMagicItems() {
        return Repository().getMagicItems()
    }



}
