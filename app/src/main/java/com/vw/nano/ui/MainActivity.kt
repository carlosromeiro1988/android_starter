package com.vw.nano.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.vw.nano.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * App Main Activity
 */
class MainActivity : AppCompatActivity() {

    /**
     * OnCreate
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }
}