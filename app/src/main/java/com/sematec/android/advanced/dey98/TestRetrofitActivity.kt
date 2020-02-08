package com.sematec.android.advanced.dey98

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.sematec.android.advanced.dey98.pojo.AladhanResponseModel
import com.sematec.android.advanced.dey98.retrofit.RetrofitInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TestRetrofitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_retrofit)


        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.aladhan.com/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        val timingInterface = retrofit.create(RetrofitInterface::class.java)


        timingInterface.getTimings("Tehran", "Iran", 8)
            .enqueue(object : Callback<AladhanResponseModel> {

                override fun onFailure(call: Call<AladhanResponseModel>, t: Throwable) {
                    Log.d("TAG", t.message)
                }

                override fun onResponse(
                    call: Call<AladhanResponseModel>,
                    response: Response<AladhanResponseModel>
                ) {
                    Log.d("TAG", response.body()?.data?.timings?.Maghrib)
                }

            })

    }
}
