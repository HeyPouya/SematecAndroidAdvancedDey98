package com.sematec.android.advanced.dey98.koin

import org.koin.dsl.module
import retrofit2.Retrofit

val classAModule = module {

    single { ClassB() }
    single { Retrofit.Builder().baseUrl("https://pouyaheydari.com").build() }
    single { ClassA(get(), get()) }
}