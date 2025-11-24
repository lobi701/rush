package com.lobi701.rush

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.clickButton)
        clickButton.setOnClickListener {
            Toast.makeText(this, "Hello from Rush App!", Toast.LENGTH_SHORT).show()
        }
    }
}