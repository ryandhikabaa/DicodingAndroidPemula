package com.ryandhikaba.dicodingandroidpemula.Submission.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ryandhikaba.dicodingandroidpemula.R
import com.ryandhikaba.dicodingandroidpemula.Submission.model.ServiceModel

class ServiceAdapter (private val listService: ArrayList<ServiceModel>) : RecyclerView.Adapter<ServiceAdapter.ListViewHolder>()  {

    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_service, parent, false)
        return ListViewHolder(view)
    }

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvImage: ImageView = itemView.findViewById(R.id.tvImage)
        val tvServiceName: TextView = itemView.findViewById(R.id.tvServiceName)
        val tvServiceDesc: TextView = itemView.findViewById(R.id.tvServiceDesc)
        val tvServicePrice: TextView = itemView.findViewById(R.id.tvServicePrice)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: ServiceModel)
    }

    override fun getItemCount(): Int = listService.size



    override fun onBindViewHolder(holder: ServiceAdapter.ListViewHolder, position: Int) {
        val (name, description, price, duration, benefits, photo) = listService[position]
        Glide.with(holder.itemView.context)
            .load(photo) // URL Gambar
            .into(holder.tvImage) // imageView mana yang akan diterapkan
        holder.tvServiceName.text = name
        holder.tvServiceDesc.text = description
        holder.tvServicePrice.text = price
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listService[holder.adapterPosition]) }

    }
}