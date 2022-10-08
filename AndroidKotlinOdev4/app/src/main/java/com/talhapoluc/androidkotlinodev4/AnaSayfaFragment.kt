package com.talhapoluc.androidkotlinodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talhapoluc.androidkotlinodev4.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {
private lateinit var tasarim : FragmentAnaSayfaBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        tasarim.buttonGitA.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaAGecis)

        }
        tasarim.buttonGitX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaXGecis)

        }

        return tasarim.root
    }
}