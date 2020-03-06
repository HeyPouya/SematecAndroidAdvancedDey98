package com.sematec.android.advanced.dey98.dgr

import dagger.Component

@Component
interface FactoryComponent {

    fun provideVMFactory():VMFactoryProvider
}