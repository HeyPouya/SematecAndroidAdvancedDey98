package com.sematec.android.advanced.dey98.mvp

class TestModel(private val presenter: Contract.ParentPresenter) {

    fun checkUserPass(user: String, pass: String) {
        if (user == "Pouya" && pass == "123")
            (presenter as Contract.Presenter).onVerificationResponse(true)
        else
            (presenter as Contract.Presenter).onVerificationResponse(false)
    }
}