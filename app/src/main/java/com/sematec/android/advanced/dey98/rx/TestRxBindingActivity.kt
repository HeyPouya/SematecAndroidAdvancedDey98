package com.sematec.android.advanced.dey98.rx

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jakewharton.rxbinding3.widget.textChanges
import com.sematec.android.advanced.dey98.R
import kotlinx.android.synthetic.main.activity_test_rx_binding.*
import java.util.concurrent.TimeUnit

class TestRxBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_rx_binding)


        edtLocation
            .textChanges()
            .filter {
                it.length > 2
            }
            .debounce(1, TimeUnit.SECONDS)
            .subscribe({
                Log.d("TAG", it.toString())
            }, {
                Log.d("TAG", it.message)
            })

    }
}