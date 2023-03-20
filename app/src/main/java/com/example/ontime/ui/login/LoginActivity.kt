package com.example.ontime.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ontime.ui.main.MainActivity
import com.example.ontime.R
import com.example.ontime.ui.signup.SignUpActivity
import com.example.ontime.ui.forgotPassword.ForgotPasswordActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_main)


        val loginButton = findViewById<Button>(R.id.login_btn)
        val signupButton = findViewById<Button>(R.id.signup_btn)
        val forgotButton = findViewById<Button>(R.id.forgot_password_btn)

        loginButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }

        signupButton.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
            this.finish()
        }

        forgotButton.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }

    
}