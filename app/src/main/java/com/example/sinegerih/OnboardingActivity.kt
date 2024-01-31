package com.example.sinegerih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class OnboardingActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        val butonclick: Button = findViewById(R.id.btnon_start)
        butonclick.setOnClickListener(this)
    }

    override fun onClick(v: View?)  {
        when (v?.id){
            R.id.btnon_start ->{
                val intent = Intent(this@OnboardingActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }
}