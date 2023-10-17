package com.example.freakygallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.freakygallery.databinding.ItemImagesBinding

class ImagenesAdapter (private val imagenes: List<Imagenes>, private val imagenPulsada: ImagenPulsada): RecyclerView.Adapter<ImagenesAdapter.ViewHolder>() {

    class ViewHolder(private val bindingItemImages: ItemImagesBinding):RecyclerView.ViewHolder(bindingItemImages.root){
        fun bind (imagenes: Imagenes){
            Glide.with(bindingItemImages.imageView2.context).load(imagenes.url).into(bindingItemImages.imageView2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bindingItemImages = ItemImagesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(bindingItemImages)
    }

    override fun getItemCount(): Int {
        return imagenes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind((imagenes[position]))
        holder.itemView.setOnClickListener{
            imagenPulsada.imagenPulsada(imagenes[position])
        }
    }
}