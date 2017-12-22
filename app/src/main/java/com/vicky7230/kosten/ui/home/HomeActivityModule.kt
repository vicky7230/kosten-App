package com.vicky7230.kosten.ui.home

import android.app.Application

import com.vicky7230.kosten.data.DataManager
import com.vicky7230.kosten.ui.ViewModelFactory

import dagger.Module
import dagger.Provides
import io.reactivex.disposables.CompositeDisposable

/**
 * Created by vicky on 21/12/17.
 */
@Module
class HomeActivityModule {

    @Provides
    internal fun provideViewModelFactory(application: Application, dataManager: DataManager, compositeDisposable: CompositeDisposable): ViewModelFactory {
        return ViewModelFactory.getInstance(application, dataManager, compositeDisposable)
    }

}
