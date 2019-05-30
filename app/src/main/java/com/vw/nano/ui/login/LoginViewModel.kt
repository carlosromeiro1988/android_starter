package com.vw.nano.ui.login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.vw.nano.data.user.IUserRepository

/**
 * ViewModel for Login
 */
class LoginViewModel(private val userRepository: IUserRepository) : ViewModel() {

    val username = MutableLiveData<String>()

    val password = MutableLiveData<String>()

    val loginWasSuccessful = MutableLiveData<Boolean>()

    fun login() {
        if ((username.value.isNullOrBlank()) ||
            (password.value.isNullOrBlank())) {
            loginWasSuccessful.value = false
            return
        }

        loginWasSuccessful.value = userRepository.login(username.value ?: "", password.value ?: "")
    }
}