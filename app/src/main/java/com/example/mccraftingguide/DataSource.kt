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

            //Tools and Weapons
            list.add(
                Item(
                    14,
                    "Compass",
                    14,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    15,
                    "Clock",
                    15,
                    intArrayOf( 0,0,0,
                                    0,0,0,
                                    0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    16,
                    "Fishing Rod",
                    16,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    17,
                    "Flint and Steel",
                    17,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    18,
                    "Shears",
                    18,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    19,
                    "Lead",
                    19,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    20,
                    "Bucket",
                    20,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    21,
                    "Bowl",
                    21,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Pickaxes
            list.add(
                Item(
                    22,
                    "Wooden Pickaxe",
                    22,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    23,
                    "Stone Pickaxe",
                    23,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    24,
                    "Iron Pickaxe",
                    24,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    25,
                    "Golden Pickaxe",
                    25,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    26,
                    "Diamond Pickaxe",
                    26,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Axes
            list.add(
                Item(
                    27,
                    "Wooden Axe",
                    27,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    28,
                    "Stone Axe",
                    28,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    29,
                    "Iron Axe",
                    29,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    30,
                    "Golden Axe",
                    30,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    31,
                    "Diamond Axe",
                    31,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Shovels
            list.add(
                Item(
                    32,
                    "Wooden Shovel",
                    32,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    33,
                    "Stone Shovel",
                    33,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    34,
                    "Iron Shovel",
                    34,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    35,
                    "Golden Shovel",
                    35,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    36,
                    "Diamond Shovel",
                    36,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Hoes
            list.add(
                Item(
                    37,
                    "Wooden Hoe",
                    37,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    38,
                    "Stone Hoe",
                    38,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    39,
                    "Iron Hoe",
                    39,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    40,
                    "Golden Hoe",
                    40,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    41,
                    "Diamond Hoe",
                    41,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Swords
            list.add(
                Item(
                    42,
                    "Wooden Sword",
                    42,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    43,
                    "Stone Sword",
                    43,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    44,
                    "Iron Sword",
                    44,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    45,
                    "Golden Sword",
                    45,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    46,
                    "Diamond Sword",
                    46,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    47,
                    "Trident",
                    47,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    48,
                    "Bow",
                    48,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    49,
                    "Crossbow",
                    49,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    50,
                    "Arrow",
                    50,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    51,
                    "Shield",
                    51,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            //Armor
            ////Helmets
            list.add(
                Item(
                    52,
                    "Leather Cap",
                    52,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    53,
                    "Iron Helmet",
                    53,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    54,
                    "Golden Helmet",
                    54,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    55,
                    "Diamond Helmet",
                    55,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Chestplate
            list.add(
                Item(
                    56,
                    "Leather Tunic",
                    56,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    57,
                    "Iron Chestplate",
                    57,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    58,
                    "Golden Chestplate",
                    58,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    59,
                    "Diamond Chestplate",
                    59,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Leggings
            list.add(
                Item(
                    60,
                    "Leather Pants",
                    60,
                    intArrayOf( 0,0,0,
                                    0,0,0,
                                    0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    61,
                    "Iron Leggings",
                    61,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    62,
                    "Golden Leggings",
                    62,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    63,
                    "Diamond Leggings",
                    63,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            ////Boots
            list.add(
                Item(
                    64,
                    "Leather Boots",
                    64,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    65,
                    "Iron Boots",
                    65,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    66,
                    "Golden Boots",
                    66,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    67,
                    "Diamond Boots",
                    67,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            //Food
            list.add(
                Item(
                    68,
                    "Wheat",
                    68,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    69,
                    "Egg",
                    69,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    70,
                    "Sugarcane",
                    70,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    71,
                    "Bucket of Milk",
                    71,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    72,
                    "Apple",
                    72,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    73,
                    "Carrot",
                    73,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    74,
                    "Potato",
                    74,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    75,
                    "Beetroot",
                    75,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    76,
                    "Pumpkin",
                    76,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    77,
                    "Red Mushroom",
                    77,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    78,
                    "Brown Mushroom",
                    78,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    79,
                    "Flower",
                    79,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    80,
                    "Chorus Fruit",
                    80,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    81,
                    "Raw Beef",
                    81,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    82,
                    "Raw Porkchop",
                    82,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    83,
                    "Raw Mutton",
                    83,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    84,
                    "Raw Chicken",
                    84,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    85,
                    "Raw Rabbit",
                    85,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    86,
                    "Raw Cod",
                    86,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    87,
                    "Raw Salmon",
                    87,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    88,
                    "Kelp",
                    88,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    89,
                    "Cocoa Beans",
                    89,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    90,
                    "Bread",
                    90,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    91,
                    "Cake",
                    91,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    92,
                    "Cookie",
                    92,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    93,
                    "Golden Apple",
                    93,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    94,
                    "Baked Potato",
                    94,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    95,
                    "Pumpkin Pie",
                    95,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    96,
                    "Mushroom Stew",
                    96,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    97,
                    "Rabbit Stew",
                    97,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    98,
                    "Sugar",
                    98,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    99,
                    "Beetroot Soup",
                    99,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    100,
                    "Suspicious Stew",
                    100,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    1
                )
            )

            list.add(
                Item(
                    101,
                    "Popped Chorus Fruit",
                    101,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    102,
                    "Steak",
                    102,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    103,
                    "Cooked Porkchop",
                    103,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    104,
                    "Cooked Mutton",
                    104,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    105,
                    "Cooked Chicken",
                    105,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    106,
                    "Cooked Rabbit",
                    106,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    107,
                    "Cooked Cod",
                    107,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    108,
                    "Cooked Salmon",
                    108,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    109,
                    "Cooked Rabbit",
                    109,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    110,
                    "Dried Kelp",
                    110,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    2
                )
            )

            list.add(
                Item(
                    111,
                    "Sweet Berry",
                    111,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    112,
                    "Poisonous Potato",
                    112,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    113,
                    "Melon Slice",
                    113,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    114,
                    "Rotten Flesh",
                    114,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    115,
                    "Tropical Fish",
                    115,
                    intArrayOf( 0,0,0,
                                0,0,0,
                                0,0,0),
                    0
                )
            )

            list.add(
                Item(
                    116,
                    "Pufferfish",
                    116,
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


