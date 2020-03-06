package com.sematec.android.advanced.dey98.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TestLiveDataViewModel : ViewModel() {

    private val data = MutableLiveData<String?>()

    fun setData(s: String) {
        data.value = s
        data.value = null
    }

    fun getLiveData(): LiveData<String?> = data

}