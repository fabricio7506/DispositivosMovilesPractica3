package com.example.seagradece

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class ImageActivity : Activity() {
    private lateinit var imageView: ImageView
    private lateinit var backButton: Button
    private lateinit var imageNameText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        imageView = findViewById(R.id.selectedImageView)
        backButton = findViewById(R.id.backButton)
        imageNameText = findViewById(R.id.imageNameText)

        val selectedImage = intent.getStringExtra("selectedImage")
        imageNameText.text = selectedImage

        val imageResource = when(selectedImage) {
            "Montaña" -> R.drawable.mountain
            "Playa" -> R.drawable.beach
            "Bosque" -> R.drawable.forest
            "Ciudad" -> R.drawable.city
            "Desierto" -> R.drawable.desert
            else -> R.drawable.default_image
        }
        imageView.setImageResource(imageResource)

        backButton.setOnClickListener {
            finish()
        }
    }
}