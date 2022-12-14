package com.talhapoluc.androidkotlinodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talhapoluc.androidkotlinodev4.databinding.FragmentSayfaABinding


class SayfaAFragment : Fragment() {
    private lateinit var tasarim : FragmentSayfaABinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSayfaABinding.inflate(inflater, container, false)

        tasarim.buttonGitB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaBGecis)
        }


        return tasarim.root
    }
}