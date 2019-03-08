package com.laicar.andfn_131_dots_indicator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPage = findViewById<ViewPager>(R.id.photo_viewpager)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)


        viewPage.adapter=PhotoAdapter(this)
        tabLayout.setupWithViewPager(viewPage,true)


    }
}
