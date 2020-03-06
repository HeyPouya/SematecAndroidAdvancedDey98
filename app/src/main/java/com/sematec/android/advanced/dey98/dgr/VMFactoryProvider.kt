package com.sematec.android.advanced.dey98.dgr

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import javax.inject.Inject

class VMFactoryProvider @Inject constructor(val network: Network) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        when {
            modelClass.isAssignableFrom(TestDaggerViewModel::class.java) ->
                return TestDaggerViewModel(network) as T

            else -> throw IllegalArgumentException("ViewModel Is not provided")
        }
    }
}