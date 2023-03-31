package com.example.ontime.fragments.ui.project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R
import com.example.ontime.databinding.FragmentProjectBinding
import com.example.ontime.fragments.ui.addProject.AddProjectFragment
import com.google.android.material.snackbar.Snackbar

class ProjectFragment : Fragment() {

    private var _binding: FragmentProjectBinding? = null

    private lateinit var adapter: ProjectAdapter

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<Project>

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
            // Displays the fragment_add_project fragment
            val fragment = AddProjectFragment()
            val transaction = requireActivity().supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container_view, fragment)
            transaction.addToBackStack(null)
            transaction.commit()

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
        // val layoutManager = LinearLayoutManager(context)
        newRecyclerView = view.findViewById(R.id.project_view)
        newRecyclerView.layoutManager = LinearLayoutManager(context)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = ArrayList<Project>()
        adapter = ProjectAdapter(newArrayList)
        // newRecyclerView.adapter = adapter

        getUserData()
    }

    private fun getUserData(){

        newArrayList = ArrayList()

        imageId = arrayOf(
            R.drawable.logo,
            R.drawable.logo,
            R.drawable.logo,
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
            "Project 5",
            "Project 5",
            "Project 5",
        )

        projectDescription = arrayOf(
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5",
            "Description 5",
            "Description 5",
            "Description 5",
        )

        projectDeadline = arrayOf(
            "Deadline 1",
            "Deadline 2",
            "Deadline 3",
            "Deadline 4",
            "Deadline 5",
            "Deadline 5",
            "Deadline 5",
            "Deadline 5",
        )


        for (i in imageId.indices){
            val project = Project(imageId[i], projectName[i], projectDescription[i], projectDeadline[i])
            newArrayList.add(project)
        }

        var adapter = ProjectAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        adapter.setOnItemClickListener(object: ProjectAdapter.OnItemClickListener{
            override fun onItemClick(position: Int) {
                // Open fragment_project_description
                // This code works to change the view

              /*  val fragment = ProjectDescriptionFragment()
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.all_projects_fragments, fragment)
                transaction.addToBackStack(null)
                transaction.commit()*/


                // Toast.makeText(context, "Item $position clicked", Toast.LENGTH_SHORT).show()
                /*val heading : EditText = view!!.findViewById(R.id.project_name)
                val description : EditText = view!!.findViewById(R.id.project_description)
                val image : ImageView = view!!.findViewById(R.id.project_image)
                val timeline : EditText = view!!.findViewById(R.id.project_timeline)
                val bundle = Bundle()
                bundle.putString("heading", heading.text.toString())
                bundle.putString("description", description.text.toString())
                bundle.putString("deadline", timeline.text.toString())
                bundle.putInt("image", image.id)
                val fragment = ProjectDescriptionFragment()
                fragment.arguments = bundle
                val transaction = requireActivity().supportFragmentManager.beginTransaction()
                transaction.replace(R.id.all_projects_fragments, fragment)
                transaction.addToBackStack(null)
                transaction.commit()*/

            }


        })
    }
}