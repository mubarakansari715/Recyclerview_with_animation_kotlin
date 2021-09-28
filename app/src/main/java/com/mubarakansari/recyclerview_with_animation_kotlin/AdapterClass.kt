package com.mubarakansari.recyclerview_with_animation_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val itemslist: List<DataModel>) :
    RecyclerView.Adapter<AdapterClass.AdapterViewHolder>() {
    class AdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titles: TextView = itemView.findViewById(R.id.titles)
        val title_sub: TextView = itemView.findViewById(R.id.title_sub)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        return AdapterViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val model = itemslist[position]
        holder.titles.text = model.title
        holder.title_sub.text = model.sub_title
    }

    override fun getItemCount(): Int {
        return itemslist.size
    }


}