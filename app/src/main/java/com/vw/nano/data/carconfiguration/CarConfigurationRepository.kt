package com.vw.nano.data.carconfiguration

import com.vw.nano.data.user.UserApi

/**
 * Repository for CarConfiguration
 * Since we don't have Local Storage, we just wraps the API calls
 */
class CarConfigurationRepository(private val api: UserApi) : ICarConfigurationRepository {
}