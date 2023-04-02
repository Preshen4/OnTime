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

    companion object {
        fun newInstance() = TimeSheetFragment()
    }
    private var _binding: FragmentTimeSheetBinding? = null

    private lateinit var viewModel: TimeSheetViewModel

    private val binding get() = _binding!!

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

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TimeSheetViewModel::class.java)
        // TODO: Use the ViewModel
    }


}