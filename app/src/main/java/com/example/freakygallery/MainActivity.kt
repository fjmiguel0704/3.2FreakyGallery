package com.example.freakygallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.freakygallery.databinding.ImagenesBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private val listaImagenes = ArrayList<Imagenes>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val imagenes = ImagenesBinding.inflate(layoutInflater)
        setContentView(imagenes.root)

        for (cont in 1..30){
            val urlFoto = "https://loremflickr.com/150/150?lock=$cont"
            listaImagenes.add(Imagenes(urlFoto))
        }

        imagenes.vistaImagenes.adapter = ImagenesAdapter(listaImagenes, object : ImagenPulsada{
            override fun imagenPulsada(imagen: Imagenes) {
                val intent = Intent(this@MainActivity, ImagenGrande::class.java)
                intent.putExtra("url", imagen.url)
                startActivity(intent)
            }
        }
        )
    }
}