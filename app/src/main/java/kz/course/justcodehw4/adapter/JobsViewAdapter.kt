package kz.course.justcodehw4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kz.course.justcodehw4.databinding.ItemJobsBinding

class JobsViewAdapter(
    private val items: List<String>
) : RecyclerView.Adapter<JobsViewAdapter.JobsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobsViewHolder {
        return JobsViewHolder(
            ItemJobsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: JobsViewHolder, position: Int) {
        holder.bindView(items[position])
    }

    class JobsViewHolder(private val binding: ItemJobsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindView(item: String) {
            binding.jobName.text = item
        }

    }
}