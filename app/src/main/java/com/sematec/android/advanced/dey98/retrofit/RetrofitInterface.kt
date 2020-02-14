package com.sematec.android.advanced.dey98.retrofit

import com.sematec.android.advanced.dey98.pojo.AladhanResponseModel
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitInterface {

    @GET("timingsByCity")
    fun getTimings(
        @Query("city") city: String,
        @Query("country") country: String,
        @Query("method") method: Int
    ) : Observable<AladhanResponseModel>
}