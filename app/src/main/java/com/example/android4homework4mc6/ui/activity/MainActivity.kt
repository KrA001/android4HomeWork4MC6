package com.example.android4homework4mc6.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android4homework4mc6.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}