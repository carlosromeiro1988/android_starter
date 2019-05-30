package com.vw.nano

import android.app.Application
import org.koin.core.Koin

/**
 * Custom Application Class
 */
class NanoApplication : Application() {

    /**
     * OnCreate
     */
    override fun onCreate() {
        super.onCreate()

        Koin.create().
    }
}