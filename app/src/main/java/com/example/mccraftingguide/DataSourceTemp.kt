package com.example.mccraftingguide

import com.example.mccraftingguide.models.Category
import com.example.mccraftingguide.models.Item

class DataSourceTemp {

    companion object{

        fun createDataSet():ArrayList<Item>{

            val list = ArrayList<Item>()

            list.add(
                Item(
                    1,
                    "Log",
                    1,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0,
                    Category.Material
                )
            )

            list.add(
                Item(
                    2,
                    "Cobblestone",
                    3,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0,
                    Category.Material
                )
            )

            list.add(
                Item(
                    3,
                    "Stick",
                    9,
                    intArrayOf( 0,0,0,
                                0,1,0,
                                0,1,0),
                    1,
                    Category.Material
                )
            )

            list.add(
                Item(
                    4,
                    "Iron Ore",
                    116,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0,
                    Category.Material
                )
            )

            list.add(
                Item(
                    5,
                    "Iron Ingot",
                    12,
                    intArrayOf( 116,0,0,
                                0,0,0,
                                0,0,0),
                    2,
                    Category.Material
                )
            )

            list.add(
                Item(
                    6,
                    "Iron Pickaxe",
                    24,
                    intArrayOf( 12,12,12,
                                0,9,0,
                                0,9,0),
                    1,
                    Category.Tool
                )
            )

            list.add(
                Item(
                    7,
                    "Iron Shovel",
                    34,
                    intArrayOf( 0,12,0,
                                0,9,0,
                                0,9,0),
                    1,
                    Category.Tool
                )
            )

            list.add(
                Item(
                    8,
                    "Iron Sword",
                    44,
                    intArrayOf( 0,12,0,
                                0,12,0,
                                0,9,0),
                    1,
                    Category.Weapon
                )
            )

            list.add(
                Item(
                    9,
                    "Raw Beef",
                    81,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0,
                    Category.Food
                )
            )

            list.add(
                Item(
                    10,
                    "Cooked Steak",

                    102,
                    intArrayOf( 81,0,0,
                                0,0,0,
                                0,0,0),
                    2,
                    Category.Food
                )
            )

            list.add(
                Item(
                    11,
                    "Iron Chestplate",

                    57,
                    intArrayOf( 12,0,12,
                                12,12,12,
                                12,12,12),
                    1,
                    Category.Armor
                )
            )

            list.add(
                Item(
                    12,
                    "Iron Leggings",

                    61,
                    intArrayOf( 12,12,12,
                                12,0,12,
                                12,0,12),
                    1,
                    Category.Armor
                )
            )

            return list

        }
    }
}