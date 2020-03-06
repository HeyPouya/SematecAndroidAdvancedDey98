package com.sematec.android.advanced.dey98.mvvm

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable

class TestViewModel : ViewModel() {

    private val model = TestModel()
    private val disposable = CompositeDisposable()
    var userName = ""

    val userResponse = MutableLiveData<String>()
    val errorResponse = MutableLiveData<String>()

    fun getUserData(id: Int) {
        disposable.add(
            model.getUser(id)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    userResponse.value = it
                    Log.d("TAG", it)
                }, {
                    Log.d("TAG", it.message)
                    errorResponse.value = "Something Happened!"
                })
        )
    }

    override fun onCleared() {
        disposable.dispose()
        super.onCleared()
    }
}