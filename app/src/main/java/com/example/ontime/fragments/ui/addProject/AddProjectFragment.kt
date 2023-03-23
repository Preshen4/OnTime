package com.example.ontime.fragments.ui.addProject

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ontime.R

class AddProjectFragment : Fragment() {

    companion object {
        fun newInstance() = AddProjectFragment()
    }

    private lateinit var viewModel: AddProjectViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_project, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddProjectViewModel::class.java)
        // TODO: Use the ViewModel
    }

}