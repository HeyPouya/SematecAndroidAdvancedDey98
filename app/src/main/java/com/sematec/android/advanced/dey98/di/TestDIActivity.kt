package com.sematec.android.advanced.dey98.di

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.R

class TestDIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_d_i)

        /**
         * Instead, you can use di frameworks

        val e = ClassE()
        val d = ClassD(e)
        val c = ClassC()
        val b = ClassB(c,d)
        val a = ClassA(b)
         */


        val a = DaggerTestComponent.create().provideClassA()

    }
}