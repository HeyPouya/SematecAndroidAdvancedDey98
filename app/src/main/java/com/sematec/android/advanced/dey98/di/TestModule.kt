package com.sematec.android.advanced.dey98.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class TestModule {

    @Provides
    fun retrofitProvider(): Retrofit {
        return Retrofit.Builder().build()
    }
}