package com.angel.tarea4

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {

    private lateinit var tvNombre: TextView
    private lateinit var tvEdad: TextView
    private lateinit var tvCursos: TextView
    private lateinit var tvTurno: TextView
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        initComponents()
        mostrarDatos()
        setupListeners()
    }

    private fun initComponents() {
        tvNombre = findViewById(R.id.tvNombre)
        tvEdad = findViewById(R.id.tvEdad)
        tvCursos = findViewById(R.id.tvCursos)
        tvTurno = findViewById(R.id.tvTurno)
        btnVolver = findViewById(R.id.btnVolver)
    }

    private fun mostrarDatos() {
        tvNombre.text = "Nombre: " + intent.getStringExtra("nombre")
        tvEdad.text = "Edad: " + intent.getStringExtra("edad")
        tvCursos.text = "Cursos: " + intent.getStringExtra("cursos")
        tvTurno.text = "Turno: " + intent.getStringExtra("turno")
    }

    private fun setupListeners() {
        btnVolver.setOnClickListener {
            finish()
        }
    }
}