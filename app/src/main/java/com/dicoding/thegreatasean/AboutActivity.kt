package com.dicoding.thegreatasean

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class AboutActivity: AppCompatActivity(){

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_CITY = "extra_city"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_SCHOOL = "extra_school"
    }

    //test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val tvNameReceived: TextView = findViewById(R.id.tv_name_received)
        val tvEmailReceived: TextView = findViewById(R.id.tv_email_received)
        val tvCityReceived: TextView = findViewById(R.id.tv_city_received)
        val tvPhoneNumberReceived: TextView = findViewById(R.id.tv_phone_number_received)
        val tvSchoolReceived: TextView = findViewById(R.id.tv_school_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val city = intent.getStringExtra(EXTRA_CITY)
        val phoneNumber = intent.getStringExtra(EXTRA_PHONE)
        val school = intent.getStringExtra(EXTRA_SCHOOL)

        val textName = "$name"
        tvNameReceived.text = textName

        val textEmail = "$email"
        tvEmailReceived.text = textEmail

        val textCity = "$city"
        tvCityReceived.text = textCity

        val textPhoneNumber = "$phoneNumber"
        tvPhoneNumberReceived.text = textPhoneNumber

        val textSchool = "$school"
        tvSchoolReceived.text = textSchool

        aboutToolbar()
    }

    private fun aboutToolbar() {
        val aboutToolbar: Toolbar = findViewById(R.id.about_toolbar)
        setSupportActionBar(aboutToolbar)

        aboutToolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        aboutToolbar.setNavigationOnClickListener {
            val intentBack = Intent(this@AboutActivity, MainActivity::class.java)
            startActivity(intentBack)
        }
    }
}

