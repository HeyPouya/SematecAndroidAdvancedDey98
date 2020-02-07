package com.sematec.android.advanced.dey98

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class TestFunctionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_function)

        printPerson("Mamad", "Mamadi")
        printPerson("Keyvan", "Keyvani")
        printPerson("Yadollah", "Yadollahi")
        printPerson("Roqaye", "Roqayedoost", "Iraqi")

    }


    fun printPerson(name: String, family: String, nationality: String = "Iranian") {
        Log.d("TAG", name + family + nationality)
    }
}
