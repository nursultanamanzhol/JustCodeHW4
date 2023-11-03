package kz.course.justcodehw4.adapter

import android.content.Context
import kz.course.justcodehw4.R
import kz.course.justcodehw4.fragments.ArchiveFragment

object JobsListMaker {
    private val stringList = mutableListOf(
        R.string.Mobile_Developer,
        R.string.Mobile_Developer_Junior,
        R.string.Mobile_Developer_Senior,
        R.string.Web_Developer_Senior,
        R.string.Web_Developer_Junior,
        R.string.Web_Developer,
        R.string.Database_Administrator_Senior,
        R.string.Database_Administrator_Junior,
        R.string.Database_Administrator,
        R.string.Systems_Analyst,
        R.string.UX_developer_Senior,
        R.string.UX_developer_Junior,
        R.string.UX_developer,
        R.string.Machine_Learning_Engineer,
        R.string.Backend_developer_Senior,
        R.string.Backend_developer_Junior,
        R.string.Backend_developer,
        R.string.Front_end_Developer_Senior,
        R.string.Front_end_Developer_Junior,
        R.string.Front_end_Developer
    )


    fun getJobsList(context: ArchiveFragment): List<String> {
        val list: MutableList<String> = mutableListOf()
        stringList.forEach {
            list.add(context.getString(it))
        }

        list.sortBy { it.firstOrNull() }

        return list
    }
}