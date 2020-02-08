package com.sematec.android.advanced.dey98.mvp

interface Contract {

    interface View {
        fun getUserName(): String
        fun getPass(): String
        fun showSuccess()
        fun showError()
        fun getUserPass(): Pair<String, String>
    }

    interface Presenter : ParentPresenter {
        fun onLoginButtonClicked()
        fun onVerificationResponse(isValid: Boolean)
    }


    interface ParentPresenter {

    }
}