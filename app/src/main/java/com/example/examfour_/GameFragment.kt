package com.example.examfour_

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examfour_.databinding.ActivityMainBinding
import com.example.examfour_.databinding.FragmentGameBinding

class GameFragment : Fragment() {

    private val items = mutableListOf<MutableList<ButtonBlank>>()

    private lateinit var bindingItem: RowRecyclerAdapter
    private lateinit var adapter: RowRecyclerAdapter
    private lateinit var binding: FragmentGameBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val receivedData = arguments?.getString("dimension")


        if (receivedData == "5") {
            items.clear() // Clear the existing items before adding new ones
            repeat(5) {
                items.add(
                    mutableListOf(
                        ButtonBlank(),
                        ButtonBlank(),
                        ButtonBlank(),
                        ButtonBlank(),
                        ButtonBlank()
                    )
                )
            }
        } else if (receivedData == "4") {
            items.clear()
            repeat(4) {
                items.add(mutableListOf(ButtonBlank(), ButtonBlank(), ButtonBlank(), ButtonBlank()))
            }
        } else if (receivedData == "3") {
            items.clear()
            repeat(3) {
                items.add(mutableListOf(ButtonBlank(), ButtonBlank(), ButtonBlank()))
            }
        }

        binding = FragmentGameBinding.inflate(inflater, container, false)

        setUpEquipmentRecycler()
        return binding.root
    }

    private fun setUpEquipmentRecycler() {
        adapter = RowRecyclerAdapter(items)
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = adapter

    }

}



