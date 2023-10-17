package com.example.freakygallery

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.freakygallery.databinding.ItemImagesBinding

class ImagenesAdapter (private val imagenes: List<Imagenes>, private val contactoPulsadoListener: ImagenPulsada): RecyclerView.Adapter<ImagenesAdapter.ViewHolder>() {

    class ViewHolder(private val bindingItemImages: ItemImagesBinding):RecyclerView.ViewHolder(bindingItemImages.root){
        fun bind (imagenes: Imagenes){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}