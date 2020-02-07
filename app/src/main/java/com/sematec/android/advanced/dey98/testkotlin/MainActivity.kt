package com.sematec.android.advanced.dey98.testkotlin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast()


        val list = arrayListOf("Ali", "Qoli", "Mamad", "Saeed", "Farhad", "Roqaye")

        val valList = ArrayList<String>()
        valList.add("alksdalks")


        //lambda
        //higher order function

        val adapter = TestKotlinRecyclerAdapter(list) {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        }

        recycler.adapter = adapter


        // Mutable and immutable
        var number = 10
        number = 11

        val age = 30
//        age = 31


        var loggerFunction: (Int, String) -> Unit = { age, name ->
            Log.d("TAG", age.toString())
        }

        agePrinter(40, loggerFunction)

        sum {

        }

        recycler.setOnClickListener {
        }

    }

    fun showToast() {
        Toast.makeText(this, "askdjalks", Toast.LENGTH_LONG).show()
    }

    fun showToast(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }

    fun incrementByOne(number: Int): Int {
        return number + 1
    }

    fun someFunction(a: Int): Int {
        return a
    }

    fun anotherFunction() = 10


    fun agePrinter(age: Int, logger: (Int, String) -> Unit) {
        logger(age, "Pouya")
    }

    fun sum(lambdaFun: () -> Unit) {

    }
}
