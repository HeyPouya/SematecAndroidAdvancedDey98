package com.sematec.android.advanced.dey98.mvvm

import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import java.util.concurrent.TimeUnit


class TestModel {

    fun getUser(id: Int) =
        Observable
            .just("Pouya", "Ali", "Saman", "Belgheis")
            .delay(1,TimeUnit.SECONDS)

}