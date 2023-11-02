package kz.course.justcodehw4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kz.course.justcodehw4.adapter.JobsListMaker
import kz.course.justcodehw4.adapter.JobsViewAdapter
import kz.course.justcodehw4.databinding.FragmentArchiveBinding

class ArchiveFragment : Fragment() {
    private lateinit var binding: FragmentArchiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentArchiveBinding.inflate(LayoutInflater.from(context), container, false)

        val jobsList = JobsListMaker.getJobsList(this)
        val adapter = JobsViewAdapter(jobsList)
        binding.listRv.adapter = adapter

        return binding.root
    }


}