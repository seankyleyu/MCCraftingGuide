package com.example.mccraftingguide.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mccraftingguide.GuideRecyclerAdapter
import com.example.mccraftingguide.R
import com.example.mccraftingguide.TopSpacingItemDecoration
import com.example.mccraftingguide.models.Item

class ToolFragment(private val data: ArrayList<Item>) : Fragment(){

    private lateinit var guideAdapter: GuideRecyclerAdapter
    private lateinit var recyclerView: RecyclerView
    private val categoryType: String = "Tool"
    private var sortedList: ArrayList<Item> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        for(item in data){
            if(item.category.name == categoryType){
                sortedList.add(item)
            }
        }

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_tool,container,false)

        recyclerView = rootView.findViewById(R.id.tool_recycler_view) as RecyclerView

        recyclerView.apply {
            layoutManager = LinearLayoutManager(activity?.applicationContext)
            val topSpacingDecorator = TopSpacingItemDecoration(10)
            addItemDecoration(topSpacingDecorator)
            guideAdapter = GuideRecyclerAdapter()
            adapter = guideAdapter

            guideAdapter.submitList(sortedList)
        }

        return rootView
    }
}