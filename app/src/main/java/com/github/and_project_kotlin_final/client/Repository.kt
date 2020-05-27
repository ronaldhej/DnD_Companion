package com.github.and_project_kotlin_final.client

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.github.and_project_kotlin_final.model.MagicItems.MagicItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository
{
    var result: MagicItemResponse? = null

    fun getMagicItems() {
        var spellData: MagicItemResponse? = null
        val dndAPI: DndAPI = ServiceGenerator().getDndAPI()
        val call: Call<MagicItemResponse> = dndAPI.getMagicItems()
        Log.d("API", "Attempting to use api")
        val callback = object : Callback<MagicItemResponse> {
            override fun onFailure(call: Call<MagicItemResponse>, t: Throwable) {
                Log.i("API", "Error: $t")
            }
            override fun onResponse(
                call: Call<MagicItemResponse>,
                response: Response<MagicItemResponse>
            )   {
                if (response.code() == 200) {
                    spellData = response.body()!!
                    result = spellData
                    Log.d("API", "before leaving call: " + spellData!!.name)
                }
            }

        }
        call.enqueue(callback)
    }
}