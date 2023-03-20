package com.example.ontime.ui.projects

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R
import com.example.ontime.databinding.FragmentProjectBinding
import com.google.android.material.snackbar.Snackbar

class ProjectFragment : Fragment() {

    private var _binding: FragmentProjectBinding? = null

    private lateinit var adapter: ProjectAdapter
    private lateinit var recyclerView: RecyclerView
    private lateinit var projectList : ArrayList<Project>

    lateinit var imageId : Array<Int>
    lateinit var projectName : Array<String>
    lateinit var projectDescription : Array<String>
    lateinit var projectDeadline : Array<String>

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentProjectBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.addProjectBtn.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // https://www.youtube.com/watch?v=5mdV1hLbXzo
        dataInit()
        val layoutManager = LinearLayoutManager(context)
        recyclerView = view.findViewById(R.id.project_view)
        recyclerView.layoutManager = layoutManager
        recyclerView.setHasFixedSize(true)
        adapter = ProjectAdapter(projectList)
        recyclerView.adapter = adapter
    }

    private fun dataInit(){

        projectList = ArrayList<Project>()

        imageId = arrayOf(
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
        )

        projectName = arrayOf(
            "Project 1",
            "Project 2",
            "Project 3",
            "Project 4",
            "Project 5",
        )

        projectDescription = arrayOf(
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5",
        )

        projectDeadline = arrayOf(
            "Deadline 1",
            "Deadline 2",
            "Deadline 3",
            "Deadline 4",
            "Deadline 5",
        )

        for (i in imageId.indices){
            val project = Project(imageId[i], projectName[i], projectDescription[i], projectDeadline[i])
            projectList.add(project)
        }
    }
}
