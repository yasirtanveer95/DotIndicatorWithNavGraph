package com.example.dotinticatornavgraph

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dotinticatornavgraph.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment() {
    lateinit var viewBinding: FragmentBlank3Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentBlank3Binding.inflate(layoutInflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.tvFragment3.setOnClickListener {
            findNavController().navigate(R.id.action_blankFragment3_to_blankFragment4)
        }
    }

}