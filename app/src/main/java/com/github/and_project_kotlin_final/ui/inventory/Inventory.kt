package com.github.and_project_kotlin.ui.inventory

import android.app.ActionBar
import android.app.Activity
import android.app.SearchManager
import android.content.Context
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.widget.AppCompatSeekBar
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.Toolbar
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.appcompat.widget.SearchView
import androidx.core.content.getSystemService
import androidx.core.view.MenuItemCompat
import com.github.and_project_kotlin_final.R
import com.github.and_project_kotlin_final.adapter.InventoryAdapter
import com.github.and_project_kotlin_final.model.InventoryItem


class Inventory : Fragment()  {
    private lateinit var recyclerView: RecyclerView
    private lateinit var InventoryAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    private lateinit var viewModel: InventoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_inventory, container, false)


        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        toolbar.inflateMenu(R.menu.menu_inventory)




        val inventoryData: MutableList<InventoryItem> = ArrayList()
        inventoryData.add(InventoryItem("Sword", 1))
        inventoryData.add(InventoryItem("Potion", 6))
        inventoryData.add(InventoryItem("Gold", 98))
        inventoryData.add(InventoryItem("Bucket", 1))
        inventoryData.add(InventoryItem("Sword", 1))
        inventoryData.add(InventoryItem("Potion", 6))
        inventoryData.add(InventoryItem("Gold", 98))
        inventoryData.add(InventoryItem("Bucket", 1))
        inventoryData.add(InventoryItem("Sword", 1))
        inventoryData.add(InventoryItem("Potion", 6))
        inventoryData.add(InventoryItem("Gold", 98))
        inventoryData.add(InventoryItem("Bucket", 1))


        viewManager = LinearLayoutManager(context)
        InventoryAdapter = InventoryAdapter(inventoryData)

        recyclerView = view.findViewById(R.id.recyclerViewInventory)
        recyclerView.hasFixedSize()
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = InventoryAdapter

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*
        val navController = findNavController()
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        view.findViewById<Toolbar>(R.id.toolbar).setupWithNavController(navController, appBarConfiguration)
*/
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    override fun onPrepareOptionsMenu(menu: Menu) {
        super.onPrepareOptionsMenu(menu)
        val searchManager = activity?.getSystemService(Context.SEARCH_SERVICE)
    }







}
