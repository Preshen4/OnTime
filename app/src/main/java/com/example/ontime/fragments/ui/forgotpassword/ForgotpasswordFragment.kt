package com.example.ontime.fragments.ui.forgotpassword

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ontime.R

class ForgotpasswordFragment : Fragment() {

    companion object {
        fun newInstance() = ForgotpasswordFragment()
    }

    private lateinit var viewModel: ForgotpasswordViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_forgotpassword, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ForgotpasswordViewModel::class.java)
        // TODO: Use the ViewModel
    }

}