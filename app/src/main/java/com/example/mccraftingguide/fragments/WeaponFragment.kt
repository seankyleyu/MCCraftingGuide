package com.example.mccraftingguide.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mccraftingguide.DataSourceTemp
import com.example.mccraftingguide.GuideRecyclerAdapter
import com.example.mccraftingguide.R
import com.example.mccraftingguide.TopSpacingItemDecoration
import com.example.mccraftingguide.api.ApiService
import com.example.mccraftingguide.models.Category
import com.example.mccraftingguide.models.Item
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WeaponFragment  : Fragment(){

    private val data = DataSourceTemp.createDataSet()
    //private var data : ArrayList<Item> = ArrayList()

    private lateinit var guideAdapter: GuideRecyclerAdapter
    private lateinit var recyclerView: RecyclerView
    private var fragmentList: ArrayList<Item> = ArrayList()
    private var categoryType: Category = Category.Weapon


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val retrofit = Retrofit.Builder()
//            .baseUrl("")
//            .addConverterFactory(GsonConverterFactory.create())
//            .build()
//
//        val api = retrofit.create(ApiService::class.java)
//
//        api.fetchAllItems().enqueue(object : Callback<ArrayList<Item>>{
//            override fun onResponse(call: Call<ArrayList<Item>>, response: Response<ArrayList<Item>>) {
//               fragmentList = response.body()!!
//            }
//
//            override fun onFailure(call: Call<ArrayList<Item>>, t: Throwable) {
//
//            }
//
//        })

        for(item in data){
            if(item.category == categoryType){
                fragmentList?.add(item)
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_weapon,container,false)

        recyclerView = rootView.findViewById(R.id.weapon_recycler_view) as RecyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity?.applicationContext)
            val topSpacingDecorator = TopSpacingItemDecoration(10)
            addItemDecoration(topSpacingDecorator)
            guideAdapter = GuideRecyclerAdapter()
            adapter = guideAdapter
        }

        guideAdapter.submitList(fragmentList)

        return rootView
    }
}