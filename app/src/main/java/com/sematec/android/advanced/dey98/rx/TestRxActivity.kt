package com.sematec.android.advanced.dey98.rx

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.R
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlin.random.Random

class TestRxActivity : AppCompatActivity() {
    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_rx)


//        Observable
//            .just("Bakhtiari", "Rahmati", "Ghafouri", "Masoudi")
//            .map {it.first() }
//            .sorted()
//            .skipWhile { it < 'F' }
//            .last('R')
//            .subscribe({
//                Log.d("TAG", it.toString())
//            },
//                {
//                    Log.d("TAG", it.message)
//                })

        val trc = TestRxClass()

        trc.getObservable()
            .map { it * 50 }
            .filter { it < 200 }
            .skip(1)
            .sorted()
            .subscribe({
                Log.d("TAG", it.toString())
            }, {
                Log.d("TAG", it.message)
            })


        //Functional Programming
        Observable
            .just("Bakhtiari", "Rahmati", "Ghafouri", "Masoudi", "Vermoue", "MehdiZade")
            .map { it.first() }
            .map { it to Random.nextInt(100) }
            .sorted { o1, o2 -> o1.second.compareTo(o2.second) }
            .map { it.first }
            .skip(1)
            .take(2)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                Log.d("TAG", it.toString())
            }, {
                Log.d("TAG", it.message)
            })


    }


}