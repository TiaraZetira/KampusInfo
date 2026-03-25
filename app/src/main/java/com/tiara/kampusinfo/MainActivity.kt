package com.tiara.kampusinfo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Cari Bottom Navigation View
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        // Cara paling aman mencari NavController untuk menghindari Crash/Not Responding
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        // Hubungkan Bottom Navigation dengan Navigation Graph
        navView.setupWithNavController(navController)
    }
}