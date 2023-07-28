package com.example.evauacion3.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.evauacion3.R
import com.example.evauacion3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var b: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        val fragmenView = supportFragmentManager.findFragmentById(R.id.fcv_nagation) as NavHostFragment
        val navController = fragmenView.navController
        b.bnvStore.setupWithNavController(navController)
    }
}