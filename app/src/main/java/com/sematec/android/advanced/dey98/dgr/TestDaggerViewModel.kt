package com.sematec.android.advanced.dey98.dgr

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

class TestDaggerViewModel(private val network: Network) : ViewModel() {

    private val liveData = MutableLiveData<String>()
    private val disposable = CompositeDisposable()

    fun getLiveData(): LiveData<String> = liveData

    fun getName() {
        disposable.add(
            network.getName()
                .subscribe({
                    liveData.value = it
                }, {
                    Log.d("TAG", it.message)
                })
        )
    }

    override fun onCleared() {
        disposable.dispose()
        super.onCleared()
    }
}