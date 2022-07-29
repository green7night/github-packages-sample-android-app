package com.green7night.github.packages.sample.app

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.green7night.github.packages.sample.library.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val testString = Utils.getTestString()
        Log.d("TEST", "test string from github package library : $testString")
    }
}