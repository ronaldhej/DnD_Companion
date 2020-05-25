package com.github.and_project_kotlin_final.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.and_project_kotlin_final.R
import com.github.and_project_kotlin_final.model.Character

class CharacterAdapter(private val characters: MutableList<Character>) :
    RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvName: TextView = view.findViewById(R.id.tv_character_name)
        val tvLevel: TextView = view.findViewById(R.id.tv_character_level)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_character, parent, false)

        return ViewHolder(view);
    }

    override fun getItemCount(): Int {
        return characters.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = characters[position].name
        holder.tvLevel.text = "LVL: " + characters[position].level.toString()
    }



}