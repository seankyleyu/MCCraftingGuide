package com.example.mccraftingguide.models

class Item(

    var id: Int,
    var name: String,
    var icon: Int,
    var recipe: IntArray,
    var type: Int                       //0 - No Recipe , 1 - Craft , 2 - Smelt
){

}
