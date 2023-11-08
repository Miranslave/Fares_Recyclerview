package com.example.recyclerviewexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample.R
import com.example.recyclerviewexample.model.Affirmation

class Itemadapter(private val context: Context, private val dataset: List<Affirmation>) : RecyclerView.Adapter<Itemadapter.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)

    }

    override fun getItemCount(): Int {

        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringressourceId)

    }
}
