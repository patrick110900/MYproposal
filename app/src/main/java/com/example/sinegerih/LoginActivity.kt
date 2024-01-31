package com.example.sinegerih

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnMasuk: Button = findViewById(R.id.masuk)
        btnMasuk.setOnClickListener(this)

        val btnDaftar: TextView = findViewById(R.id.daftar)
        btnDaftar.setOnClickListener(this)

        val btnLupas: TextView = findViewById(R.id.lupass)
        btnLupas.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.daftar -> {
                val intent = Intent (this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
            R.id.masuk -> {
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.lupass -> {
                val intent = Intent(this@LoginActivity, LupaSandi::class.java)
                startActivity(intent)
            }
        }
    }
}
