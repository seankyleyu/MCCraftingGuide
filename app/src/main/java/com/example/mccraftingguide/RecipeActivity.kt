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

        var item_recipe : Array<String>? = intent.getStringArrayExtra("ITEM_RECIPE")
        var item_type : Int = intent.getIntExtra("ITEM_TYPE", -1)
        var item_icon: Int = resources.getIdentifier(
            intent.getStringExtra("ITEM_ICON"),
            "drawable",
            packageName)

        recipe_name.setText(intent.getStringExtra("ITEM_NAME"))
        recipe_icon.setImageResource(item_icon)

        if(item_type == 1){
            if(item_recipe?.get(0) != null) {
                recipe1.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(0),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe1.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(1) != null) {
                recipe2.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(1),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe2.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(2) != null) {
                recipe3.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(2),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe3.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(3) != null) {
                recipe4.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(3),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe4.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(4) != null) {
                recipe5.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(4),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe5.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(5) != null) {
                recipe6.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(5),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe6.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(6) != null) {
                recipe7.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(6),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe7.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(7) != null) {
                recipe8.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(7),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe8.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }
            if(item_recipe?.get(8) != null) {
                recipe9.setImageResource(
                    resources.getIdentifier(
                        item_recipe?.get(8),
                        "drawable",
                        packageName
                    )
                )
            }else{
                recipe9.setImageResource(
                    resources.getIdentifier(
                        "air",
                        "drawable",
                        packageName
                    )
                )
            }

            smelt.visibility = View.GONE

        }else{

            recipe5.setImageResource(resources.getIdentifier(
                item_recipe?.get(0),
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

            this.finish()

        }

    }

}