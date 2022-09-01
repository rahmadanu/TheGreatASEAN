package com.dicoding.thegreatasean.ui

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.thegreatasean.R
import com.dicoding.thegreatasean.adapter.CardViewCountryAdapter
import com.dicoding.thegreatasean.model.Country
import com.dicoding.thegreatasean.model.CountryData
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton

class MainActivity : AppCompatActivity() {

    private lateinit var rvCountry: RecyclerView
    private var list: ArrayList<Country> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCountry = findViewById(R.id.rv_country)
        rvCountry.setHasFixedSize(true)

        list.addAll(CountryData.listData)

        showRecyclerCardView()

        val extendedFab: ExtendedFloatingActionButton = findViewById(R.id.extended_fab)
        extendedFab.setOnClickListener {
            val gmmIntentUri = Uri.parse("geo:2.2180, 115.6628?z=4")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")

            try {
                startActivity(mapIntent)
            } catch (e: ActivityNotFoundException) {
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.google.android.apps.maps")))
            }
        }
    }

    private fun showRecyclerCardView(){

        rvCountry.layoutManager = LinearLayoutManager(this)
        val cardViewCountryAdapter = CardViewCountryAdapter(list)
        rvCountry.adapter = cardViewCountryAdapter

        cardViewCountryAdapter.setOnItemClickCallback(object :
            CardViewCountryAdapter.OnItemClickCallback {
            override fun onItemClicked (data: Country){
                showSelectedCountry(data)
            }
        })
    }

    fun showSelectedCountry(country: Country){
        val dataIntent = Intent(this@MainActivity, MovedActivity::class.java)
        dataIntent.putExtra(MovedActivity.EXTRA_NAME, country.name)
        dataIntent.putExtra(MovedActivity.EXTRA_DETAIL, country.detail)
        dataIntent.putExtra(MovedActivity.EXTRA_FLAG, country.flag)
        dataIntent.putExtra(MovedActivity.EXTRA_COUNTRYVIEW, country.view)
        dataIntent.putExtra(MovedActivity.EXTRA_HEADOFSTATEPHOTO, country.headOfStatePhoto)
        dataIntent.putExtra(MovedActivity.EXTRA_HEADOFSTATENAME, country.headOfStateName)
        dataIntent.putExtra(MovedActivity.EXTRA_LINK, country.link)
        startActivity(dataIntent)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.top_app_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.about -> {
                val aboutIntent = Intent(this@MainActivity, AboutActivity::class.java)
                aboutIntent.putExtra(AboutActivity.EXTRA_NAME, "RAHMA DANU SADEWA")
                aboutIntent.putExtra(AboutActivity.EXTRA_EMAIL, "sadewarahmadanu@gmail.com")
                aboutIntent.putExtra(AboutActivity.EXTRA_CITY, "Kota Depok, Jawa Barat")
                aboutIntent.putExtra(AboutActivity.EXTRA_PHONE, "0895344743752")
                aboutIntent.putExtra(AboutActivity.EXTRA_SCHOOL, "UPN \"Veteran\" Jawa Timur")
                startActivity(aboutIntent)
            }
        }

        return super.onOptionsItemSelected(item)
    }

}
