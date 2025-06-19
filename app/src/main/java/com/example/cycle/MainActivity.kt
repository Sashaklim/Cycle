package com.example.cycle

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var inputX: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        class MainActivity : AppCompatActivity() {
            private lateinit var inputX: EditText
            private lateinit var calculateButton: Button
            private lateinit var resultText: TextView

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                inputX = findViewById(R.id.inputX)
                calculateButton = findViewById(R.id.calculateButton)
                resultText = findViewById(R.id.resultText)

                calculateButton.setOnClickListener {
                    val x = inputX.text.toString().toDoubleOrNull()
                    if (x == null) {
                        resultText.text = "Введите корректное число!"
                        return@setOnClickListener
                    }

                    val numeratorFactors = listOf(2, 4, 8, 16, 32, 64, 128)
                    val denominatorFactors = listOf(1, 3, 7, 15, 31, 63, 127)

                    var numerator = 1.0
                    for (n in numeratorFactors) {
                        numerator *= (x - n)
                    }

                    var denominator = 1.0
                    for (d in denominatorFactors) {
                        denominator *= (x - d)
                    }

                    val result = numerator / denominator
                    resultText.text = "Результат: $result"
                }
            }
        }
    }
}