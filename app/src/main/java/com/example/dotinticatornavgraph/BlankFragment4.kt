package com.example.dotinticatornavgraph

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.dotinticatornavgraph.databinding.FragmentBlank4Binding

class BlankFragment4 : Fragment() {
    lateinit var viewBinding: FragmentBlank4Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        viewBinding = FragmentBlank4Binding.inflate(layoutInflater, container, false)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.tvFragment4.setOnClickListener {
            requireActivity().setResult(Activity.RESULT_OK, Intent().putExtra("test", 1))
            requireActivity().finish()
        }
    }

}