package com.example.app22024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.Theme_App22024)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        layoutform()
        ventana4()
        ventanaRegister()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun ventanaRegister(){
        val btnRegister=findViewById<Button>(R.id.btnRegister)
        val btnLogin=findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener(){
            val irVentanaLogin=Intent(this, LoginActivity::class.java)
            startActivity(irVentanaLogin)
        }

        btnRegister.setOnClickListener(){
            val irVentanalogin=Intent(this, SignupActivity::class.java)
            startActivity(irVentanalogin)
        }
    }
    fun ventana4(){
        val btn_4=findViewById<Button>(R.id.btn4)
        btn_4.setOnClickListener(){
            val irVentana4=Intent(this, Ventana4::class.java)
            startActivity(irVentana4)
        }
    }
    fun layoutform(){
        val btn_gps= findViewById<Button>(R.id.btb_aceptar)
        val btn_gps2= findViewById<Button>(R.id.button2)
        val tv_nombre= findViewById<TextView>(R.id.txt_mnombre)
        btn_gps.setOnClickListener() {
            //val message = "Este es un mensaje"
            val message = "Nombre: ${tv_nombre.text}, Es estudiante"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()


        }
        btn_gps2.setOnClickListener(){
            val saltar=Intent(this, Vnetana3::class.java)
            startActivity(saltar)
        }
    }
}