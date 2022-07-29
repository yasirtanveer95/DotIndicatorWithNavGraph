package com.example.dotinticatornavgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dotinticatornavgraph.databinding.FragmentBlank1Binding


class BlankFragment1 : Fragment() {
    lateinit var viewBinding: FragmentBlank1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentBlank1Binding.inflate(layoutInflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.tvFragment1.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment1_to_blankFragment2)
        }
    }

}