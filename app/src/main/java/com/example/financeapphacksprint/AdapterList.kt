package com.example.financeapphacksprint

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterList(private val titles: List<String>): RecyclerView.Adapter<AdapterViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterViewHolder {
        val view: View = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.activity_main, parent, false)
        return AdapterViewHolder(view)
    }

    override fun getItemCount(): Int {
        return titles.size
    }

    override fun onBindViewHolder(holder: AdapterViewHolder, position: Int) {
        val item = titles[position]
        holder.bind(item)
    }

}

class AdapterViewHolder(view: View) : RecyclerView.ViewHolder(view){

    private val tvTitle: TextView = view.findViewById(R.id.tv_tittle)


    fun bind(title: String){
        tvTitle.text = title
    }
}