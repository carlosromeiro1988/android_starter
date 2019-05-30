package com.vw.nano.koin

import com.vw.nano.data.user.UserApi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Module for API objects
 */
const val HOST_URL = "http://host.com"
val apiModule = module {
    //Retrofit instance
    single {
        Retrofit.Builder()
            .baseUrl(HOST_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    //Creator for Api Interfaces
    single { get<Retrofit>().create(UserApi::class.java) }
    single { get<Retrofit>().create(CarConfigurationApi::class.java) }
}