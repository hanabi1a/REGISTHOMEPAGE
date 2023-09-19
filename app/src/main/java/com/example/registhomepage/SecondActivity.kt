package com.example.registhomepage

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.registhomepage.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = intent.getStringExtra(MainActivity.EXTRA_FIRST_NAME)
        val lastName = intent.getStringExtra(MainActivity.EXTRA_LAST_NAME)

        if (firstName != null && lastName != null) {
            val welcomeMessage = "Hello! Welcome $firstName $lastName!"
            binding.txtWelcomeMessage.text = welcomeMessage
        }
    }
}
