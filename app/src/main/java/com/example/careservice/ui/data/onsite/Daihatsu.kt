package com.example.careservice.ui.data.onsite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.DaihatsuBinding
import com.example.careservice.databinding.ServiceHomeBinding

class Daihatsu : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.daihatsu, container, false)
    }
}