package com.github.and_project_kotlin_final.ui.inventory.detailed

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.and_project_kotlin_final.R


class InventoryItemDetailed : Fragment() {

    companion object {
        fun newInstance() =
            InventoryItemDetailed()
    }

    private lateinit var viewModel: InventoryItemDetailedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_inventory_item_detailed, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(InventoryItemDetailedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
