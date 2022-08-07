package com.example.careservice.ui.data.athome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.FragmentDaihatsuHomeBinding
import com.example.careservice.databinding.FragmentMitsubishiHomeBinding
import com.example.careservice.databinding.FragmentSuzukiHomeBinding

class SuzukiHomeFragment : Fragment() {


    private  lateinit var binding: FragmentSuzukiHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSuzukiHomeBinding.inflate(
            layoutInflater, container, false
        )

        binding.btnsuzuki1.setOnClickListener { view: View ->
            view
            findNavController().navigate(R.id.action_suzukiHomeFragment_to_transaksi
            )
        }
        return binding.root
    }
}