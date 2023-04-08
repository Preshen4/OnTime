package com.example.ontime.fragments.ui.addProject

import android.app.DatePickerDialog
import android.content.DialogInterface
import android.icu.util.Calendar
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ontime.R
import com.example.ontime.databinding.FragmentAddProjectBinding


class AddProjectFragment : Fragment() {
    private var _binding: FragmentAddProjectBinding? = null

    private val binding get() = _binding!!
    companion object {
        fun newInstance() = AddProjectFragment()
    }

    private lateinit var viewModel: AddProjectViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddProjectBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.btnStartDate.setOnClickListener {
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

            val datePickerDialog = DatePickerDialog(requireContext(), null, year, month, dayOfMonth)
            datePickerDialog.setButton(DialogInterface.BUTTON_POSITIVE, "OK") { dialog, which ->
                // Handle date selection here
            }
            datePickerDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel") { dialog, which ->
                // Handle cancel button click here
            }

            val customView = layoutInflater.inflate(R.layout.custom_date_picker_dialog, null)
            datePickerDialog.setView(customView)
            datePickerDialog.show()
        }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddProjectViewModel::class.java)
        // TODO: Use the ViewModel
    }

}