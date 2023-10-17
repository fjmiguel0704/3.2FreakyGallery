package com.example.freakygallery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.freakygallery.databinding.ImagenesBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val imagenes = ImagenesBinding.inflate(layoutInflater)
        setContentView(imagenes.root)

        imagenes.vistaImagenes.adapter = ImagenesAdapter(
            listOf(
                Imagenes("https://loremflickr.com/320/240"),
                Imagenes("https://loremflickr.com/320/240/dog"),
                Imagenes("https://loremflickr.com/g/320/240/paris"),
                Imagenes("https://loremflickr.com/320/240/brazil,rio"),
                Imagenes("https://loremflickr.com/320/240/paris,girl/all"),
                Imagenes("https://loremflickr.com/g/320/240/paris,girl/all")
            ), object : ImagenPulsada{

            }
        )
    }
}