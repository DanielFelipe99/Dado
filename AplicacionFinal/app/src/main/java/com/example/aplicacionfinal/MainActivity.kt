package com.example.aplicacionfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var mensaje: EditText
    lateinit var imagenes: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mensaje = findViewById(R.id.txtMensaje)
        imagenes = findViewById(R.id.imageView)


    }

    fun mostrarMensaje():String{

        val numero = (1..6).random()

        return when{
            numero==1 ->"¡Dia de suerte! :)"
            numero==2 ->"Cuidate de los demas"
            numero==3 ->"Compra la loteria"
            numero==4 ->"¡Ahorra dinero!"
            numero==5 ->"Pasa mas tiempo con tu familia"
            numero==6 ->"Invierte en tu felicidad"
            else -> ""
        }
    }

    fun jugar(view: View){
        var mensajeFinal = mostrarMensaje()
        mensaje.setText(mensajeFinal)

        if(mensajeFinal.equals(1)){
            imagenes.setImageResource(R.drawable.uno)
        }
        if(mensajeFinal.equals(2)){
            imagenes.setImageResource(R.drawable.dos)
        }
        if(mensajeFinal.equals(3)){
            imagenes.setImageResource(R.drawable.tres)
        }
        if(mensajeFinal.equals(4)){
            imagenes.setImageResource(R.drawable.cuatro)
        }
        if(mensajeFinal.equals(5)){
            imagenes.setImageResource(R.drawable.cinco)
        }
        if(mensajeFinal.equals(6)){
            imagenes.setImageResource(R.drawable.seis)
        }

    }
}