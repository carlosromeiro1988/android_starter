package com.vw.nano

import android.app.Application
import com.vw.nano.koin.apiModule
import com.vw.nano.koin.repositoryModule
import com.vw.nano.koin.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.logger.EmptyLogger

/**
 * Custom Application Class
 */
class NanoApplication : Application() {

    /**
     * OnCreate
     */
    override fun onCreate() {
        super.onCreate()

        //Init Koin
        startKoin {
            androidContext(this@NanoApplication)
            modules(listOf(viewModelModule, apiModule, repositoryModule))
            logger(EmptyLogger())
        }
    }
}