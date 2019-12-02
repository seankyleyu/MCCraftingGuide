package com.example.mccraftingguide.models

class Category(
    var pk: Int,
    var name: String
)

class CraftingStation(
    var pk: Int,
    var name: String
)

class Rarity(
    var pk: Int,
    var name: String
)

class Recipe(
    var pk: Int,
    var formless: Boolean,
    var grid: Array<String>?
)

class Item(

    var pk: Int,
    var category: Category,
    var crafting_station: CraftingStation?,
    var durability: Int?,
    var max_stack: Int,
    var name: String,
    var namespaced_id: String,
    var rarity: Rarity,
    var recipe: Recipe?,
    var stackable: Boolean

)
