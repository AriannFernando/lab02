package com.example.lab02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myTxtNombre = findViewById<EditText>(R.id.txtnombre)
        val myNumEdad = findViewById<EditText>(R.id.txtedad)
        val myButtonSubmit =findViewById<Button>(R.id.button)

        myButtonSubmit.setOnClickListener{
            var elNombre : String = myTxtNombre.text.toString()
            var edad : Int = parseInt(myNumEdad.text.toString())

            val myIntent : Intent = Intent(this, TargetActivity::class.java)
            with(myIntent){
                putExtra("KeyName", elNombre)
                putExtra("KeyEdad", edad)
            }
            //myIntent.putExtra("KeyName", elNombre)
            //myIntent.putExtra("KeyEdad", edad)
            startActivity(myIntent)
        }
        Log.d("E2","fin de la ejecución de onCreate de MainActivity")
    }
}