package com.sematec.android.advanced.dey98.rx

import io.reactivex.Observable

class TestRxClass {

    fun getObservable(): Observable<Int> {
        return Observable.just(2, 5, 1, 4, 3)
    }

}