package com.example.ontime.ui.projectDescription

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ontime.R

class ProjectDescriptionFragment : Fragment() {

    companion object {
        fun newInstance() = ProjectDescriptionFragment()
    }

    private lateinit var viewModel: ProjectDescriptionViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        /*val view = inflater.inflate(R.layout.fragment_project_description, container, false)
        val projectTitle: TextView = view.findViewById(R.id.project_description_name)
        val projectDescription: TextView = view.findViewById(R.id.project_description_info)
        val projectDeadline: TextView = view.findViewById(R.id.project_description_timeline)
        val projectMinMax : TextView = view.findViewById(R.id.project_description_timeinfo)
        val projectImage : ImageView = view.findViewById(R.id.project_description_image)

        val args = this.arguments
        val inputData = args?.getString("projectName")
        val inputDescription = args?.getString("projectDescription")
        val inputDeadline = args?.getString("projectDeadline")
        val inputMinMax = args?.getString("projectMinMax")
        val inputImage = args?.getInt("projectImage")

        projectTitle.text = inputData
        projectDescription.text = inputDescription
        projectDeadline.text = inputDeadline
        projectMinMax.text = inputMinMax
        projectImage.setImageResource(inputImage!!)*/



        return inflater.inflate(R.layout.fragment_project_description, container, false)
    }

}