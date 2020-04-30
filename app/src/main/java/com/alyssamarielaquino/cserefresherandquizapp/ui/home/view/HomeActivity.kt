package com.alyssamarielaquino.cserefresherandquizapp.ui.home.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alyssamarielaquino.cserefresherandquizapp.R
import com.alyssamarielaquino.cserefresherandquizapp.ui.home.adapter.HomeViewPagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val viewPagerAdapter =  HomeViewPagerAdapter(supportFragmentManager)
        homeViewPager.adapter = viewPagerAdapter
        homeTabLayout.setupWithViewPager(homeViewPager)

    }


}
