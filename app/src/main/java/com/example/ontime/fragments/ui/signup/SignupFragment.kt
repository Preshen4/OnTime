package com.example.ontime.fragments.ui.signup

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ontime.R
import com.example.ontime.databinding.FragmentLoginBinding
import com.example.ontime.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {

    private lateinit var binding : FragmentSignupBinding
    companion object {
        fun newInstance() = SignupFragment()
    }

    private lateinit var viewModel: SignupViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_signup, container, false)
        val btnBack = view.findViewById<View>(R.id.btnSignUpBack)
        btnBack.setOnClickListener(){
            requireActivity().onBackPressedDispatcher.onBackPressed()
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SignupViewModel::class.java)
        // TODO: Use the ViewModel
    }

}