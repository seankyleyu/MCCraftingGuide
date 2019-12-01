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

        tab_layout.getTabAt(0)?.setIcon(R.drawable.i3)
        tab_layout.getTabAt(1)?.setIcon(R.drawable.i26)
        tab_layout.getTabAt(2)?.setIcon(R.drawable.i46)
        tab_layout.getTabAt(3)?.setIcon(R.drawable.i59)
        tab_layout.getTabAt(4)?.setIcon(R.drawable.i72)

    }

}
