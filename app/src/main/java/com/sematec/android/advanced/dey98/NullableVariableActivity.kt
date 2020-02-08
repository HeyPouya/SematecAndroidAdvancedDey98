package com.sematec.android.advanced.dey98

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NullableVariableActivity : AppCompatActivity() {

    var number: Int? = null
    val age = 20

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nullable_variable)


        if (number != null) {
            Toast.makeText(this, number!!, Toast.LENGTH_LONG).show()
        }

        //safe call
        //if(number!=null)
        number?.toLong()

        number?.let { Toast.makeText(this, it, Toast.LENGTH_LONG).show() }


        // elvis operator

        var a = number ?: -1


        var b = if (age < 50) "Young" else "Old"


        var c = when (age) {
            in 1..10 -> {
                "kid"
            }
            in 11..20 -> {
                "teen"
            }
            30, 31, 32 -> {
                "young"
            }
            else -> {
                "old"
            }
        }

        val list = arrayListOf("Ali", "Mamad", "Qoli", "Akbar", "Saeed")

        for (i in list) {
            Log.d("TAG", i)
        }

        list.forEach {
           Log.d("TAG",it)
        }

        //for
        for (i in 0..10) {
            Log.d("TAG", i.toString())
        }

    }

    fun ageChecker(age: Int) = when (age) {
        in 1..10 -> "kid"
        in 11..20 -> "teen"
        in 21..50 -> "young"
        else -> "old"
    }
}
