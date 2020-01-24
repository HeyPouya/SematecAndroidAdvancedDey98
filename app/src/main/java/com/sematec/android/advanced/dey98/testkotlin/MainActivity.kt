package com.sematec.android.advanced.dey98.testkotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.R
import com.sematec.android.advanced.dey98.TestRecyclerClickListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TestRecyclerClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast()

        val list = arrayListOf("Ali", "Qoli", "Mamad", "Saeed", "Farhad", "Roqaye")

        val valList = ArrayList<String>()
        valList.add("alksdalks")

        val adapter = TestKotlinRecyclerAdapter(list, this)
        recycler.adapter = adapter

        // Mutable and immutable
        var number = 10
        number = 11

        val age = 30
//        age = 31

        val a = "Ali"


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

    override fun onClick(name: String) {
        Toast.makeText(this, name, Toast.LENGTH_LONG).show()
    }

}
