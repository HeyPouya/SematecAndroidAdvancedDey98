package com.sematec.android.advanced.dey98.dgr

import io.reactivex.Observable
import javax.inject.Inject


class Network @Inject constructor() {

    fun getName() = Observable.just("Pouya")
}