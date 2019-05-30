package com.vw.nano

import android.app.Application
import com.vw.nano.koin.apiModule
import com.vw.nano.koin.repositoryModule
import com.vw.nano.koin.viewModelModule
import org.koin.android.ext.android.startKoin
import org.koin.log.EmptyLogger

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
        startKoin(
            androidContext = this,
            logger = EmptyLogger(),
            modules = listOf(viewModelModule, apiModule, repositoryModule)
        )
    }
}