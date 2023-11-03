package kz.course.justcodehw4.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kz.course.justcodehw4.MainActivity
import kz.course.justcodehw4.adapter.JobsListDTO
import kz.course.justcodehw4.adapter.JobsListMaker
import kz.course.justcodehw4.adapter.JobsListType
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
        val list: MutableList<JobsListDTO> =
            mutableListOf()//JobsListDTO(JobsListType.TITLE_VIEW, "DESIGNER")
        jobsList.forEachIndexed { index, item ->
            if (index % 5 == 0) list.add(JobsListDTO(JobsListType.TITLE_VIEW, "DESIGNER $index"))
            list.add(JobsListDTO(JobsListType.JOBS_VIEW, item))
        }

        val adapter = JobsViewAdapter(list)
        binding.listRv.adapter = adapter
        /*LayoutManager*/
        val layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
//        val layoutManager = GridLayoutManager(requireContext(), 3, RecyclerView.HORIZONTAL, true)
//        val layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
        binding.listRv.layoutManager = layoutManager


        return binding.root
    }
}