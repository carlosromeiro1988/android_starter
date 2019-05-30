package com.vw.nano.data.user

interface IUserRepository {
    fun login(username: String, password: String) : Boolean
}