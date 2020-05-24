package com.github.and_project_kotlin_final.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.github.and_project_kotlin_final.R
import com.github.and_project_kotlin_final.model.InventoryItem

class InventoryAdapter(private val itemDataset: MutableList<InventoryItem>) :
        RecyclerView.Adapter<InventoryAdapter.ViewHolder>() {

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvName: TextView = view.findViewById(R.id.tv_item_name)
            val tvQuantity : TextView = view.findViewById(R.id.tv_quantity)
        }


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item_inventory_item, parent, false)

                return ViewHolder(view);
        }

        override fun getItemCount(): Int {
            return itemDataset.size
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.tvName.text = itemDataset[position].name
            holder.tvQuantity.text = itemDataset[position].quantity.toString()
        }



}