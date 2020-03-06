package com.sematec.android.advanced.dey98.mvvm

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sematec.android.advanced.dey98.R
import kotlinx.android.synthetic.main.activity_test_mvvm.*

class TestMVVMActivity : AppCompatActivity() {

    lateinit var viewModel: TestViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvvm)

        viewModel = ViewModelProvider(this).get(TestViewModel::class.java)

        btnSave.setOnClickListener {
            viewModel.userName = "Some Text"
        }

        txtName.text = viewModel.userName




        viewModel.userResponse.observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
            Log.d("TAG", it)
        })

        viewModel.errorResponse.observe(this, Observer {
            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
        })

        viewModel.getUserData(1)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "DESTROYED!")
    }
}