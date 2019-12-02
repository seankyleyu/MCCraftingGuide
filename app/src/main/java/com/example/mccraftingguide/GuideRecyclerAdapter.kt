package com.example.mccraftingguide

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mccraftingguide.models.Item
import kotlinx.android.synthetic.main.layout_guide_list_item.view.*

class GuideRecyclerAdapter : RecyclerView.Adapter<CustomViewHolder>(){

    private var items: List<Item> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        return CustomViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_guide_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        holder.bind(items.get(position))

        holder.ItemName = items.get(position).name
        holder.ItemIcon = items.get(position).namespaced_id
        holder.ItemType = items.get(position).crafting_station?.pk
        holder.ItemRecipe = items.get(position).recipe?.grid

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(guideList: List<Item>){
        items = guideList
    }

}

class CustomViewHolder(
    val view:View,
    var ItemName: String? = null,
    var ItemIcon: String? = null,
    var ItemType: Int? = null,
    var ItemRecipe: Array<String>? = null
) : RecyclerView.ViewHolder(view) {

    var ItemTypeSmartCast: Int? = null

    init{
        view.setOnClickListener{

            ItemTypeSmartCast = ItemType

            if(ItemTypeSmartCast != null) {

                val intent = Intent(view.context, RecipeActivity::class.java)

                intent.putExtra("ITEM_NAME", ItemName)
                intent.putExtra("ITEM_ICON", ItemIcon)
                intent.putExtra("ITEM_TYPE", ItemType)
                intent.putExtra("ITEM_RECIPE", ItemRecipe)

                view.context.startActivity(intent)

            }
        }
    }

    val item_icon = itemView.item_icon
    val item_name = itemView.item_name

    fun bind(item: Item){

        var drawableId: Int = itemView.context.resources.getIdentifier(
            item.namespaced_id,
            "drawable",
            itemView.context.packageName
        )
        item_icon.setImageResource(drawableId)
        item_name.setText(item.name)

        if(item.crafting_station != null){
            itemView.chevron_right.visibility = View.VISIBLE
        }

    }

}