package com.example.ontime.ui.projects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R
// https://www.youtube.com/watch?v=5mdV1hLbXzo
class ProjectAdapter(private val projectList: List<Project>) : RecyclerView.Adapter<ProjectAdapter.ProjectHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProjectHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.project_card, parent, false)
        return ProjectHolder(itemView)
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

    class ProjectHolder(val projectView: View) : RecyclerView.ViewHolder(projectView){
        val projectImage = projectView.findViewById<ImageView>(R.id.project_image)
        val projectName = projectView.findViewById<TextView>(R.id.project_name)
        val projectDescription = projectView.findViewById<TextView>(R.id.project_description)
        val projectTimeLine = projectView.findViewById<TextView>(R.id.project_timeline)

    }
}