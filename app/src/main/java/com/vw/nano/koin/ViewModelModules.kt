package com.vw.nano.koin

import com.vw.nano.ui.login.LoginViewModel
import org.koin.dsl.module

/**
 * Module for ViewModels
 */
val viewModelModule = module {
    factory { LoginViewModel(get()) }
}