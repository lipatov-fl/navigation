package com.example.navigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import androidx.navigation.fragment.findNavController
import com.example.navigation.R


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnF1 = view.findViewById<Button>(R.id.btnFragm1)
        val btnF2 = view.findViewById<Button>(R.id.btnFragm2)
        val controller = findNavController()
        btnF1.setOnClickListener { controller.navigate(R.id.mainFragment1) }
        btnF2.setOnClickListener { controller.navigate(R.id.mainFragment2) }
    }

}