package com.sematec.android.advanced.dey98.livedata

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sematec.android.advanced.dey98.R
import kotlinx.android.synthetic.main.activity_test_live_data.*

class TestLiveDataActivity : AppCompatActivity() {

    lateinit var viewModel: TestLiveDataViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_live_data)

        viewModel = ViewModelProvider(this).get(TestLiveDataViewModel::class.java)

        btnSave.setOnClickListener {
            viewModel.setData("Some Data")
        }


        viewModel.getLiveData().observe(this, Observer {
            if (it != null)
                Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        })


    }
}