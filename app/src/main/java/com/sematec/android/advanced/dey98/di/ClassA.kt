package com.sematec.android.advanced.dey98.di

import retrofit2.Retrofit
import javax.inject.Inject

/**
 * Constructor injection
 */
class ClassA @Inject constructor(b: ClassB, retrofit: Retrofit)