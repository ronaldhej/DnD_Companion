package com.github.and_project_kotlin_final.ui.characters

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.and_project_kotlin_final.R
import com.github.and_project_kotlin_final.adapter.CharacterAdapter
import com.github.and_project_kotlin_final.client.Repository
import com.github.and_project_kotlin_final.model.Characters.Character
import com.github.and_project_kotlin_final.model.InventoryItem


class CharacterMenu : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var CharacterAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var viewModel: CharacterMenuViewModel
    private lateinit var btn_api_test: Button

    companion object {
        fun newInstance() =
            CharacterMenu()
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_characters, container, false)
        btn_api_test = view.findViewById(R.id.btn_api_test)

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
                "Ron",
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

        recyclerView = view.findViewById(R.id.recyclerViewCharacters)
        recyclerView.hasFixedSize()
        recyclerView.layoutManager = viewManager
        recyclerView.adapter = CharacterAdapter

        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CharacterMenuViewModel::class.java)
        // TODO: Use the ViewModel
        btn_api_test.setOnClickListener{view ->
            Repository().getMagicItems()
            Log.d("UI", "UI Result: " + Repository().result)
        }

    }

}
