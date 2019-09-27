package com.example.mccraftingguide

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recipe.*

class RecipeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe)

        var item_recipe : IntArray = intent.getIntArrayExtra("ITEM_RECIPE")
        var item_type : Int = intent.getIntExtra("ITEM_TYPE", -1)
        var item_id: Int = resources.getIdentifier(
            "i" + intent.getIntExtra("ITEM_ICON", -1),
            "drawable",
            packageName
        )

        recipe_name.setText(intent.getStringExtra("ITEM_NAME"))
        recipe_icon.setImageResource(item_id)

        if(item_type == 1){

            recipe1.setImageResource(resources.getIdentifier(
                "i" + item_recipe[0],
                "drawable",
                packageName
            ))
            recipe2.setImageResource(resources.getIdentifier(
                "i" + item_recipe[1],
                "drawable",
                packageName
            ))
            recipe3.setImageResource(resources.getIdentifier(
                "i" + item_recipe[2],
                "drawable",
                packageName
            ))
            recipe4.setImageResource(resources.getIdentifier(
                "i" + item_recipe[3],
                "drawable",
                packageName
            ))
            recipe5.setImageResource(resources.getIdentifier(
                "i" + item_recipe[4],
                "drawable",
                packageName
            ))
            recipe6.setImageResource(resources.getIdentifier(
                "i" + item_recipe[5],
                "drawable",
                packageName
            ))
            recipe7.setImageResource(resources.getIdentifier(
                "i" + item_recipe[6],
                "drawable",
                packageName
            ))
            recipe8.setImageResource(resources.getIdentifier(
                "i" + item_recipe[7],
                "drawable",
                packageName
            ))
            recipe9.setImageResource(resources.getIdentifier(
                "i" + item_recipe[8],
                "drawable",
                packageName
            ))

            smelt.visibility = View.GONE

        }else{

            recipe5.setImageResource(resources.getIdentifier(
                "i" + item_recipe[0],
                "drawable",
                packageName
            ))

            recipe1.visibility = View.GONE
            recipe2.visibility = View.GONE
            recipe3.visibility = View.GONE
            recipe4.visibility = View.GONE
            recipe6.visibility = View.GONE
            recipe7.visibility = View.GONE
            recipe8.visibility = View.GONE
            recipe9.visibility = View.GONE


        }

        backBtn.setOnClickListener{

            val intent = Intent(applicationContext, MainActivity::class.java)

            startActivity(intent)

        }

    }

}