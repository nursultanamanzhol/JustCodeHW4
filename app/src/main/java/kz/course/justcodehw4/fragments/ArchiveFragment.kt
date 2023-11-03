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
import kz.course.justcodehw4.decoration.OffSetDecoration

class ArchiveFragment : Fragment() {
    private lateinit var binding: FragmentArchiveBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentArchiveBinding.inflate(LayoutInflater.from(context), container, false)


        val adapter = JobsViewAdapter(getTransformedList())

        binding.listRv.addItemDecoration(OffSetDecoration(start = 16, top = 2, end = 16, bottom = 2))

        binding.listRv.adapter = adapter
        /*LayoutManager*/
        val layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)
//        val layoutManager = GridLayoutManager(requireContext(), 3, RecyclerView.HORIZONTAL, true)
//        val layoutManager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
        binding.listRv.layoutManager = layoutManager


        return binding.root
    }

    private fun getTransformedList(): List<JobsListDTO> {
        val jobsList = JobsListMaker.getJobsList(this)
        val list: MutableList<JobsListDTO> =
            mutableListOf()//JobsListDTO(JobsListType.TITLE_VIEW, "DESIGNER")
        jobsList.forEachIndexed { index, item ->
            val previousItem = if (index > 0) jobsList[index - 1] else null

                if (previousItem?.firstOrNull()?.lowercase() != item.firstOrNull()?.lowercase()) {
                list.add(JobsListDTO(JobsListType.TITLE_VIEW, item.firstOrNull().toString()))
            }
            list.add(JobsListDTO(JobsListType.JOBS_VIEW, item))
        }
        return list
    }
}