package com.nsv.newstoroapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nsv.newstoroapp.R

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val splashDuration = 3000L // 3 seconds
        Thread {
            Thread.sleep(splashDuration)
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }.start()
    }



}