package com.example.ontime.fragments.ui.timeSheet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R
import com.example.ontime.databinding.FragmentProjectBinding
import com.example.ontime.databinding.FragmentTimeSheetBinding
import com.example.ontime.fragments.ui.project.Project
import com.example.ontime.fragments.ui.project.ProjectAdapter
import java.util.ArrayList

class TimeSheetFragment : Fragment() {

    private var _binding: FragmentTimeSheetBinding? = null

    private val binding get() = _binding!!


    private lateinit var adapter: TimeSheetAdapter

    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList : ArrayList<TimeSheet>

    lateinit var imageId : Array<Int>
    lateinit var timeSheetDescription : Array<String>
    lateinit var timeSheetHours : Array<String>
    lateinit var timeSheetCategory : Array<String>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentTimeSheetBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.addTimesheetBtn.setOnClickListener() {
            NavHostFragment.findNavController(this).navigate(R.id.action_nav_time_sheet_to_addTimeSheetFragment)
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
        newRecyclerView = view.findViewById(R.id.timesheet_view)
        newRecyclerView.layoutManager = LinearLayoutManager(context)
        newRecyclerView.setHasFixedSize(true)
        newArrayList = ArrayList<TimeSheet>()
        adapter = TimeSheetAdapter(newArrayList)
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

        timeSheetCategory = arrayOf(
            "Project 1",
            "Project 2",
            "Project 3",
            "Project 4",
            "Project 5",
            "Project 5",
            "Project 5",
            "Project 5",
        )

        timeSheetDescription = arrayOf(
            "Description 1",
            "Description 2",
            "Description 3",
            "Description 4",
            "Description 5",
            "Description 5",
            "Description 5",
            "Description 5",
        )

        timeSheetHours = arrayOf(
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
            val project = TimeSheet(imageId[i], timeSheetCategory[i], timeSheetDescription[i], timeSheetHours[i])
            newArrayList.add(project)
        }
        var adapter = TimeSheetAdapter(newArrayList)
        newRecyclerView.adapter = adapter
        /*adapter.setOnItemClickListener(object: ProjectAdapter.OnItemClickListener {
            override fun onItemClick(position: Int) {

                NavHostFragment.findNavController(this@ProjectFragment  ).navigate(R.id.action_nav_project_to_timeSheetFragment)
            }

            override fun onAddButtonClicked(position: Int) {
                NavHostFragment.findNavController(this@ProjectFragment  ).navigate(R.id.action_nav_project_to_nav_add_time_sheet)
            }

            override fun onDeleteButtonClicked(position: Int) {
                NavHostFragment.findNavController(this@ProjectFragment  ).navigate(R.id.action_nav_project_to_timeSheetFragment)
            }
        })*/



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


}