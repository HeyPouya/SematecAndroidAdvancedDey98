package com.sematec.android.advanced.dey98

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.retrofit.RetrofitInterface
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class TestRetrofitActivity : AppCompatActivity() {

    val disposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_retrofit)


        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.aladhan.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()


        val timingInterface = retrofit.create(RetrofitInterface::class.java)


        disposable.add(
            timingInterface.getTimings("Tehran", "Iran", 8)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    Log.d("TAG", it.data.timings.Maghrib)
                }, {
                    Log.d("TAG", it.message)
                })
        )

    }

    override fun onDestroy() {

        //outOfMemoryException
        //memory leak + GC
        disposable.dispose()
        super.onDestroy()
    }
}
