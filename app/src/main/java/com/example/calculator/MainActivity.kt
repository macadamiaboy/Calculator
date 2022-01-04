package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.calculator.model.Model

class MainActivity : AppCompatActivity() {
    val model: Model = Model()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOne = findViewById<Button>(R.id.btn_one)
        val btnTwo = findViewById<Button>(R.id.btn_two)
        val btnThree = findViewById<Button>(R.id.btn_three)
        val btnFour = findViewById<Button>(R.id.btn_four)
        val btnFive = findViewById<Button>(R.id.btn_five)
        val btnSix = findViewById<Button>(R.id.btn_six)
        val btnSeven = findViewById<Button>(R.id.btn_seven)
        val btnEight = findViewById<Button>(R.id.btn_eight)
        val btnNine = findViewById<Button>(R.id.btn_nine)
        val btnZero = findViewById<Button>(R.id.btn_zero)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val btnResult = findViewById<Button>(R.id.btn_result)
        val btnPlus = findViewById<Button>(R.id.btn_plus)
        val btnMinus = findViewById<Button>(R.id.btn_minus)
        val btnMultiplication = findViewById<Button>(R.id.btn_multiply)
        val btnDivision = findViewById<Button>(R.id.btn_divide)
        val tv = findViewById<TextView>(R.id.tv)
        btnOne.setOnClickListener {
            model.recording(1)
            tv.text = model.number.toString()
        }
        btnTwo.setOnClickListener {
            model.recording(2)
            tv.text = model.number.toString()
        }
        btnThree.setOnClickListener {
            model.recording(3)
            tv.text = model.number.toString()
        }
        btnFour.setOnClickListener {
            model.recording(4)
            tv.text = model.number.toString()
        }
        btnFive.setOnClickListener {
            model.recording(5)
            tv.text = model.number.toString()
        }
        btnSix.setOnClickListener {
            model.recording(6)
            tv.text = model.number.toString()
        }
        btnSeven.setOnClickListener {
            model.recording(7)
            tv.text = model.number.toString()
        }
        btnEight.setOnClickListener {
            model.recording(8)
            tv.text = model.number.toString()
        }
        btnNine.setOnClickListener {
            model.recording(9)
            tv.text = model.number.toString()
        }
        btnZero.setOnClickListener {
            model.recording(0)
            tv.text = model.number.toString()
        }
        btnReset.setOnClickListener {
            model.resetOther()
            model.resetNumber()
            tv.text = model.number.toString()
        }
        btnResult.setOnClickListener {
            model.result()
            if (model.action != "") {
                tv.text = model.result.toString()
                model.resetOther()
            }
        }
        btnPlus.setOnClickListener {
            model.action()
            model.action = Model.Actions.ADDITION.name
        }
        btnMinus.setOnClickListener {
            model.action()
            model.action = Model.Actions.SUBTRACTION.name
        }
        btnMultiplication.setOnClickListener {
            model.action()
            model.action = Model.Actions.MULTIPLICATION.name
        }
        btnDivision.setOnClickListener {
            model.action()
            model.action = Model.Actions.DIVISION.name
        }
    }
}