package com.example.ontime.activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.navigation.ui.AppBarConfiguration
import com.example.ontime.R
import com.example.ontime.databinding.LoginMainBinding
import com.example.ontime.fragments.ui.login.LoginFragment

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: LoginMainBinding
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)

        val loginFragment = LoginFragment()
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.fragment_container_view, loginFragment).commit()

        /*if (savedInstanceState == null) {
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<LoginFragment>(R.id.fragment_container_view)
            }
        }*/

    }

}