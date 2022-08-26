package com.example.lab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        val myTxtNombre = findViewById<TextView>(R.id.textView3)
        val myNumEdad = findViewById<TextView>(R.id.textView4)
        val botonregresar = findViewById<Button>(R.id.button2)

        var myExtras: Bundle? = intent.extras

        botonregresar.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            startActivity(myIntent)
        }

        var nombreRecibido: String = myExtras?.getString("KeyName") ?: "Noname"
        var edadRecibida: Int = myExtras?.getInt("KeyEdad") ?: -1
        myTxtNombre.text = nombreRecibido
        myNumEdad.text = edadRecibida.toString()
        Log.d("E2", "fin de la ejecución de onCreate de MainActivity")

    }

}