package com.example.mccraftingguide

import com.example.mccraftingguide.models.Item

class DataSource{

    companion object{

        fun createDataSet(): ArrayList<Item>{
            val list = ArrayList<Item>()

            //Base Items
            list.add(
                Item(
                    0,
                    "NULL",
                    0,
                    intArrayOf( 0,0,0,
                        0,0,0,
                        0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    1,
                    "Log",
                    1,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    2,
                    "Wooden Plank",
                    2,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1

                )
            )

            list.add(
                Item(
                    3,
                    "Cobblestone",
                    3,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    4,
                    "Leather",
                    4,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    5,
                    "Flint",
                    5,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    6,
                    "String",
                    6,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    7,
                    "SlimeBall",
                    7,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(8,
                    "Scute",
                    8,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    9,
                    "Stick",
                    9,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1

                )
            )

            list.add(
                Item(
                    10,
                    "Redstone",
                    10,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            list.add(
                Item(
                    11,
                    "Gold Ingot",
                    11,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2

                )
            )

            list.add(
                Item(
                    12,
                    "Iron Ingot",
                    12,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2

                )
            )

            list.add(
                Item(
                    13,
                    "Diamond",
                    13,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0

                )
            )

            return list
        }
    }
}


