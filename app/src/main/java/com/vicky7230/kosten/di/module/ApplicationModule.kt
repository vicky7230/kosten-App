package com.vicky7230.kosten.di.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.vicky7230.kosten.KostenApplication
import com.vicky7230.kosten.data.AppDataManager
import com.vicky7230.kosten.data.Config
import com.vicky7230.kosten.data.DataManager
import com.vicky7230.kosten.data.db.AppDbHelper
import com.vicky7230.kosten.data.db.DbHelper
import com.vicky7230.kosten.data.db.room.AppDatabase
import com.vicky7230.kosten.data.network.ApiHelper
import com.vicky7230.kosten.data.network.AppApiHelper
import com.vicky7230.kosten.data.prefs.AppPreferencesHelper
import com.vicky7230.kosten.data.prefs.PreferencesHelper
import com.vicky7230.kosten.di.ApplicationContext
import com.vicky7230.kosten.di.BaseUrl
import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Singleton


/**
 * Created by vicky on 19/12/17.
 */
@Module
class ApplicationModule {

    @Provides
    @ApplicationContext
    internal fun provideContext(kostenApplication: KostenApplication): Context {
        return kostenApplication.applicationContext
    }

    @Provides
    internal fun provideApplication(kostenApplication: KostenApplication): Application {
        return kostenApplication
    }

    @Provides
    internal fun provideCompositeDisposable(): CompositeDisposable {
        return CompositeDisposable()
    }

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, Config.DB_NAME).build()
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
    internal fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper {
        return appDbHelper
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