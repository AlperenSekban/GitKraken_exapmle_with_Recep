package com.example.gitkraken_example_with_recep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gitkraken_example_with_recep.ui.splashScreen.SplashScreenFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goFragment(R.id.activity_mainActivity_frameLayout, SplashScreenFragment().getInstance(),this)

    }
}