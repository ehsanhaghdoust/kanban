package ehsan.haghdoust.kanban.view.adpater

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import ehsan.haghdoust.kanban.R
import ehsan.haghdoust.kanban.model.Project

class ProjectsAdapter(private val dataSet: Array<Project>,private val clickInterface: AdapterItemClicked): RecyclerView.Adapter<ProjectsAdapter.ViewHolder>() {
    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_project_layout_view, parent, false)
        context = parent.context
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titleTextView.text = "${context.resources.getText(R.string.project)} $position"
        holder.nameTextView.text = dataSet[position].name
        holder.itemView.setOnClickListener {
            clickInterface.onClick()
        }

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    class ViewHolder(viewHolder: View): RecyclerView.ViewHolder(viewHolder) {

        val titleTextView: TextView = viewHolder.findViewById(R.id.projectTitleTextView)
        val nameTextView: TextView = viewHolder.findViewById(R.id.projectNameTextView)
    }
}

public interface AdapterItemClicked{
    fun onClick()
}