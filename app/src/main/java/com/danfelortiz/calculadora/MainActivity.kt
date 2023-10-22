package com.danfelortiz.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val n1 = findViewById<AppCompatButton>(R.id.n1)
        val n2 = findViewById<AppCompatButton>(R.id.n2)
        val n3 = findViewById<AppCompatButton>(R.id.n3)
        val n4 = findViewById<AppCompatButton>(R.id.n4)
        val n5 = findViewById<AppCompatButton>(R.id.n5)
        val n6 = findViewById<AppCompatButton>(R.id.n6)
        val n7 = findViewById<AppCompatButton>(R.id.n7)
        val n8 = findViewById<AppCompatButton>(R.id.n8)
        val n9 = findViewById<AppCompatButton>(R.id.n9)
        val n0 = findViewById<AppCompatButton>(R.id.n0)
        val bSum = findViewById<AppCompatButton>(R.id.bSum)
        val bSus = findViewById<AppCompatButton>(R.id.bSus)
        val bTimes = findViewById<AppCompatButton>(R.id.bTimes)
        val bDiv = findViewById<AppCompatButton>(R.id.bDiv)
        val bEq = findViewById<AppCompatButton>(R.id.bEq)
        val teito = findViewById<TextView>(R.id.teito)
        var entrada:String = ""
        var first:String = ""
        var num1: Int = 0
        var op: Char = '0'
        n1.setOnClickListener {
            entrada += "1"
            teito.text = entrada

        }
        n2.setOnClickListener {
            entrada += "2"
            teito.text = entrada

        }
        n3.setOnClickListener {
            entrada += "3"
            teito.text = entrada

        }
        n4.setOnClickListener {
            entrada += "4"
            teito.text = entrada

        }
        n5.setOnClickListener {
            entrada += "5"
            teito.text = entrada

        }
        n6.setOnClickListener {
            entrada += "6"
            teito.text = entrada

        }
        n7.setOnClickListener {
            entrada += "7"
            teito.text = entrada

        }
        n8.setOnClickListener {
            entrada += "8"
            teito.text = entrada

        }
        n9.setOnClickListener {
            entrada += "9"
            teito.text = entrada

        }
        n0.setOnClickListener {
            entrada += "0"
            teito.text = entrada

        }
        bSum.setOnClickListener {
            entrada += "+"
            teito.text = entrada

        }
        bSus.setOnClickListener {
            entrada += "-"
            teito.text = entrada

        }
        bTimes.setOnClickListener {
            entrada += "x"
            teito.text = entrada

        }
        bDiv.setOnClickListener {
            entrada += "/"
            teito.text = entrada

        }
        bEq.setOnClickListener {
            for (k in entrada){

                if (k == '+'){
                    num1 = first.toInt()
                    op = '+'

                }

                when(k){
                    '1' -> first += "1"
                    '2' -> first += "2"
                    '3' -> first += "3"
                    '4' -> first += "4"
                    '5' -> first += "5"
                    '6' -> first += "6"
                    '7' -> first += "7"
                    '8' -> first += "8"
                    '9' -> first += "9"
                    '0' -> first += "0"
                    '+' -> {
                        num1 = first.toInt()
                        op = '+'
                        first=""
                    }
                    '-' -> {
                        num1 = first.toInt()
                        op = '-'
                        first=""
                    }
                    'x' -> {
                        num1 = first.toInt()
                        op = 'x'
                        first=""
                    }
                    '/' -> {
                        num1 = first.toInt()
                        op = '/'
                        first=""
                    }


                }
            }
            when(op){
                '+' -> {
                    var res = (num1 + first.toInt())
                    teito.text = res.toString()
                }
                '-' -> {
                    var res = (num1 - first.toInt())
                    teito.text = res.toString()
                }
                'x' -> {
                    var res = (num1 * first.toInt())
                    teito.text = res.toString()
                }
                '/' -> {
                    var res = (num1.toDouble() / first.toDouble()).toDouble()
                    teito.text = res.toString()
                }

            }
            entrada = ""
            num1 = 0
            first = ""

        }

    }


}