package com.example.lab04_4_Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val navController = findNavController()

        val btn2Fragment2 = view.findViewById<View>(R.id.bnToSecond)
        btn2Fragment2.setOnClickListener {
            navController.navigate(R.id.action_fragment1_to_fragment2)
        }
        return view
    }
}