package com.example.recyclerview

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class CountryAdapter(private val countryList: List<Country>) :
    RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val countryName: TextView = itemView.findViewById(R.id.countryName)
        val countryImage: ImageView = itemView.findViewById(R.id.countryImage)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val currentItem = countryList[position]
        Log.i("Country", "Name: ${currentItem.name}, PNG: ${currentItem.flags.png}")
        holder.countryName.text = currentItem.name
        Picasso.get()
            .load(currentItem.flags.png)
            .fit() // Ajoutez cette ligne pour redimensionner l'image
            .into(holder.countryImage)
    }

    override fun getItemCount() = countryList.size
}
