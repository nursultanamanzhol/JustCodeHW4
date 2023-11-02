package kz.course.justcodehw4.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class JobsViewAdapter(
    private val items : List<String>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

    }

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }
//
//    class JobsViewHolder(): RecyclerView.ViewHolder(){
//
//    }
}