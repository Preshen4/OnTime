package com.example.ontime.fragments.ui.addTimeSheet

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ontime.R

class AddTimeSheetFragment : Fragment() {

    companion object {
        fun newInstance() = AddTimeSheetFragment()
    }

    private lateinit var viewModel: AddTimeSheetViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_add_time_sheet, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddTimeSheetViewModel::class.java)
        // TODO: Use the ViewModel
    }

}