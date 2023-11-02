package kz.course.justcodehw4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kz.course.justcodehw4.R
import kz.course.justcodehw4.databinding.FragmentMainBinding
import androidx.navigation.fragment.findNavController

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(LayoutInflater.from(context), container, false)

        /*get started*/
        binding.btnGetStarted.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_archiveFragment)
        }

        return binding.root
    }

}