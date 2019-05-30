package com.vw.nano.koin

import com.vw.nano.data.carconfiguration.CarConfigurationRepository
import com.vw.nano.data.carconfiguration.ICarConfigurationRepository
import com.vw.nano.data.user.IUserRepository
import com.vw.nano.data.user.UserRepository
import org.koin.dsl.module

/**
 * Module for Repositories
 */
val repositoryModule = module {
    single<IUserRepository> { UserRepository(get()) }
    single<ICarConfigurationRepository> { CarConfigurationRepository(get()) }
}