package com.example.gittestingproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Second Commit")
        println("Third Commit")

        println("my own commit 1")
        println("my own commit 2")
    }
}