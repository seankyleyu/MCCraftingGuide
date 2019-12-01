package com.example.mccraftingguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mccraftingguide.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter = ItemsPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(MaterialFragment(),"Materials")
        pagerAdapter.addFragment(ToolFragment(),"Tools")
        pagerAdapter.addFragment(WeaponFragment(),"Weapons")
        pagerAdapter.addFragment(ArmorFragment(),"Armor")
        pagerAdapter.addFragment(FoodFragment(),"Food")


        viewPager.adapter = pagerAdapter

        tab_layout.setupWithViewPager(viewPager)

    }

}
