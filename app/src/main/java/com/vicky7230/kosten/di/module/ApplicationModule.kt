package com.vicky7230.kosten.di.module

import android.content.Context
import javax.inject.Singleton
import dagger.Provides
import com.vicky7230.kosten.di.BaseUrl
import io.reactivex.disposables.CompositeDisposable
import com.google.gson.Gson
import com.vicky7230.kosten.KostenApplication
import com.vicky7230.kosten.data.Config
import com.vicky7230.kosten.di.ApplicationContext
import dagger.Module


/**
 * Created by vicky on 19/12/17.
 */
@Module
class ApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(kostenApplication: KostenApplication): Context {
        return kostenApplication.getApplicationContext()
    }

    @Provides
    internal fun provideGson(): Gson {
        return Gson()
    }

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    @BaseUrl
    internal fun provideBaseUrl(): String {
        return Config.BASE_URL
    }

    @Provides
    @Singleton
    internal fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }

    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper {
        return appApiHelper
    }

    @Provides
    @Singleton
    internal fun providePreferencesHelper(appPreferencesHelper: AppPreferencesHelper): PreferencesHelper {
        return appPreferencesHelper
    }
}