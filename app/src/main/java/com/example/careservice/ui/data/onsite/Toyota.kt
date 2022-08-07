package com.example.careservice.ui.data.onsite

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.SuzukiBinding
import com.example.careservice.databinding.ToyotaBinding

class Toyota : Fragment() {

    private  lateinit var binding: ToyotaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.toyota, container, false)
    }
}