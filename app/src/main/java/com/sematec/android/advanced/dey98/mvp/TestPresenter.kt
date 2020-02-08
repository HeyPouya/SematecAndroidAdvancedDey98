package com.sematec.android.advanced.dey98.mvp

class TestPresenter(private val view: Contract.View) : Contract.Presenter {

    private val model = TestModel(this)

    override fun onLoginButtonClicked() {
        val (userName, pass) = view.getUserPass()
        model.checkUserPass(userName, pass)
    }

    override fun onVerificationResponse(isValid: Boolean) {
        if (isValid)
            view.showSuccess()
        else
            view.showError()
    }
}