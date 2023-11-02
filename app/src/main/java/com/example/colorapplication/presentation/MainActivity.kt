package com.example.colorapplication.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.colorapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.redButton.setOnClickListener {
            startNewActivity(RedActivity::class.java)
        }

        binding.greenButton.setOnClickListener {
            startNewActivity(GreenActivity::class.java)
        }

        binding.blueButton.setOnClickListener {
            startNewActivity(BlueActivity::class.java)
        }
    }

    private fun startNewActivity(cls: Class<*>) {
        val intent = Intent(this, cls)
        startActivity(intent)
    }
}
