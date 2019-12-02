package com.example.mccraftingguide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mccraftingguide.api.ApiService
import com.example.mccraftingguide.fragments.*
import com.example.mccraftingguide.models.Item
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var fragmentList: ArrayList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("https://hidden-journey-75463.herokuapp.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(ApiService::class.java)

        api.fetchAllItems().enqueue(object : Callback<ArrayList<Item>> {
            override fun onResponse(call: Call<ArrayList<Item>>, response: Response<ArrayList<Item>>) {

                fragmentList = response.body()!!

                createViewPager()

            }

            override fun onFailure(call: Call<ArrayList<Item>>, t: Throwable) {
                Toast.makeText(this@MainActivity, "Error", Toast.LENGTH_LONG).show()
            }

        })

    }

    private fun createViewPager(){

        val pagerAdapter = ItemsPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(BlockFragment(fragmentList),"Blocks")
        pagerAdapter.addFragment(MaterialFragment(fragmentList),"Materials")
        pagerAdapter.addFragment(ToolFragment(fragmentList),"Tools")
        pagerAdapter.addFragment(WeaponFragment(fragmentList),"Weapons")
        pagerAdapter.addFragment(ArmorFragment(fragmentList),"Armor")
        pagerAdapter.addFragment(FoodFragment(fragmentList),"Food")


        viewPager.adapter = pagerAdapter

        tab_layout.setupWithViewPager(viewPager)

        tab_layout.getTabAt(0)?.setIcon(R.drawable.oak_planks)
        tab_layout.getTabAt(1)?.setIcon(R.drawable.diamond)
        tab_layout.getTabAt(2)?.setIcon(R.drawable.diamond_pickaxe)
        tab_layout.getTabAt(3)?.setIcon(R.drawable.diamond_sword)
        tab_layout.getTabAt(4)?.setIcon(R.drawable.i59)
        tab_layout.getTabAt(5)?.setIcon(R.drawable.i72)

    }

}
