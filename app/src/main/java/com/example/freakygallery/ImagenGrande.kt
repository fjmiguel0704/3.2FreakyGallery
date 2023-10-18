package com.example.freakygallery

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.freakygallery.databinding.ImagenesBinding
import com.example.freakygallery.databinding.MostrarImagenBinding

class ImagenGrande : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bindingMostrarImagen = MostrarImagenBinding.inflate(layoutInflater)
        setContentView(bindingMostrarImagen.root)

        val extras = intent.extras

        if (extras != null) {
            Glide.with(bindingMostrarImagen.root.context)
                .load(extras.getString("url"))
                .into(bindingMostrarImagen.imagenGrande)
        }

        bindingMostrarImagen.imagenGrande.setOnClickListener {
            finish()
        }
    }

}
