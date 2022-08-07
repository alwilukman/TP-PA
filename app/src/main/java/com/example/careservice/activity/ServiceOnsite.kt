package com.example.careservice.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.FragmentMenuUtamaBinding
import com.example.careservice.databinding.ServiceOnsiteBinding

class ServiceOnsite : Fragment() {


    private  lateinit var binding: ServiceOnsiteBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ServiceOnsiteBinding.inflate(
            layoutInflater, container, false
        )

        binding.btnMistsubitshi.setOnClickListener { view: View ->
            view
            findNavController().navigate(R.id.action_serviceOnsite_to_mitsubitshi
            )
        }
        binding.btnSuzuki.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_serviceOnsite_to_suzuki2
            )
        }
        binding.btnToyota.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_serviceOnsite_to_toyota2
            )
        }
        binding.btnDaihatsu.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_serviceOnsite_to_daihatsu2
            )
        }


        return binding.root

    }
}