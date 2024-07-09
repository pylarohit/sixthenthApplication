package com.rohit.sixthenthapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.rohit.sixthenthapplication.databinding.ActivityMainBinding
import com.rohit.sixthenthapplication.RecyclerActivity


class MainActivity : AppCompatActivity() {
   var binding : ActivityMainBinding? =null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        binding?.btnRecyclerActivity?.setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
        }
    }
}