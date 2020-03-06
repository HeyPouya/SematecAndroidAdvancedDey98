package com.sematec.android.advanced.dey98.di

import dagger.Component

@Component(modules = [TestModule::class])
interface TestComponent {

    fun provideClassA(): ClassA
}