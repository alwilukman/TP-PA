package com.example.careservice.ui.data.athome

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.FragmentDaihatsuHomeBinding
import com.example.careservice.databinding.ServiceHomeBinding


class DaihatsuHomeFragment : Fragment() {


    private  lateinit var binding: FragmentDaihatsuHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDaihatsuHomeBinding.inflate(
            layoutInflater, container, false
        )

        binding.btndaihatsut1.setOnClickListener { view: View ->
            view
            findNavController().navigate(R.id.action_daihatsuHomeFragment_to_transaksi
            )
        }
        return binding.root
    }
}