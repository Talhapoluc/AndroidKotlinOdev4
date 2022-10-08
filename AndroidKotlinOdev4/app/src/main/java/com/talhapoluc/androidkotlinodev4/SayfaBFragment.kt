package com.talhapoluc.androidkotlinodev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.talhapoluc.androidkotlinodev4.databinding.FragmentSayfaABinding
import com.talhapoluc.androidkotlinodev4.databinding.FragmentSayfaBBinding


class SayfaBFragment : Fragment() {
    private lateinit var tasarim : FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        tasarim = FragmentSayfaBBinding.inflate(inflater, container, false)

        tasarim.buttonGitY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfaYGecis)
        }

        return tasarim.root
    }
}