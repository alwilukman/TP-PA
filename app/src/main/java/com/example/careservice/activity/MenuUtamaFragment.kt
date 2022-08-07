package com.example.careservice.activity

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.careservice.R
import com.example.careservice.databinding.FragmentMenuUtamaBinding

class MenuUtamaFragment : Fragment() {

    private lateinit var binding: FragmentMenuUtamaBinding

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.option_menu, menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_about) {
            findNavController().navigate(
                R.id.action_menuUtamaFragment_to_aboutFragment)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuUtamaBinding.inflate(layoutInflater, container, false
        )

        binding.btnServicesite.setOnClickListener { view: View ->
            view
            findNavController().navigate(
                R.id.action_menuUtamaFragment_to_serviceOnsite
            )
        }
        binding.btnServicehome.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_menuUtamaFragment_to_serviceAthome
            )
        }
        binding.btnpromo.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_menuUtamaFragment_to_promoFragment
            )
        }
        binding.btnSos.setOnClickListener { view: View ->
            view.findNavController().navigate(
                R.id.action_menuUtamaFragment2_to_SOS
            )
        }

        setHasOptionsMenu(true)
        return binding.root

    }
}