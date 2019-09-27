package com.example.mccraftingguide

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mccraftingguide.models.Item
import kotlinx.android.synthetic.main.layout_guide_list_item.view.*

class GuideRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items: List<Item> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_guide_list_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){

            is ItemViewHolder -> {
                holder.bind(items.get(position))
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(guideList: List<Item>){
        items = guideList
    }

    class ItemViewHolder constructor(
        itemView: View
    ): RecyclerView.ViewHolder(itemView){

        val item_icon = itemView.item_icon
        val item_name = itemView.item_name

        fun bind(item: Item){

                var drawableId: Int = itemView.context.resources.getIdentifier(
                    "i" + item.icon,
                    "drawable",
                    itemView.context.packageName
                )
                item_icon.setImageResource(drawableId)
                item_name.setText(item.name)

        }
    }
}