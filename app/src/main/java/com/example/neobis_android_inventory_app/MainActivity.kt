package com.example.neobis_android_inventory_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neobis_android_inventory_app.databinding.ActivityMainBinding
import com.example.neobis_android_inventory_app.view.MenuFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            val menuFragment = MenuFragment()
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, menuFragment)
                .commit()
        }
    }
}