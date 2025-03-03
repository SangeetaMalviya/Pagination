package com.example.myapplicationsang

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class CatImageAdapter(private val catImages: MutableList<CatImage>) :
    RecyclerView.Adapter<CatImageAdapter.CatImageViewHolder>() {

    class CatImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView) // Ensure ID matches XML
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatImageViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cat_image, parent, false)
        return CatImageViewHolder(view)
    }

    override fun onBindViewHolder(holder: CatImageViewHolder, position: Int) {
        val catImage = catImages[position]


        Glide.with(holder.itemView.context)
            .load(catImage.url)
            .into(holder.imageView) // Correct reference

    }

    override fun getItemCount(): Int = catImages.size

    fun addImages(newImages: List<CatImage>) {
        catImages.addAll(newImages)
        notifyDataSetChanged()
    }
}

