package com.example.lab03_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_2, container, false)
        val navController = findNavController()

        val btn2Fragment3 = view.findViewById<View>(R.id.btn2third)
        btn2Fragment3.setOnClickListener {
            navController.navigate(R.id.action_fragment2_to_fragment3)
        }

        val btn2Fragment1 = view.findViewById<View>(R.id.btn2first)
        btn2Fragment1.setOnClickListener {
            navController.navigate(R.id.action_fragment2_to_fragment1)
        }
        return view
    }
}