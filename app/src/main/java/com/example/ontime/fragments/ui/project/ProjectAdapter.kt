package com.example.ontime.fragments.ui.project

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R
// https://www.youtube.com/watch?v=5mdV1hLbXzo
class ProjectAdapter(private val projectList: List<Project>) : RecyclerView.Adapter<ProjectAdapter.ProjectHolder>() {

    //https://www.youtube.com/watch?v=dB9JOsVx-yY

    private lateinit var mlistener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.mlistener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_project, parent, false)
        return ProjectHolder(itemView,mlistener)
    }

    override fun getItemCount(): Int {
        return projectList.size
    }

    override fun onBindViewHolder(holder: ProjectHolder, position: Int) {
        val currentItem = projectList[position]
        holder.projectImage.setImageResource(currentItem.pImage)
        holder.projectName.text = currentItem.pName
        holder.projectDescription.text = currentItem.pDescription
        holder.projectTimeLine.text = currentItem.pTimeLine

    }

    class ProjectHolder(private val projectView: View, listener: OnItemClickListener) : RecyclerView.ViewHolder(projectView){
        val projectImage: ImageView = projectView.findViewById(R.id.project_image)
        val projectName: TextView = projectView.findViewById(R.id.project_name)
        val projectDescription: TextView = projectView.findViewById(R.id.project_description)
        val projectTimeLine: TextView = projectView.findViewById(R.id.project_timeline)

        init {

            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }

        }
    }
}