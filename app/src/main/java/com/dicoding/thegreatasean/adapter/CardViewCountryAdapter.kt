package com.dicoding.thegreatasean.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dicoding.thegreatasean.R
import com.dicoding.thegreatasean.model.Country

class CardViewCountryAdapter(private val listCountry: ArrayList<Country>): RecyclerView.Adapter<CardViewCountryAdapter.CardViewViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback (onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    class CardViewViewHolder (itemView: View): RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        val imgFlag: ImageView = itemView.findViewById(R.id.img_item_flag)
        val imgView: ImageView = itemView.findViewById(R.id.img_item_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_country, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val country = listCountry[position]

        Glide.with(holder.itemView.context)
                .load(country.flag)
                .into(holder.imgFlag)

        Glide.with(holder.itemView.context)
            .load(country.view)
            .into(holder.imgView)


        holder.tvName.text = country.name
        holder.tvDetail.text = country.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listCountry[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listCountry.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Country)
    }
}