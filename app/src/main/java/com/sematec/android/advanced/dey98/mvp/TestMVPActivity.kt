package com.sematec.android.advanced.dey98.mvp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.R
import kotlinx.android.synthetic.main.activity_test_mvp.*

/**
 * View
 */
class TestMVPActivity : AppCompatActivity(), Contract.View {

    private val presenter : Contract.Presenter = TestPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_mvp)

        btnLogin.setOnClickListener {
            presenter.onLoginButtonClicked()
        }
    }

    override fun getUserName() = edtName.text.toString()

    override fun getPass() = edtPass.text.toString()

    override fun showSuccess() = Toast.makeText(this, "OK", Toast.LENGTH_LONG).show()

    override fun showError() = Toast.makeText(this, "Nokey", Toast.LENGTH_LONG).show()

    override fun getUserPass(): Pair<String, String> {
        val userName = getUserName()
        val password = getPass()

        return userName to password
    }
}
