package com.vw.nano.koin

import com.vw.nano.api.ApiInterface
import com.vw.nano.ui.login.LoginViewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Module for ViewModels
 */
val viewModelModule = module {
    factory { LoginViewModel() }
}

/**
 * Module for API objects
 */
val apiModule = module {
    single {
        Retrofit.Builder()
            .baseUrl("host")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}