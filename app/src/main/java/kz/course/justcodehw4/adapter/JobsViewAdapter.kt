package kz.course.justcodehw4.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import kz.course.justcodehw4.databinding.ItemJobsBinding
import kz.course.justcodehw4.databinding.ItemTitleViewBinding

class JobsViewAdapter(
    private val items: List<JobsListDTO>
) : RecyclerView.Adapter<BaseJobsViewHolder<*, String>>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BaseJobsViewHolder<*, String> {
        return if (viewType == JobsListType.TITLE_VIEW.ordinal) {
            TitleViewHolder(
                ItemTitleViewBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
            )
        } else JobsViewHolder(
            ItemJobsBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int = items.size
    override fun onBindViewHolder(holder: BaseJobsViewHolder<*, String>, position: Int) {
        holder.bindView(items[position].name)
//        when (holder) {
//            is JobsViewHolder -> holder.bindView(items[position].name)
//            is TitleViewHolder -> holder.bindView(items[position].name)
//        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position].viewType.ordinal
    }


    class JobsViewHolder(override val binding: ItemJobsBinding) :
        BaseJobsViewHolder<ItemJobsBinding, String>(binding) {
        override fun bindView(item: String) {
            binding.jobName.text = item
        }

    }

    class TitleViewHolder(override val binding: ItemTitleViewBinding) :
        BaseJobsViewHolder<ItemTitleViewBinding, String>(binding) {
        override fun bindView(item: String) {
            binding.root.text = item
        }
    }
}

abstract class BaseJobsViewHolder<VB : ViewBinding, T>(protected open val binding: VB) :
    RecyclerView.ViewHolder(binding.root) {
    abstract fun bindView(item: T)
}

enum class JobsListType {
    TITLE_VIEW, JOBS_VIEW
}

data class JobsListDTO(
    val viewType: JobsListType,
    val name: String
)