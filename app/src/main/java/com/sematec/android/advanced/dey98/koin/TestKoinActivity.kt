package com.sematec.android.advanced.dey98.koin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.R
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

//a
class TestKoinActivity : AppCompatActivity() {

    //b
    private val classA: ClassA by inject()
    val vm: TestKoinViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_koin)

        Log.d("TAG", classA.getName())
    }
}