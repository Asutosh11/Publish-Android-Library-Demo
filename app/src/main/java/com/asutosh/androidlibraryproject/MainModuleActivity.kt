package com.asutosh.androidlibraryproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainModuleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.app_activity_main)

        val intentToFireToDeliverResult = Intent(
            this,
            Class.forName("com.asutosh.sub1.Lib1Activity")
        )
        startActivity(intentToFireToDeliverResult)
    }
}