package com.amok.gallery

import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PhotoHolder(itemImageView: ImageView) : RecyclerView.ViewHolder(itemImageView) {
    val bindImage: (String) -> Unit = { url ->
        Glide.with(itemView.context)
            .load(url)
            .placeholder(R.drawable.ic_launcher_background)
            .into(itemImageView as ImageView)
    }
}
