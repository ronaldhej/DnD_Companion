package com.github.and_project_kotlin.ui.inventory

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.and_project_kotlin_final.R
import com.github.and_project_kotlin_final.adapter.CharacterAdapter
import com.github.and_project_kotlin_final.model.Characters.Character
import com.github.and_project_kotlin_final.model.InventoryItem
import com.google.android.material.floatingactionbutton.FloatingActionButton


class Inventory : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var CharacterAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager


    private lateinit var viewModel: InventoryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_inventory, container, false)


        val fab: FloatingActionButton = view.findViewById(R.id.floatingActionButtonInventory)
        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        toolbar.inflateMenu(R.menu.menu_inventory)
        fab.setOnClickListener {view ->
            Log.d("BRUH", "Hello")
        }



        val characters: MutableList<Character> = ArrayList()
        val items: MutableCollection<InventoryItem> = ArrayList()

        characters.add(
            Character(
                "Greg",
                items,
                11
            )
        )
        characters.add(
            Character(
                "Dave",
                items,
                6
            )
        )
        characters.add(
            Character(
                "Thor",
                items,
                3
            )
        )
        characters.add(
            Character(
                "bruh",
                items,
                4
            )
        )
        characters.add(
            Character(
                "Rhazksi",
                items,
                2
            )
        )

        viewManager = LinearLayoutManager(context)
        CharacterAdapter = CharacterAdapter(characters)

        recyclerView = view.findViewById(R.id.recyclerViewInventory)
        recyclerView.hasFixedSize()
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = CharacterAdapter

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
