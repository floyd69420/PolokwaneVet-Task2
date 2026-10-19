package com.example.polowanevet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAppointments = findViewById<Button>(R.id.btnAppointments)
        val btnSettings = findViewById<Button>(R.id.btnSettings)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Will navigate to Appointments screen later
        btnAppointments.setOnClickListener {
            Toast.makeText(this, "Opening Appointments...", Toast.LENGTH_SHORT).show()
        }

        // Will navigate to Settings screen later (Task 2 requirement)
        btnSettings.setOnClickListener {
            Toast.makeText(this, "Opening Settings...", Toast.LENGTH_SHORT).show()
        }

        // Logout returns user to Login Screen
        btnLogout.setOnClickListener {
            Toast.makeText(this, "Logged out successfully", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish() // Destroys the dashboard so user can't press 'back' to get in
        }
    }
}