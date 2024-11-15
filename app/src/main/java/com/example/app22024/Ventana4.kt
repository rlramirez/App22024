package com.example.app22024

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Ventana4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ventana4)
        procesar()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

    }
    fun procesar(){
        val btn_procesar= findViewById<Button>(R.id.btn_procesar)
        val edt_nombre= findViewById<TextView>(R.id.edtxt_nombre)
        val txtv_titulo= findViewById<TextView>(R.id.txv_titulo)

        btn_procesar.setOnClickListener(){
            val message = "Nombre: ${edt_nombre.text}, Es bienvenido"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            txtv_titulo.setText(message)
        }
    }
}