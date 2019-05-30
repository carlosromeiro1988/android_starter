package com.vw.nano.data.user

/**
 * Repository for User
 */
class UserRepository(private val api: IUserService) : IUserRepository {

    /**
     * Executes the login call to backend and retrieves the result accordingly
     * in order to provide the proper feedback to the application
     */
    override fun login(username: String, password: String): Boolean {
        return false
    }
}