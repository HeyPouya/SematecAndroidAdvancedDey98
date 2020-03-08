package com.sematec.android.advanced.dey98.base

import android.app.Application
import com.sematec.android.advanced.dey98.koin.classAModule
import com.sematec.android.advanced.dey98.koin.vmModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BaseApplication)
            modules(classAModule,vmModule)
        }
    }
}