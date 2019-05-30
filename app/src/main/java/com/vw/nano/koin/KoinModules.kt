package com.vw.nano.koin

import com.vw.nano.api.ApiInterface
import com.vw.nano.data.carconfiguration.CarConfigurationRepository
import com.vw.nano.data.user.UserRepository
import com.vw.nano.ui.login.LoginViewModel
import org.koin.dsl.module.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Module for ViewModels
 */
val viewModelModule = module {
    factory { LoginViewModel(get()) }
}

/**
 * Module for API objects
 */
const val HOST_URL = "http://host.com"
val apiModule = module {
    single {
        Retrofit.Builder()
            .baseUrl(HOST_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)
    }
}

/**
 * Module for Repositories
 */
val repositoryModule = module {
    single { UserRepository(get()) }
    single { CarConfigurationRepository(get()) }
}