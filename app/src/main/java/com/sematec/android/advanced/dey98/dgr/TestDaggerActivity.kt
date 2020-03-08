package com.sematec.android.advanced.dey98.dgr

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.sematec.android.advanced.dey98.R
import com.sematec.android.advanced.dey98.base.BaseActivity

class TestDaggerActivity : BaseActivity() {

    lateinit var viewModel: TestDaggerViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_dagger)

        val factory = DaggerFactoryComponent.create().provideVMFactory()
        viewModel = ViewModelProvider(this, factory).get(TestDaggerViewModel::class.java)
    }
}