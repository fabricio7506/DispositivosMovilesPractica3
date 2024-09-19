// Descripción: Programa que interactua con imagenes.
// Autor: Fabricio Gabriel Carrazco Arana
// Fecha de creación: 15/09/2024
// Última modificación: 18/09/2024
package com.example.seagradece

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner

class MainActivity : Activity() {
    private lateinit var spinner: Spinner
    private lateinit var nextButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = findViewById(R.id.imageSpinner)
        nextButton = findViewById(R.id.nextButton)

        val images = arrayOf("Montaña", "Playa", "Bosque", "Ciudad", "Desierto")
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, images)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

        nextButton.setOnClickListener {
            val intent = Intent(this, ImageActivity::class.java)
            intent.putExtra("selectedImage", spinner.selectedItem.toString())
            startActivity(intent)
        }
    }
}