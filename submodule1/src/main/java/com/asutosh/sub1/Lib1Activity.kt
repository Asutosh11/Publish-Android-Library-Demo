package com.asutosh.sub1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Lib1Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_mod1)

        val intentToFireToDeliverResult = Intent(
            this,
            Class.forName("com.asutosh.sub2.Lib2Activity")
        )
        startActivity(intentToFireToDeliverResult)
    }
}