package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

fun getArgs (arg1: EditText, arg2: EditText): Array<Int> {
    val a1 = arg1.text.toString()
    val a2 = arg2.text.toString()

    return arrayOf(a1.toInt(), a2.toInt())

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var n1: Int
        var n2: Int
        var res: Int

        fun add (v: View) {
            try {
                n1 = getArgs(arg1, arg2)[0]
                n2 = getArgs(arg1, arg2)[1]

                val b1: Int = Integer.parseInt(n1.toString())
                val b2: Int = Integer.parseInt(n2.toString())

                res = b1 + b2
                answer.text = res.toString()

            } catch (e:NumberFormatException) {
                answer.setText(R.string.inp_err)
            }
        }

        fun subtr (v: View) {
            try {
                n1 = getArgs(arg1, arg2)[0]
                n2 = getArgs(arg1, arg2)[1]

                val b1: Int = Integer.parseInt(n1.toString())
                val b2: Int = Integer.parseInt(n2.toString())

                res = b1 - b2
                answer.text = res.toString()

            } catch (e:NumberFormatException) {
                answer.setText(R.string.inp_err)
            }
        }

        fun mul (v: View) {
            try {
                n1 = getArgs(arg1, arg2)[0]
                n2 = getArgs(arg1, arg2)[1]

                val b1: Int = Integer.parseInt(n1.toString())
                val b2: Int = Integer.parseInt(n2.toString())

                res = b1 * b2
                answer.text = res.toString()

            } catch (e:NumberFormatException) {
                answer.setText(R.string.inp_err)
            }
        }

        fun div (v: View) {
            try {
                n1 = getArgs(arg1, arg2)[0]
                n2 = getArgs(arg1, arg2)[1]

                val b1: Int = Integer.parseInt(n1.toString())
                val b2: Int = Integer.parseInt(n2.toString())

                if (b2 == 0) {
                    answer.setText(R.string.div_zero)
                } else {
                    res = b1 / b2
                    answer.text = res.toString()
                }

            } catch (e:NumberFormatException) {
                answer.setText(R.string.inp_err)
            }
        }

        add.setOnClickListener(::add)

        subtr.setOnClickListener(::subtr)

        mul.setOnClickListener(::mul)

        divide.setOnClickListener(::div)

    }
}