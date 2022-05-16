package com.syatria.slurrpp.loginregist

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.syatria.slurrpp.MealActivity
import com.syatria.slurrpp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.tvToLogin.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish()
        }

        binding.btnRegister.setOnClickListener {
            val i = Intent(this, MealActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}