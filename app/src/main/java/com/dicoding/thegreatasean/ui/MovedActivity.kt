package com.dicoding.thegreatasean.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dicoding.thegreatasean.R

class MovedActivity : AppCompatActivity() {

    private lateinit var movedToolbar: Toolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_moved)

        val countryName: TextView = findViewById(R.id.countryName_data_received)
        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val flagDataReceived: ImageView = findViewById(R.id.countryFlag_data_received)
        val countryViewDataReceived: ImageView = findViewById(R.id.countryView_data_received)
        val headOfStatePhoto: ImageView = findViewById(R.id.iv_head_of_state)
        val headOfStateName: TextView = findViewById(R.id.tv_head_of_state)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val flag = intent.getIntExtra(EXTRA_FLAG, 0)
        val countryView = intent.getIntExtra(EXTRA_COUNTRYVIEW, 0)
        val headPhoto = intent.getIntExtra(EXTRA_HEADOFSTATEPHOTO, 0)
        val headName = intent.getStringExtra(EXTRA_HEADOFSTATENAME)

        countryViewDataReceived.setImageResource(countryView)
        flagDataReceived.setImageResource(flag)

        val textCountryName = "$name"
        countryName.text = textCountryName

        val textDetail = "$detail"
        tvDataReceived.text = textDetail

        headOfStatePhoto.setImageResource(headPhoto)
        val textHeadName = "$headName"
        headOfStateName.text = textHeadName

        movedToolbar = findViewById(R.id.moved_toolbar)
        movedToolbar.title = "$name"
        setupActionBar()
    }

    fun setupActionBar() {

        setSupportActionBar(movedToolbar)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_24)
        }

        movedToolbar.setNavigationOnClickListener { onBackPressed() }
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_FLAG = "extra_flag"
        const val EXTRA_COUNTRYVIEW = "extra_country_view"
        const val EXTRA_HEADOFSTATEPHOTO = "extra_head_of_state_photo"
        const val EXTRA_HEADOFSTATENAME = "extra_head_of_state_name"
    }
}