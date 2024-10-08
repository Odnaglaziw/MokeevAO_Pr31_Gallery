package com.amok.gallery

import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PhotoAdapter(private val galleryItems: List<GalleryItem>)
    : RecyclerView.Adapter<PhotoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoHolder {
        val imageView = ImageView(parent.context)
        imageView.layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        imageView.scaleType = ImageView.ScaleType.CENTER_CROP
        return PhotoHolder(imageView)
    }


    override fun getItemCount(): Int = galleryItems.size

    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val galleryItem = galleryItems[position]
        holder.bindImage(galleryItem.url)
    }
}