package com.example.calculator.model

class Model {
    var number: Long = 0
    var action = ""
    private var first: Long = 0
    private var second: Long = 0
    var result: Long = 0

    fun recording (symbol: Int) {
        number = number * 10 + symbol
    }

    fun resetNumber() {
        number = 0
    }

    fun resetOther() {
        action = ""
        first = 0
        second = 0
        result = 0
    }

    fun action() {
        first = number
        resetNumber()
    }

    fun result() {
        if (action != "") {
            second = number
            when (action) {
                "addition" -> result = first + second
                "subtraction" -> result = first - second
                "multiplication" -> result = first * second
                "division" -> result = first / second
                //division problem of doubles
            }
            number = result
        }
    }
}