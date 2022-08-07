package com.example.careservice.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.ServiceHomeBinding
import com.example.careservice.databinding.ServiceOnsiteBinding

class ServiceAthome: Fragment() {

    private  lateinit var binding: ServiceHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ServiceHomeBinding.inflate(
            layoutInflater, container, false
        )

        binding.btnMitsubishihome.setOnClickListener { view: View ->
            view
            findNavController().navigate(R.id.action_serviceAthome_to_mitsubishiHomeFragment
            )
        }
        binding.btnSuzukihome.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_serviceAthome_to_suzukiHomeFragment
            )
        }
        binding.btnToyotahome.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_serviceAthome_to_toyotaHomeFragment
            )
        }
        binding.btnDaihatsuhome.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_serviceAthome_to_daihatsuHomeFragment
            )
        }


        return binding.root

    }
}