package com.example.calcnotasfaltas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular_button = button
        val resultado = textView

//        Quando acionar o botão, faz...
        calcular_button.setOnClickListener {
//            Ler as os inputs, converter o texto para inteiro,
            val nota1 = Integer.parseInt(input_nota_1.text.toString())
            val nota2 = Integer.parseInt(input_nota_2.text.toString())
            val faltas = Integer.parseInt(input_faltas.text.toString())
            val media = (nota1 + nota2) / 2 .toDouble()

            if (media >=6 && faltas<=10){
                resultado.setText("Aluno aprovado!\n"+"Nota final: $media\n"+"Total de Faltas: $faltas")
                resultado.setTextColor(Color.GREEN)
            } else {
                resultado.setText("Aluno reprovado!\n"+"Nota final: $media\n"+"Total de Faltas: $faltas")
                resultado.setTextColor(Color.RED)
            }
        }
    }


}