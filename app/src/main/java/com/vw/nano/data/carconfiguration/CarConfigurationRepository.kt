package com.vw.nano.data.carconfiguration

import com.vw.nano.data.user.IUserService

/**
 * Repository for CarConfiguration
 * Since we dont have Local Storage, we just wraps the API calls
 */
class CarConfigurationRepository(private val api: IUserService) {
}