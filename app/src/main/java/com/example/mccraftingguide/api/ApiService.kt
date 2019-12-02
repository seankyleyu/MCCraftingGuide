package com.example.mccraftingguide.api

import com.example.mccraftingguide.models.Item
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("items")
    fun fetchAllItems(): Call<ArrayList<Item>>
}