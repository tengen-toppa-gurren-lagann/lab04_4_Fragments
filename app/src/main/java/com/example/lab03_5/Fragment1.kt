package com.example.lab03_5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_1, container, false)
        val navController = findNavController()
        
        val btn2Fragment2 = view.findViewById<View>(R.id.btn2second)
        btn2Fragment2.setOnClickListener {
            navController.navigate(R.id.action_fragment1_to_fragment2)
        }
        val navBottom = view.findViewById<View>(R.id.nav_bottom) as BottomNavigationView
        navBottom.setOnNavigationItemReselectedListener {
            navController.navigate(R.id.action_fragment1_to_activityAbout)
        }
        return view
    }
}