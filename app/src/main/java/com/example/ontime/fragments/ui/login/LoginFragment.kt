package com.example.ontime.fragments.ui.login

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.navigation.Navigation
import com.example.ontime.R
import com.example.ontime.activitys.MainActivity
import com.example.ontime.databinding.FragmentLoginBinding
import com.example.ontime.fragments.ui.forgotpassword.ForgotpasswordFragment
import com.example.ontime.fragments.ui.signup.SignupFragment

class LoginFragment : Fragment() {

    private lateinit var binding : FragmentLoginBinding

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Set onclick event for login button
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        binding.loginBtn.setOnClickListener {
            Toast.makeText(context, "Login button clicked", Toast.LENGTH_SHORT).show()
        }

        val view = inflater.inflate(R.layout.fragment_login, container, false)
        val signupBtn = view.findViewById<View>(R.id.signup_btn)
        val loginBtn = view.findViewById<View>(R.id.login_btn)
        val forgotBtn = view.findViewById<View>(R.id.forgot_password_btn)

        signupBtn.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_signupFragment)
        }

        forgotBtn.setOnClickListener(){
            Navigation.findNavController(view).navigate(R.id.action_loginFragment_to_forgotpasswordFragment)
        }


        login(loginBtn as Button)


        return view
    }

    // Set onclick event for signup button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.signupBtn.setOnClickListener {
            Toast.makeText(context, "Signup button clicked", Toast.LENGTH_SHORT).show()
        }
    }

    private fun login(loginBtn : Button){

        loginBtn.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            startActivity(intent)
        }
    }


}