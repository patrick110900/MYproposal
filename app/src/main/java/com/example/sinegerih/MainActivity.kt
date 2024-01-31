package com.example.sinegerih

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.sinegerih.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.Home_buttom -> replaceFragment(HomeFragment())
                R.id.chart_buttom -> replaceFragment(ChartFragment())
                R.id.map_buttom -> replaceFragment(MapFragment())
                R.id.person_buttom -> replaceFragment(AccountFragment())
                R.id.add_buttom -> replaceFragment(addFragment())
                else -> {
                    // Handle any other cases here
                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}
