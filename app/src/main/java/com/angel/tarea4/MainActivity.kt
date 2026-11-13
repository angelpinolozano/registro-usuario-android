package com.angel.tarea4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var cbJava: CheckBox
    private lateinit var cbKotlin: CheckBox
    private lateinit var rgTurno: RadioGroup
    private lateinit var btnEnviar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initComponents()
        setupListeners()
    }

    private fun initComponents() {
        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        cbJava = findViewById(R.id.cbJava)
        cbKotlin = findViewById(R.id.cbKotlin)
        rgTurno = findViewById(R.id.rgTurno)
        btnEnviar = findViewById(R.id.btnEnviar)
    }

    private fun setupListeners() {
        btnEnviar.setOnClickListener {
            val nombre = etNombre.text.toString().trim()
            val edad = etEdad.text.toString().trim()

            if (nombre.isEmpty() || edad.isEmpty()) {
                Toast.makeText(this, "Debes rellenar el nombre y la edad", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val cursos = mutableListOf<String>()
            if (cbJava.isChecked) cursos.add("Java")
            if (cbKotlin.isChecked) cursos.add("Kotlin")
            val cursosTexto = if (cursos.isEmpty()) "Ninguno" else cursos.joinToString(", ")

            val turno = if (rgTurno.checkedRadioButtonId == R.id.rbManana) "Mañana" else "Tarde"

            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("nombre", nombre)
            intent.putExtra("edad", edad)
            intent.putExtra("cursos", cursosTexto)
            intent.putExtra("turno", turno)
            startActivity(intent)
        }
    }
}