package com.example.smskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.smskotlin.databinding.ActivityMainBinding
import com.example.smskotlin.databinding.ActivitySmsScheduleBinding
//https://www.javatpoint.com/kotlin-android-sqlite-tutorial
class SmsScheduleActivity : AppCompatActivity() {

    private lateinit var bindingsms: ActivitySmsScheduleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingsms = ActivitySmsScheduleBinding.inflate(layoutInflater)
        setContentView(bindingsms.root)
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}