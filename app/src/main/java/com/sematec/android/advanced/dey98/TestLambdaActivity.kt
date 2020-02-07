package com.sematec.android.advanced.dey98

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class TestLambdaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_lambda)

        Log.d("TAG", "09123456789".isValidMobileNumber().toString())

    }

    fun showAlert(title: String, message: String, pb: () -> Unit, nb: () -> Unit) {
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(message)
            .setPositiveButton("Yes") { dialog, witch ->
                pb()
            }
            .setNegativeButton("No") { dialog, witch ->
                nb()
            }
    }
}
