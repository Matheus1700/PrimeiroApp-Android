package com.teste.monetario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var mainButton: Button
    lateinit var editText: EditText
    lateinit var conteudo: String
    lateinit var textView: TextView

    // logica basica de inicialização do app
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButton = findViewById(R.id.button)
        editText = findViewById(R.id.input_text_name)
        textView = findViewById(R.id.text_title)

        mainButton.setOnClickListener {
            conteudo = editText.text.toString()
            textView.text = "Boa noite " + conteudo
        }

    }
}