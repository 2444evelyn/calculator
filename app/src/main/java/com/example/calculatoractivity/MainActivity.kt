package com.example.calculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumber: EditText
    lateinit var etNumber3: EditText
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnMultiply: Button
    lateinit var btnDivide:Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumber = findViewById(R.id.etNumber)
        etNumber3 = findViewById(R.id.etNumber3)
        btnAdd = findViewById(R.id.btnAdd)
        tvResult = findViewById(R.id.tvResult)
        btnSub = findViewById(R.id.btnSub)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnDivide = findViewById(R.id.btnDivide)

        btnAdd.setOnClickListener {
            var plus = etNumber.text.toString().toInt()
            var plus2 = etNumber3.text.toString().toInt()
            getResult(plus, plus2)

        }


        btnSub.setOnClickListener {
            var minus = etNumber.text.toString().toInt()
            var minus2 = etNumber3.text.toString().toInt()
            answer(minus, minus2)

        }
        btnMultiply.setOnClickListener {
            var multiply = etNumber.text.toString().toInt()
            var multiply2 = etNumber3.text.toString().toInt()
            result(multiply, multiply2)

        }
        btnDivide.setOnClickListener {
            var div = etNumber.text.toString().toInt()
            var div2 = etNumber3.text.toString().toInt()
            output(div, div2)

        }
    }


    fun getResult(plus: Int, plus2: Int) {
        var addition = plus
        var addition2 = plus2 + addition
        tvResult.text = addition2.toString()
    }

    fun answer(minus: Int, minus2: Int) {
        var remove = minus
        var remove2 =  remove-minus2
        tvResult.text = remove2.toString()


    }

    fun result(multiply: Int, multiply2: Int) {
        var times = multiply
        var times2 = multiply2 * times
        tvResult.text = times2.toString()


    }
    fun output(div: Int, div2: Int) {
        var division = div
        var div2 = div2 % division
        tvResult.text = div2.toString()

}}
