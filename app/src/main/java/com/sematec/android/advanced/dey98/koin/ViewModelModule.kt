package com.sematec.android.advanced.dey98.koin

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val vmModule = module {
    viewModel { TestKoinViewModel(get()) }
}